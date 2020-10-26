package test.br.ies.aula.alpoo.jogo.oito;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

import br.ies.aula.alpoo.jogo.oito.JogoOito;

public class TesteJogoOito {
	private JogoOito jogoOito;
	
	@Before
	public void setUP() {
		jogoOito = new JogoOito();
	}
	
	@Test
	public void Teste() {
		int[][] testeTabuleiro = new int[][] { { 5, 7, 2 }, { 1, 0, 3 }, { 8, 4, 6 } };
		assertEquals(testeTabuleiro,jogoOito.obterNumeros());
	}
	
	@Test
	public void TesteBaixo() {
		int[][] testeTabuleiro = new int[][] { { 5, 7, 2 }, { 1, 4, 3 }, { 8, 0, 6 } };
		try {
			jogoOito.mover("DOWN");
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		assertEquals(testeTabuleiro,jogoOito.obterNumeros());
		
	}
	@Test
	public void TesteCima() {
		int[][] testeTabuleiro = new int[][] { { 5, 0, 2 }, { 1, 7, 3 }, { 8, 4, 6 } };
		try {
			jogoOito.mover("UP");
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		assertEquals(testeTabuleiro,jogoOito.obterNumeros());
		
	}
	@Test
	public void TesteDireita() {
		int[][] testeTabuleiro = new int[][] { { 5, 7, 2 }, { 1, 3, 0 }, { 8, 4, 6 } };
		try {
			jogoOito.mover("RIGHT");
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		assertEquals(testeTabuleiro,jogoOito.obterNumeros());
		
	}
	@Test
	public void TesteEsquerda() {
		int[][] testeTabuleiro = new int[][] { { 5, 7, 2 }, { 0, 1, 3 }, { 8, 4, 6 } };
		try {
			jogoOito.mover("LEFT");
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		assertEquals(testeTabuleiro,jogoOito.obterNumeros());
		
	}
}
