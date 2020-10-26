package test.br.ies.aula.alpoo.parimpar;

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
	public void somaComResultado3() throws Exception {
		calculadora.somar(2, 1);
		assertEquals(Integer.valueOf(3), calculadora.obterResultado());
	}

	@Test
	public void somaComResultado2() throws Exception {
		calculadora.somar(1,  1);
		assertEquals(Integer.valueOf(2), calculadora.obterResultado());
	}
	
	@Test
	public void multiplicarComResultado6() throws Exception {
		calculadora.multiplicar(2, 3);
		assertEquals(Integer.valueOf(6), calculadora.obterResultado());
	}
	
	@Test
	public void dividirComResultado2() throws Exception {
		calculadora.dividir(4, 2);
		assertEquals(Integer.valueOf(2), calculadora.obterResultado());
	}
	
	@Test(expected = ArithmeticException.class)
	public void divisaoPorZero() throws Exception {
		calculadora.dividir(Integer.valueOf(10), Integer.valueOf(0));
	}
	
	@Test
	public void doisPontoCinco() throws Exception {
		calculadora.dividir(5, 2);
		assertEquals(Integer.valueOf(2), calculadora.obterResultado());
	}
	
}
