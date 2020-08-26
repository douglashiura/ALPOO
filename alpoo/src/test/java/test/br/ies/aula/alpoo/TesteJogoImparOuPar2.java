package test.br.ies.aula.alpoo;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import br.ies.aula.alpoo.jogo.JogoParImpar;

public class TesteJogoImparOuPar2 {
	
	private JogoParImpar parImpar;
	
	@Before
	public void setup() {
		parImpar = new JogoParImpar();
	}
	
	@Test
	public void Impar3() throws Exception {
		int a = Integer.valueOf(3);
		assertEquals("Impar", parImpar.ParOuImpar(a));
	}
	@Test
	public void Par8() throws Exception {
		int a = Integer.valueOf(8);
		assertEquals("Par", parImpar.ParOuImpar(a));
	}
}
