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
	public void somaComReslutado3() {
		calculadora.soma(2,1);
		assertEquals(Float.valueOf(3), calculadora.obterResultado());
	}
	@Test
	public void somaComResultado2() throws Exception {
		calculadora.soma(1,1);
		assertEquals(Float.valueOf(2), calculadora.obterResultado());
	}
	@Test
	public void multiplicaComResultado15() {
		calculadora.multiplica(3, 5);
		assertEquals(Float.valueOf(15), calculadora.obterResultado());
	}
	@Test
	public void multiplicaComResultado100() {
		calculadora.multiplica(10, 10);
		assertEquals(Float.valueOf(100), calculadora.obterResultado());
	}
	@Test
	public void divideComResultado2() {
		calculadora.divisao(10, 5);
		assertEquals(Float.valueOf(2), calculadora.obterResultado());
	}
	@Test
	public void divideComResultado20() {
		calculadora.divisao(100, 5);
		assertEquals(Float.valueOf(20), calculadora.obterResultado());
	}
	@Test
	public void subtraiComResultado9() {
		calculadora.subtrair(10, 1);
		assertEquals(Float.valueOf(9), calculadora.obterResultado());
	}

}
