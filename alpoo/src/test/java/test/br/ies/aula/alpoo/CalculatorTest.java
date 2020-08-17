package test.br.ies.aula.alpoo;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import br.ies.aula.alpoo.calculator.Calculator;

public class CalculatorTest {

	@Test
	public void addWithResult3() {
		Calculator calculator = new Calculator();
		assertEquals(3, calculator.getResult());
	}

}
