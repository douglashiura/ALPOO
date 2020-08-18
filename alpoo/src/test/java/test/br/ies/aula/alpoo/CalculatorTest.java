package test.br.ies.aula.alpoo;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import br.ies.aula.alpoo.calculator.Calculator;

public class CalculatorTest {
	
	private Calculator calculator;
	
	@Before
	public void setUp() {
		calculator = new Calculator();
	}
	
	@Test
	public void addWithResult3() {
		calculator.add(2, 1);
		assertEquals(Integer.valueOf(3), calculator.getResult());
	}
	@Test
	public void addWithResult2() throws Exception {
		calculator.add(1, 1);
		assertEquals(Integer.valueOf(2), calculator.getResult());
	}

}
