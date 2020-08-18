package test.br.edu.ies.alpoo;

import org.junit.Test;

import br.edu.ies.alpoo.Calculator;

import static org.junit.Assert.assertEquals;

public class TestOla {
	
	@Test
	public void addWithResult3() {
		Calculator calculator = new Calculator();
		Object expectedValue = 3;
		
		assertEquals(expectedValue, calculator.getResult());
	}
	

}
