package test.br.ies.aula.alpoo;
import static org.junit.Assert.assertEquals;
import org.junit.Test;

import test.br.ies.aula.alpoo.calculator.Calculator;

public class CalculatorTest {
	
	@Test
	public void addWithResult3() {
		Calculator calculator = new Calculator();
		Object expectedValue = 3;
		
		assertEquals(expectedValue, calculator.getResult());
	}
}
