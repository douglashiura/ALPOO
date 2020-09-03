package test.br.ies.aula.alpoo;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertSame;

import org.junit.Before;
import org.junit.Test;

import br.ies.aula.alpoo.parouimpar.JogoParImpar;
import br.ies.aula.alpoo.parouimpar.Results;

public class ParImparTest {
	private JogoParImpar parImpar;
	
	@Before
	public void config() {
		parImpar = new JogoParImpar();
	}
	
	@Test
	public void unico() throws Exception {
		assertSame(JogoParImpar.obterInstancia(), JogoParImpar.obterInstancia());
	}
	
	@Test
	public void cenarioOndeAPrimeiraTelaJogaAntes() throws Exception {
		String nome = "Paulo";
		Results aposta = Results.IMPAR;
		Integer valor = Integer.valueOf(2);
		JogoParImpar.obterInstancia().fixaJogada(nome, aposta, valor);// janela a que chamou
		JogoParImpar.obterInstancia().fixaJogada("Maria", Results.PAR, Integer.valueOf(1));
		assertEquals(Results.IMPAR, JogoParImpar.obterInstancia().parOuImpar());
		assertEquals(Results.IMPAR, JogoParImpar.obterInstancia().parOuImpar());
	}
	
	@Test
	public void par() throws Exception {
		parImpar.fixaJogadas(Integer.valueOf(1), Integer.valueOf(1));
		assertEquals(Results.PAR, parImpar.parOuImpar());
	}

	@Test
	public void impar() throws Exception {
		Integer segundo = Integer.valueOf(1);
		Integer primeiro = Integer.valueOf(2);
		parImpar.fixaJogadas(primeiro, segundo);
		assertEquals(Results.IMPAR, parImpar.parOuImpar());
	}
	
}
