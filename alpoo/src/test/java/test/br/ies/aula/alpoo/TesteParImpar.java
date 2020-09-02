package test.br.ies.aula.alpoo;

import static org.junit.Assert.assertEquals;
import org.junit.Before;
import org.junit.Test;
import br.ies.aula.alpoo.calculadora.JogoImparPar;

public class TesteParImpar {

	private JogoImparPar jogo;

	@Before
	public void setup() {
		jogo = new JogoImparPar();
	}

	@Test
	public void resultadoPar() {
		Float jogador1 = 2f;
		Float jogador2 = 4f;
		assertEquals("PAR", jogo.calculo(jogador1, jogador2));
	}

	@Test
	public void resultadoImpar() {
		Float jogador1 = 3f;
		Float jogador2 = 4f;
		assertEquals("IMPAR", jogo.calculo(jogador1, jogador2));
	}
}
