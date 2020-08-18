package test.br.ies.aula.alpoo;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import br.ies.aula.alpoo.calculadora.Calculadora;

public class TesteCalculadora {
	
	private Calculadora calculadora;
	
	@Before
	public void setUp() {
		calculadora = new Calculadora();
	}
	
	@Test
	public void somaComResultado3() throws Exception {
		calculadora.soma(2.0, 1.0);
		assertEquals(Double.valueOf(3.0), calculadora.getResultado());
	}

	@Test
	public void somaComResultado2() throws Exception {
		calculadora.soma(1.0,  1.0);
		assertEquals(Double.valueOf(2.0), calculadora.getResultado());
	}
	
	@Test
	public void multiplicarComResultado6() throws Exception {
		calculadora.multiplicar(2.0, 3.0);
		assertEquals(Double.valueOf(6.0), calculadora.getResultado());
	}
	
	@Test
	public void dividirComResultado2() throws Exception {
		calculadora.dividir(4.0, 2.0);
		assertEquals(Double.valueOf(2.0), calculadora.getResultado());
	}
	
}
