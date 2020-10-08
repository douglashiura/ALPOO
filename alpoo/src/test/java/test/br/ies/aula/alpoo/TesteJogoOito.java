package test.br.ies.aula.alpoo;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

import br.ies.aula.alpoo.JogoOito;
import br.ies.aula.alpoo.entidade.Casa;

public class TesteJogoOito {
	private JogoOito jogo;

	@Before
	public void configuracao() {
		jogo = new JogoOito();
		jogo.iniciarPartida();
	}

	@Test
	public void testeCasa5() throws Exception {
		Casa cinco = new Casa(5);
		assertEquals(Integer.valueOf(5), cinco.getNumero());
	}

	@Test
	public void moverCasa5ParaCimaCasa6EmBranco() throws Exception {
		Casa cinco = new Casa(5);
		Casa seis = new Casa(6);
		seis.setNumero(Integer.valueOf(0));
		cinco.fixaDireita(seis);
		cinco.moverDireita();
		assertEquals(Integer.valueOf(0), cinco.getNumero());
		assertEquals(Integer.valueOf(5), seis.getNumero());
	}
}
