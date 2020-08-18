package test.br.ies.aula.alpoo;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

import br.ies.aula.alpoo.calculadora.Calculadora;

public class TestCalculator {

	private Calculadora calculadora;

	@Before
	public void setUp() {
		calculadora = new Calculadora();
	}
	
	@Test
	public void sumResult3() {
		calculadora.soma(2,1);
		assertEquals(Integer.valueOf(3),calculadora.obterResultado());
	}
	
	@Test
	public void sumResult2() throws Exception {
		calculadora.soma(1,1);
		assertEquals(Integer.valueOf(2),calculadora.obterResultado());
	}
	
}
