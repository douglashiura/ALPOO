package test.br.ies.aula.alpoo;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import br.ies.aula.alpoo.ParouImpar.ParOuImpar;

public class testeParouImpar {
	@Test
	public void par() throws Exception{
		ParOuImpar parImpar = new ParOuImpar();
		parImpar.fixaJogadores(Integer.valueOf(1), Integer.valueOf(1));
		assertEquals("PAR", parImpar.parOuImpar());
	}
	@Test
	public void impar() throws Exception{
		ParOuImpar parImpar = new ParOuImpar();
		Integer segundo = Integer.valueOf(1);
		Integer primeiro = Integer.valueOf(2);
		parImpar.fixaJogadores(primeiro, segundo);
		assertEquals("IMPAR", parImpar.parOuImpar());
	}
	
}
