package test.br.ies.aula.alpoo;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import br.ies.aula.alpoo.parouimpar.JogoParImpar;

public class GameTest {
	
	@Test
	public void par() throws Exception {
		JogoParImpar parImpar = new JogoParImpar();
		parImpar.fixaJogadas(Integer.valueOf(1), Integer.valueOf(1));
		assertEquals("PAR", parImpar.parOuImpar());
	}

	@Test
	public void impar() throws Exception {
		JogoParImpar parImpar = new JogoParImpar();
		Integer segundo = Integer.valueOf(1);
		Integer primeiro = Integer.valueOf(2);
		parImpar.fixaJogadas(primeiro, segundo);
		assertEquals("IMPAR", parImpar.parOuImpar());
	}
	
}
