package test.br.ies.aula.al.alpoo;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import br.ies.aula.al.alpoo.calculadora.calculadora;

public class TesteCalculadora  {
	
	
	@Test
	public void somaComResultado3() {

		calculadora calculadora = new calculadora();
		assertEquals (3,calculadora.obterResultado1());
	}

}
