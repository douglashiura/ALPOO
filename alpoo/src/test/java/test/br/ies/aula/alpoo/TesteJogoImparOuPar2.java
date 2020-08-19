package test.br.ies.aula.alpoo;

import static org.junit.Assert.*;

import org.junit.Test;

import br.ies.aula.alpoo.jogo.JogoParImpar;

public class TesteJogoImparOuPar2 {
	
	@Test
	public void Impar3() throws Exception {
		int a = Integer.valueOf(3);
		JogoParImpar parImpar = new JogoParImpar();
		assertEquals("Impar", parImpar.ParOuImpar(a));
	}
	@Test
	public void Par8() throws Exception {
		int a = Integer.valueOf(8);
		JogoParImpar parImpar = new JogoParImpar();
		assertEquals("Par", parImpar.ParOuImpar(a));
	}
}
