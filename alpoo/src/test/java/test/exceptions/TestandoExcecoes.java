package test.exceptions;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import aula.exceptions.AlemDoMaximo;
import aula.exceptions.Calculadora;

public class TestandoExcecoes {

	Calculadora calculadora;
	
	@Before
	public void setup() {
		calculadora = new Calculadora();
	}
	
	@Test
	public void dividindoPorZero() throws Exception {
		calculadora.calcular("/", 5, 0);
		assertEquals(Integer.valueOf(0), calculadora.getRes());
	}
	
	@Test(expected = AlemDoMaximo.class)
	public void multiplicandoAlemDoPermitido() throws Exception {
		calculadora.calcular("*", 1073741823, 3);
	}
	
}
