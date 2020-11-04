package test.br.ies.aula.alpoo.jogo.oito;

import static org.junit.Assert.assertArrayEquals;

import org.junit.Before;
import org.junit.Test;

import br.ies.aula.alpoo.jogo.oito.JogoOito;
import br.ies.aula.alpoo.jogo.oito.modelo.ModeloTabuleiro;

public class TesteJogoOito {
	@Before
	public void setUP() {
		JogoOito.setTabuleiroByID(1);
		JogoOito.setLinha(1);
		JogoOito.setColuna(1);
	}
	
	@Test
	public void Teste() {
		Integer[][] testeTabuleiro = new Integer[][] { { 5, 7, 2 }, { 1, 0, 3 }, { 8, 4, 6 } };
		assertArrayEquals(testeTabuleiro,JogoOito.getTabuleiro());
	}
	
	@Test
	public void TesteBaixo() {
		Integer[][] testeTabuleiro = new Integer[][] { { 5, 7, 2 }, { 1, 4, 3 }, { 8, 0, 6 } };
		JogoOito.mover("DOWN");
		assertArrayEquals(testeTabuleiro,JogoOito.getTabuleiro());
		
	}
	
	@Test
	public void TesteCima() {
		int[][] testeTabuleiro = new int[][] { { 5, 0, 2 }, { 1, 7, 3 }, { 8, 4, 6 } };
		JogoOito.mover("UP");
		assertArrayEquals(testeTabuleiro,JogoOito.getTabuleiro());
		
	}

	@Test
	public void TesteDireita() {
		int[][] testeTabuleiro = new int[][] { { 5, 7, 2 }, { 1, 3, 0 }, { 8, 4, 6 } };
		JogoOito.mover("RIGHT");
		assertArrayEquals(testeTabuleiro,JogoOito.getTabuleiro());
		
	}

	@Test
	public void TesteEsquerda() {
		int[][] testeTabuleiro = new int[][] { { 5, 7, 2 }, { 0, 1, 3 }, { 8, 4, 6 } };
		JogoOito.mover("LEFT");
		System.out.println("a");
		assertArrayEquals(testeTabuleiro,JogoOito.getTabuleiro());
		
	}
	

	@Test
	public void TesteDone() {
		ModeloTabuleiro modeloTabuleiro = new ModeloTabuleiro();
		assertArrayEquals(JogoOito.getTabuleiro(),modeloTabuleiro.obterTabuleiro());
	}
}
