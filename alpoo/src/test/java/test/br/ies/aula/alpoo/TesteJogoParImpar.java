package test.br.ies.aula.alpoo;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

import br.ies.aula.alpoo.calculadora.Calculadora;
import br.ies.aula.alpoo.jogo.JogoParImpar;
import test.br.ies.aula.alpoo.jogo.enumResultadosParImpar;

public class TesteJogoParImpar {
	
	private JogoParImpar jogo;
	
	@Before
	public void setUp() {		
		jogo = new JogoParImpar(new Calculadora());
	}
	
	@Test
	public void par() throws Exception {
		jogo.jogar(Double.valueOf(1), Double.valueOf(1));
		assertEquals(enumResultadosParImpar.PAR, jogo.parOuImpar());
	}

	@Test
	public void impar() throws Exception {
		jogo.jogar(Double.valueOf(1), Double.valueOf(2));
		assertEquals(enumResultadosParImpar.IMPAR, jogo.parOuImpar());
	}
	
	
}
