package test.br.ies.aula.alpoo;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

import br.ies.aula.alpoo.calculadora.Calculadora;

public class TesteCalculadora {


	@Test
	public void somaComResultado3() {
		Calculadora calculadora = new Calculadora();
		assertEquals (3, calculadora.obterResultado());

	}
}
