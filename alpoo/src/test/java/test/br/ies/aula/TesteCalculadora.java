package test.br.ies.aula;

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
		assertEquals(Float.valueOf(3), calculadora.obterResultado());
	}

	@Test
	public void somaComResultado2() throws Exception {
		calculadora.soma(1, 1);
		assertEquals(Float.valueOf(2), calculadora.obterResultado());
	}

	@Test
	public void multcomResultado16() throws Exception {
		calculadora.mult(2, 8);
		assertEquals(Float.valueOf(16), calculadora.obterResultado());
	}

	@Test
	public void divComResultado6() throws Exception {
		calculadora.dividir(12, 2);
	}

	@Test(expected = ArithmeticException.class)
	public void divisaoPorZero() throws Exception {
		calculadora.dividir(Integer.valueOf(1), Integer.valueOf(0));
	}

	@Test
	public void doisPontoCinco() throws Exception {
		calculadora.dividir(5, 2);
		assertEquals(Float.valueOf(2.5f), calculadora.obterResultado());
	}
}
