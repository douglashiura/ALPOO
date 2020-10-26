package test.br.ies.aula.alpoo.parimpar;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.Test;

import br.ies.aula.alpoo.jogo.parimpar.LojaJogoParImpar;
import br.ies.aula.alpoo.jogo.parimpar.entidade.Aposta;
import br.ies.aula.alpoo.jogo.parimpar.entidade.ResultadosParImpar;

public class TesteJogoParImpar {
	
	private LojaJogoParImpar jogo;
	private OuvinteDeResultadoTeste ouvinteTeste;
	
	@Before
	public void setUp() {
		ouvinteTeste = new OuvinteDeResultadoTeste();
		jogo = new LojaJogoParImpar();
		jogo.iniciarPartida();
		jogo.adicionarOuvinte(ouvinteTeste);
	}
	
	@Test
	public void cenarioOndeAPrimeiraTelaJogaAntes() throws Exception {
		Aposta apostaUm = new Aposta("Muriel", Integer.valueOf(2), ResultadosParImpar.IMPAR);
		Aposta apostaDois = new Aposta("Lucas", Integer.valueOf(1), ResultadosParImpar.PAR);
		jogo.fixarJogada(apostaUm);
		jogo.fixarJogada(apostaDois);
		assertEquals(ResultadosParImpar.IMPAR, ouvinteTeste.obterResultado());
		assertEquals(ResultadosParImpar.IMPAR, ouvinteTeste.obterResultado());
	}

	@Test
	public void umOuvinteDeVitoriaDoJogoSemJogadas() throws Exception {
		jogo.adicionarOuvinte(ouvinteTeste);
		assertFalse(ouvinteTeste.foiAvisado());
	}
	
	@Test
	public void umOuvinteDeVitoriaDoJogo() throws Exception {
		jogo.adicionarOuvinte(ouvinteTeste);
		jogo.fixarJogada(new Aposta("Muriel", Integer.valueOf(2), ResultadosParImpar.IMPAR));
		jogo.fixarJogada(new Aposta("Contra", Integer.valueOf(2), ResultadosParImpar.IMPAR));
		assertTrue(ouvinteTeste.foiAvisado());
	}

	@Test
	public void cenarioOndeApenasUmJogadorJogou() throws Exception {
		Aposta aposta = new Aposta("Muriel", Integer.valueOf(2), ResultadosParImpar.IMPAR);
		jogo.fixarJogada(aposta);
		assertNull(ouvinteTeste.obterResultado());
	}
}
