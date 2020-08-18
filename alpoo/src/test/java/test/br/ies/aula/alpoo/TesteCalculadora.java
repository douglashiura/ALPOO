package test.br.ies.aula.alpoo;

import static org.junit.Assert.assertEquals;

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
		assertEquals(Float.valueOf(3),calculadora.obterResultado());
	}
	@Test
	public void SomaComResultado2() throws Exception {
		calculadora.soma(1, 1);
		assertEquals(Float.valueOf(2),calculadora.obterResultado());
	}
	@Test
	public void SubtrairComResultado2() throws Exception {
		calculadora.subtrair(6, 4);
		assertEquals(Float.valueOf(2),calculadora.obterResultado());
	}
	@Test
	public void SubtrairComResultado5() throws Exception {
		calculadora.subtrair(9, 4);
		assertEquals(Float.valueOf(5),calculadora.obterResultado());
	}
	@Test
	public void MultiComResultado10() throws Exception {
		calculadora.multiplica(5, 2);
		assertEquals(Float.valueOf(10),calculadora.obterResultado());
	}
	@Test
	public void MultiComResultado36() throws Exception {
		calculadora.multiplica(6, 6);
		assertEquals(Float.valueOf(36),calculadora.obterResultado());
	}
	@Test
	public void DivideComResultado3() throws Exception {
		calculadora.divide(36, 12);
		assertEquals(Float.valueOf(3),calculadora.obterResultado());
	}
	@Test
	public void DivideComResultado7() throws Exception {
		calculadora.divide(35, 5);
		assertEquals(Float.valueOf(7),calculadora.obterResultado());
	}

}