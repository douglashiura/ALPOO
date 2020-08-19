package test.br.edu.ies.alpoo;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

import br.edu.ies.alpoo.JogoParImpar;

public class TestJogo {
	private JogoParImpar jogo;
	
	@Before
	public void setUp() {		
		jogo = new JogoParImpar();
	}
	
	@Test
	public void testaJogoPar()  throws Exception {
		String resultado = jogo.setPrimeiroNumero(2).setSegundoNumero(2).getResultado();
		assertEquals("Par", resultado);
	}
	@Test
	public void testaJogoImpar()  throws Exception {
		String resultado = jogo.setPrimeiroNumero(2).setSegundoNumero(1).getResultado();
		assertEquals("Impar", resultado);
	}
}
