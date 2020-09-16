package test.br.ies.aula.alpoo;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.Test;

import br.ies.aula.alpoo.jogo.LojaDoJogoParImpar;
import br.ies.aula.alpoo.jogo.entidade.Aposta;
import br.ies.aula.alpoo.jogo.entidade.ResultadosDoJogoParImpar;

public class TesteOJogoParImpar {
	private OuvinteDeResultadoDeTeste ouvinteDeTeste;
	private LojaDoJogoParImpar jogo;

	@Before
	public void configuracao() {
		ouvinteDeTeste = new OuvinteDeResultadoDeTeste();
		jogo = new LojaDoJogoParImpar();
		jogo.adicionarUmOuvinteDeResultado(ouvinteDeTeste);
		jogo.iniciarPartida();
	}

	@Test
	public void cenarioOndeAPrimeiraTelaJogaAntes() throws Exception {
		String nome = "Paulo";
		ResultadosDoJogoParImpar aposta = ResultadosDoJogoParImpar.IMPAR;
		Integer valor = Integer.valueOf(2);
		jogo.fixaJogada(new Aposta(nome, aposta, valor));
		jogo.fixaJogada(new Aposta("Maria", ResultadosDoJogoParImpar.PAR, Integer.valueOf(1)));
		assertEquals(ResultadosDoJogoParImpar.IMPAR, ouvinteDeTeste.parOuImpar().get(0).getAposta());
	}

	@Test
	public void umOuvinteDeVitoriaDoJogoSemJogadas() throws Exception {
		jogo.adicionarUmOuvinteDeResultado(ouvinteDeTeste);
		assertFalse(ouvinteDeTeste.foiAvisado());
	}

	@Test
	public void umOuvinteDeVitoriaDoJogo() throws Exception {
		Aposta vencedora = new Aposta("Do Contra", ResultadosDoJogoParImpar.PAR, 2);
		jogo.adicionarUmOuvinteDeResultado(ouvinteDeTeste);
		jogo.fixaJogada(new Aposta("Douglas", ResultadosDoJogoParImpar.IMPAR, 2));
		jogo.fixaJogada(vencedora);
		assertTrue(ouvinteDeTeste.foiAvisado());
		assertEquals(vencedora, ouvinteDeTeste.parOuImpar().get(0));
		assertEquals(1, ouvinteDeTeste.parOuImpar().size());
	}

	@Test
	public void cenarioOndeApenasUmJogadorJogou() throws Exception {
		String nome = "Paulo";
		ResultadosDoJogoParImpar aposta = ResultadosDoJogoParImpar.IMPAR;
		Integer valor = Integer.valueOf(2);
		jogo.fixaJogada(new Aposta(nome, aposta, valor));
		assertNull(ouvinteDeTeste.parOuImpar());
	}

}
