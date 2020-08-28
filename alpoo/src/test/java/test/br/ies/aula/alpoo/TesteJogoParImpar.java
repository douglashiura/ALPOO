package test.br.ies.aula.alpoo;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

import br.ies.aula.alpoo.jogo.JogoParImpar;
import parimpar.ParImpar;

public class TesteJogoParImpar {
	private JogoParImpar parImpar;
	@Before
	public void configuracao() {
		parImpar = new JogoParImpar();
	}
	@Test
	public void par() throws Exception {
		parImpar.fixaJogadas(Integer.valueOf(1), Integer.valueOf(1));
		assertEquals("PAR", parImpar.parOuImpar());	
	}
	
	@Test
	public void impar() throws Exception {
		Integer segundo = Integer.valueOf(1);
		Integer primeiro = Integer.valueOf(2);
		parImpar.fixaJogadas(primeiro, segundo);
		assertEquals("IMPAR", parImpar.parOuImpar());
	}
	
}
