package test.br.ies.aula.alpoo;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import br.ies.aula.alpoo.calculadora.Calculadora;

public class testeOlá {
	@Test
	public void somaComResultado3(){
		Calculadora calculadora = new Calculadora();
		assertEquals(3,calculadora.obterResultado());
	}
}
