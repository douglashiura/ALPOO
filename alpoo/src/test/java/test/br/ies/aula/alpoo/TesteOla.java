package test.br.ies.aula.alpoo;

import org.junit.Test;

public class TesteOla {

	
	@Test
	public void ola() {
		Calculadora Calculadora = new Calculadora();
		Object calculadora;
		assertEquals(3, calculadora.obterResultado());
	}
}
