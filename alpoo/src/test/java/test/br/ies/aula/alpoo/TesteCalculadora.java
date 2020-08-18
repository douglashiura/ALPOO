package test.br.ies.aula.alpoo;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

import br.ies.aula.alpoo.calculadora.Calculadora;

public class TesteCalculadora {
	private Calculadora calc;

	@Before
	public void instancia() {
		calc = new Calculadora();
	}

	@Test
	public void somaIgual() {
		calc.soma(1f, 2f);
		assertEquals(Float.valueOf(3f), calc.obterResultado());
	}

	@Test
	public void divisao() {
		calc.dividir(2f, 1f);
		assertEquals(Float.valueOf(2f), calc.obterResultado());
	}
	/*@Test
	 * refazer throw
	public void dividirZero() {
		calc.dividir(3f, 0f);
		assertEquals(Float.valueOf(2f), calc.obterResultado());
	}*/
	@Test
	public void multi() {
		calc.multiplicar(2f, 4f);
		assertEquals(Float.valueOf(8f), calc.obterResultado());
	}
	@Test
	public void menos() {
		calc.subtrair(4f, 3f);
		assertEquals(Float.valueOf(1), calc.obterResultado());
	}
}
