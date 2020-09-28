package test.br.ies.aula.alpoo;

import static org.junit.Assert.assertEquals;
import org.junit.Before;
import org.junit.Test;

import jogo.JogoImparPar;
import jogo.ResultadosDoJogoImparPar;

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
		jogo.definirNum(jogador1);
		jogo.definirNum(jogador2);
		assertEquals(ResultadosDoJogoImparPar.PAR, jogo.calculo());
	}

	@Test
	public void resultadoImpar() {
		Float jogador1 = 3f;
		Float jogador2 = 4f;
		jogo.definirNum(jogador1);
		jogo.definirNum(jogador2);
		assertEquals(ResultadosDoJogoImparPar.IMPAR, jogo.calculo());
	}

	@Test
	public void cenarioOndeApenasUmJogadorJogou() {

	}

	@Test
	public void cenarioOndeAPrimeiraTelaJogaAntes() {
		String nome = "Vinicius";
		String aposta = "IMPAR";
		Float valor = Float.valueOf(2);

		JogoImparPar.obterInstancia().fixaJogada(nome, aposta, valor);

		JogoImparPar.obterInstancia().fixaJogada("Agatha", "PAR", Float.valueOf(1));
		assertEquals(ResultadosDoJogoImparPar.IMPAR, JogoImparPar.obterInstancia().calculo());

	}

}
