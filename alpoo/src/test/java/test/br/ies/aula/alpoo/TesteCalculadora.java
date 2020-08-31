package test.br.ies.aula.alpoo;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

import br.ies.aula.alpoo.calculadora.Calculadora;

public class TesteCalculadora {
	
private Calculadora calculadora;

	@Before  //executa antes dos testes.
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
		
		calculadora.soma(1,1);
		assertEquals(Float.valueOf(2), calculadora.obterResultado());
	}
	
	@Test
public void multiplicacaoComResultado() throws Exception {		
		calculadora.multiplica(5,3);
		assertEquals(Float.valueOf(15), calculadora.obterResultado());
}
	@Test
	public void divisaoComResultado() throws Exception {		
			calculadora.divide(Float.valueOf(10),Float.valueOf(2));
			assertEquals(Float.valueOf(5), calculadora.obterResultado());
	}
	
	



}
