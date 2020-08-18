package test.br.ies.aula.alpoo;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class TesteOla {

	
	@Test
	public void ola() {
		Calculadora Calculadora = new Calculadora();
		Object calculadora;
		assertEquals(3,calculadora.obterResultado());
	}
	@Test
}
moba