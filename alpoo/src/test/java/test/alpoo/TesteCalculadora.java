package test.alpoo;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

import aula.alpoo.calculadora.Calculadora;

public class TesteCalculadora {

	private Calculadora calculadora = new Calculadora();
	
	@Before
	public void setUp() {
		calculadora = new Calculadora();
	}
	
	@Test
	public void somaComResultado1() {
		Object esperado = Float.valueOf(3);
		
		calculadora.soma(2, 1);
		assertEquals(esperado, calculadora.obterResultado());
	}

	@Test
	public void somaComResultado2() {
		Object esperado = Float.valueOf(2);
		
		calculadora.soma(1,1);
		assertEquals(esperado, calculadora.obterResultado());
	}
	
	@Test
	public void multiplicacaoComResultado() {
		Object esperado = Float.valueOf(6);
				
		calculadora.multi(2,3);
		assertEquals(esperado, calculadora.obterResultado());
	}
	
	@Test
	public void divisaoComResultado() {
		Object esperado = Float.valueOf(2);
				
		calculadora.div(4,2);
		assertEquals(esperado, calculadora.obterResultado());
	}

	@Test(expected = ArithmeticException.class)
	public void divisaoPorZero() throws Exception {
		calculadora.div(Integer.valueOf(1), Integer.valueOf(0));
	}
}
