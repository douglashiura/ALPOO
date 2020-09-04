package test.br.ies.aula.alpoo;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.Test;

import br.ies.aula.alpoo.jogo.LojaDoJogoParImpar;
import br.ies.aula.alpoo.jogo.ResultadosDoJogoParImpar;

public class TesteOJogoParImpar {
	private OuvinteDeResultadoDeTeste ouvinteDeTeste;

	@Before
	public void configuracao() {
		ouvinteDeTeste = new OuvinteDeResultadoDeTeste();
		LojaDoJogoParImpar.obterInstancia().adicionarUmOuvinteDeResultado(ouvinteDeTeste);
		LojaDoJogoParImpar.obterInstancia().iniciarPartida();
	}

	@Test
	public void unico() throws Exception {
		assertSame(LojaDoJogoParImpar.obterInstancia(), LojaDoJogoParImpar.obterInstancia());
	}

	@Test
	public void cenarioOndeAPrimeiraTelaJogaAntes() throws Exception {
		String nome = "Paulo";
		ResultadosDoJogoParImpar aposta = ResultadosDoJogoParImpar.IMPAR;
		Integer valor = Integer.valueOf(2);
		LojaDoJogoParImpar.obterInstancia().fixaJogada(nome, aposta, valor);
		LojaDoJogoParImpar.obterInstancia().fixaJogada("Maria", ResultadosDoJogoParImpar.PAR, Integer.valueOf(1));
		assertEquals(ResultadosDoJogoParImpar.IMPAR, ouvinteDeTeste.parOuImpar());
		assertEquals(ResultadosDoJogoParImpar.IMPAR, ouvinteDeTeste.parOuImpar());
	}

	@Test
	public void umOuvinteDeVitoriaDoJogoSemJogadas() throws Exception {
		LojaDoJogoParImpar.obterInstancia().adicionarUmOuvinteDeResultado(ouvinteDeTeste);
		assertFalse(ouvinteDeTeste.foiAvisado());
	}

	@Test
	public void umOuvinteDeVitoriaDoJogo() throws Exception {
		LojaDoJogoParImpar.obterInstancia().adicionarUmOuvinteDeResultado(ouvinteDeTeste);
		LojaDoJogoParImpar.obterInstancia().fixaJogada("Douglas", ResultadosDoJogoParImpar.IMPAR, 2);
		LojaDoJogoParImpar.obterInstancia().fixaJogada("Do Contra", ResultadosDoJogoParImpar.IMPAR, 2);
		assertTrue(ouvinteDeTeste.foiAvisado());
	}

	@Test
	public void cenarioOndeApenasUmJogadorJogou() throws Exception {
		String nome = "Paulo";
		ResultadosDoJogoParImpar aposta = ResultadosDoJogoParImpar.IMPAR;
		Integer valor = Integer.valueOf(2);
		LojaDoJogoParImpar.obterInstancia().fixaJogada(nome, aposta, valor);
		assertNull(ouvinteDeTeste.parOuImpar());
	}

}
