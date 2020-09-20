package test.br.ies.aula.alpoo.calculator;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

import br.ies.aula.alpoo.calculadora.Calculadora;

public class CalculatorTest {

	private Calculadora calculadora;

	@Before
	public void setUp() {
		calculadora = new Calculadora();
	}
	
	@Test
	public void sumResult3() {
		calculadora.soma(2,1);
		assertEquals(Float.valueOf(3),calculadora.obterResultado());
	}
	
	@Test
	public void sumResult2() throws Exception {
		calculadora.soma(1,1);
		assertEquals(Float.valueOf(2),calculadora.obterResultado());
	}
	
	@Test
	public void multResult10() throws Exception {
		calculadora.multi(2,5);
		assertEquals(Float.valueOf(10),calculadora.obterResultado());
	}
	
	@Test
	public void divResult5() throws Exception {
		calculadora.div(10,2);
		assertEquals(Float.valueOf(5),calculadora.obterResultado());
	}
	
	@Test(expected = ArithmeticException.class)
	public void divResult0() throws Exception {
		calculadora.div(1,0);
	}
	
	@Test
	public void divFloat() throws Exception {
		calculadora.div(5,2);
		assertEquals(Float.valueOf(2.5f),calculadora.obterResultado());
	}
	
}
