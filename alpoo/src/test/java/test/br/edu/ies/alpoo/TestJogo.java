package test.br.edu.ies.alpoo;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

import br.edu.ies.alpoo.JogoParImpar;
import br.edu.ies.alpoo.Resultados;

public class TestJogo {
	private JogoParImpar jogo;
	
	@Before
	public void setUp() {		
		jogo = new JogoParImpar();
	}
	
	@Test
	public void testaJogoPar()  throws Exception {
		Resultados resultado = jogo.setPrimeiroNumero(2).setSegundoNumero(2).getResultado();
		assertEquals(Resultados.PAR, resultado);
	}
	@Test
	public void testaJogoImpar()  throws Exception {
		Resultados resultado = jogo.setPrimeiroNumero(2).setSegundoNumero(1).getResultado();
		assertEquals(Resultados.IMPAR, resultado);
	}
}
