package test.br.ies.aula.alpoo;

import static org.junit.Assert.assertEquals;
import org.junit.Before;
import org.junit.Test;
import br.ies.aula.alpoo.calculadora.Calculadora;

public class TesteCalculadora{

	private Calculadora calculadora;

	@Before
	public void setUp() {
		calculadora = new Calculadora();
	}

	@Test
	public void somaComResultado3() {
		calculadora.soma(2,1);
		assertEquals(Float.valueOf(3),calculadora.obterResultado());
	}
	@Test
	public void somaComResultado2() throws Exception {
		calculadora.soma(1,1);
		assertEquals(Float.valueOf(2),calculadora.obterResultado());
	}
	
	@Test
	public void multiplicaComResultado1() throws Exception {
		calculadora.multiplica(3,2);
		assertEquals(Float.valueOf(6),calculadora.obterResultado());
	}
	
	@Test
	public void divideComResultado1() throws Exception {
		calculadora.divide(10,2);
		assertEquals(Float.valueOf(5),calculadora.obterResultado());
	}
	
	@Test(expected = ArithmeticException.class)
	public void dividePorZero() throws Exception {
		calculadora.divide(Integer.valueOf(1), Integer.valueOf(0));
	}
	
	@Test
	public void doisPontoCinco() throws Exception {
		calculadora.divide(5, 2);
		assertEquals(Float.valueOf(2.5f),calculadora.obterResultado());
	}
}
