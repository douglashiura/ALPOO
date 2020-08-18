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
		Object esperado = 3;
		
		calculadora.soma(Integer.valueOf(1), Integer.valueOf(2));

		assertEquals(esperado, calculadora.obterResultado());

	}
	
	@Test
	public void somaComResultado2() {
		Object esperado = 2;

		calculadora.soma(Integer.valueOf(1), Integer.valueOf(1));

		assertEquals(esperado, calculadora.obterResultado());

	}
	
	@Test
	public void multiResultado() {
		Object esperado = 4;
		
		calculadora.multi(2, 2);
		
		assertEquals(esperado, calculadora.obterResultado());
	}

}
