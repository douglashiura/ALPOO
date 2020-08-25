package test.br.ies.aula.alpoo.jogo8;


import org.junit.Before;
import org.junit.Test;
import br.ies.aula.alpoo.jogo8.JogoOito;

public class TestJogoOito {

	private JogoOito jogo;
	
	@Before
	public void setUp() {
		jogo = new JogoOito();
	}
	
	@Test
	public void testMoveUp() {
		jogo.moveUp();
	}
	
	@Test
	public void testMoveDown() {
		jogo.moveDown();
	}
	
	@Test
	public void testMoveLeft() {
		jogo.moveLeft();
	}
	
	@Test
	public void testMoveRight() {
		jogo.moveRight();
	}
	
	
	
}
