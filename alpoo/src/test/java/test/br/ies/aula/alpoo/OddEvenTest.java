package test.br.ies.aula.alpoo;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import br.ies.aula.alpoo.oddEven.OddEven;

public class OddEvenTest {
	private OddEven game;
	
	@Before
	public void setUp() {
		game = new OddEven();
	}
	
	@Test
	public void testEven() throws Exception {
		game.setNum1(3);
		game.setNum2(7);
		assertEquals("Par", game.evaluate());
	}
	
	@Test
	public void testOdd() throws Exception {
		game.setNum1(1);
		game.setNum2(2);
		assertEquals("Ímpar", game.evaluate());
	}
	

}
