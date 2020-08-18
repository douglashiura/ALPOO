package test.br.ies.aula.al.alpoo;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import br.ies.aula.al.alpoo.calculadora.calculadora;

public class TesteCalculadora  {
	
	private calculadora calculadora;
	
	@Before
	public void setUp() {
		calculadora = new calculadora();		
	}
	
	@Test
	public void somaComResultado3() {
		calculadora.soma(2,1);
		calculadora calculadora = new calculadora();
		assertEquals (Integer.valueOf(3),calculadora.obterResultado());
	}

	@Test
	public void somaComResultado() throws Exception {
		calculadora.soma(1,1);
		assertEquals(Integer.valueOf(2),calculadora.obterResultado());
	}
}

	