package test.br.ies.aula.alpoo;
import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

import test.br.ies.aula.alpoo.calculator.Calculator;

public class CalculatorTest {
	private Calculator calculator;

	@Before
	public void setUp() {
		calculator = new Calculator();
	}
	
	@Test
	public void addWithResult3() {
		calculator.add(2, 1);
		
		assertEquals(3, calculator.getResult());
	}
	
	@Test
	public void addWithResult2() {
		calculator.add(1, 1);
		
		assertEquals(2, calculator.getResult());
	}
	
	@Test
	public void divisionWithResult2() {
		calculator.division(4, 2);
		
		assertEquals(2, calculator.getResult());
	}
}
