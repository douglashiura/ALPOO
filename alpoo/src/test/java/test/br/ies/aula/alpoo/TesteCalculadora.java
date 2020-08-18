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
	public void somaComResultado3() {
		calculadora.soma(2, 1);
		assertEquals(Float.valueOf(3), calculadora.obterResultado());
	}