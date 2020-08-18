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
		assertEquals(Integer.valueOf(3),calculadora.obterResultado());
	}
	@Test
	public void somaComResultado2() throws Exception {
		calculadora.soma(1,1);
		assertEquals(Integer.valueOf(2),calculadora.obterResultado());
	}
	
	@Test
	public void multiplicaComResultado1() {
		calculadora.multiplica(3,2);
		assertEquals(Integer.valueOf(6),calculadora.obterResultado());
	}
	
	@Test
	public void divideComResultado1() {
		calculadora.divide(10,2);
		assertEquals(Integer.valueOf(5),calculadora.obterResultado());
	}
}
