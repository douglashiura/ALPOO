package test.br.edu.ies.alpoo;

import org.junit.Test;
import org.junit.Before;

import br.edu.ies.alpoo.Calculator;

import static org.junit.Assert.assertEquals;


public class TestOla {
	private Calculator calculator;
	
	@Before
	public void setUp() {		
		calculator = new Calculator();
	}
	
	@Test
	public void addWithResult3() throws Exception {
		calculator.soma(1,2);
		assertEquals(Integer.valueOf(3), calculator.getResult());
	}
	
	@Test
	public void somaComResultado2() throws Exception {
		calculator.soma(1,1);
		assertEquals(Integer.valueOf(2), calculator.getResult());
	}
	
	@Test
	public void multiResultado4() throws Exception {
		calculator.multiplica(2,2);
		assertEquals(Integer.valueOf(4), calculator.getResult());
	}
	
	@Test
	public void divResultado4() throws Exception {
		calculator.divide(8,2);
		assertEquals(Integer.valueOf(4), calculator.getResult());
	}

}
