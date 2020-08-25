package test.br.ies.aula.alpoo;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import br.ies.aula.alpoo.eightPuzzle.EightPuzzle;

public class EightPuzzleTest {
	private EightPuzzle game;
	
	@Before
	public void setUp() {
		game = new EightPuzzle();
	}
	
//	@Test
//	public void moveUpTest() throws Exception {
//		int[][] initial = {{6, 2, 7}, {0, 1, 4}, {8, 3, 5}};
//		game.showState();
//		game.moveDown();
//		game.showState();
//	}
	

	@Test
	public void winTest() throws Exception {
		game.moveDown();
		game.moveDown();
		game.moveRight();
		game.moveUp();
		game.moveUp();
		game.moveRight();
		game.moveDown();
		game.moveDown();
		game.moveLeft();
		game.moveUp();
		game.moveUp();
		game.moveRight();
		game.moveDown();
		game.moveLeft();
		game.moveUp();
		game.moveLeft();
		game.moveDown();
		game.moveRight();
		game.moveDown();
		game.moveRight();
				
	}
}
