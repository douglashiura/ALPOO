package test.br.ies.aula.alpoo;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

import br.ies.aula.alpoo.jogo.oito.JogoOito;

public class TesteJogoOito {

	JogoOito jogo;

	@Before
	public void setup() {
		jogo = new JogoOito();
	}

	@Test
	public void moverPracima() {
		jogo.moverPraCima();
		assertEquals(Integer.valueOf(0), jogo.localizacaoNull());
	}

	@Test
	public void moverPraBaixo() {
		jogo.moverPraBaixo();
		assertEquals(Integer.valueOf(3), jogo.localizacaoNull());
	}

	@Test
	public void moverPraDireita() {
		jogo.moverPraDireita();
		assertEquals(Integer.valueOf(1), jogo.localizacaoNull());
	}

	@Test
	public void moverPraEsquerda() {
		jogo.moverPraEsquerda();
		assertEquals(Integer.valueOf(0), jogo.localizacaoNull());
	}
}