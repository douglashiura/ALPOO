package test.br.ies.aula.alpoo;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import br.ies.aula.alpoo.calculadora.Calculadora;

public class testeCalculadora {
	
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
	public void somaComResultado2() {
		calculadora.soma(1, 1);
		assertEquals(Float.valueOf(2), calculadora.obterResultado());
	}
	@Test
	public void multiplicaComResultado6() throws Exception{
		calculadora.multiplica(Float.valueOf(3), Float.valueOf(2));
		assertEquals(Float.valueOf(6), calculadora.obterResultado());
	}
	
	@Test(expected = ArithmeticException.class)
	public void divisaoPorZero() throws Exception {
		calculadora.dividir(Integer.valueOf(1),Integer.valueOf(0));
	}
	@Test
	public void doisPontoCinco() throws Exception {
		calculadora.dividir(5, 2);
		assertEquals(Float.valueOf(2.5f),calculadora.obterResultado());
	}
	
}
