package test.br.ies.aula.alpoo;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

import br.ies.aula.alpoo.calculadora.Calculadora;

public class TesteCalculadora {
	
	private Calculadora calculadora;

	@Before
	public void setup() {
		calculadora = new Calculadora();
	}

	@Test
	public void somaComResultado3() {
		Object esperado = 3f;
		
		calculadora.soma(Float.valueOf(1), Float.valueOf(2));

		assertEquals(esperado, calculadora.obterResultado());

	}
	
	@Test
	public void somaComResultado2() {
		Object esperado = 2f;

		calculadora.soma(Float.valueOf(1), Float.valueOf(1));

		assertEquals(esperado, calculadora.obterResultado());

	}
	
	@Test
	public void multiResultado() {
		Object esperado = 4f;
		
		calculadora.multi(Float.valueOf(2), Float.valueOf(2));
		
		assertEquals(esperado, calculadora.obterResultado());
	}
	
	@Test
	public void divResultado() {
		Object esperado = 2f;
		
		calculadora.div(Float.valueOf(4), Float.valueOf(2));
		
		assertEquals(esperado, calculadora.obterResultado());
	}
	
	@Test(expected = ArithmeticException.class)
	public void dividirPorZero() {
		calculadora.div(Float.valueOf(10), Float.valueOf(0));
	}

}
