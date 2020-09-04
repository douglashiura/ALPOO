package test.br.ies.aula.alpoo;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertSame;

import org.junit.Before;
import org.junit.Test;

import br.ies.aula.alpoo.jogo.JogoParImpar;
import br.ies.aula.alpoo.jogo.ResultadosDoJogoParImpar;

public class TesteOJogoParImpar {
	private JogoParImpar parImpar;

	@Before
	public void configuracao() {
		parImpar = new JogoParImpar();
	}

	@Test
	public void par() throws Exception {
		parImpar.fixaJogadas(Integer.valueOf(1), Integer.valueOf(1));
		assertEquals(ResultadosDoJogoParImpar.PAR, parImpar.parOuImpar());
	}

	@Test
	public void impar() throws Exception {
		Integer segundo = Integer.valueOf(1);
		Integer primeiro = Integer.valueOf(2);
		parImpar.fixaJogadas(primeiro, segundo);
		assertEquals(ResultadosDoJogoParImpar.IMPAR, parImpar.parOuImpar());
	}

	@Test
	public void unico() throws Exception {
		assertSame(JogoParImpar.obterInstancia(), JogoParImpar.obterInstancia());
	}

	@Test
	public void cenarioOndeAPrimeiraTelaJogaAntes() throws Exception {
		String nome = "Paulo";
		ResultadosDoJogoParImpar aposta = ResultadosDoJogoParImpar.IMPAR;
		Integer valor = Integer.valueOf(2);
		JogoParImpar.obterInstancia().fixaJogada(nome, aposta, valor);// janela a que chamou
		JogoParImpar.obterInstancia().fixaJogada("Maria", ResultadosDoJogoParImpar.PAR, Integer.valueOf(1));
		assertEquals(ResultadosDoJogoParImpar.IMPAR, JogoParImpar.obterInstancia().parOuImpar());
		assertEquals(ResultadosDoJogoParImpar.IMPAR, JogoParImpar.obterInstancia().parOuImpar());
	}

	@Test
	public void cenarioOndeApenasUmJogadorJogou() throws Exception {
		String nome = "Paulo";
		ResultadosDoJogoParImpar aposta = ResultadosDoJogoParImpar.IMPAR;
		Integer valor = Integer.valueOf(2);
		JogoParImpar.obterInstancia().fixaJogada(nome, aposta, valor);// janela a que chamou
		assertNull(JogoParImpar.obterInstancia().parOuImpar());
	}

}