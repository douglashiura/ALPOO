package br.ies.test;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

import br.ies.main.celulas.Celula;
import br.ies.main.celulas.CelulaCentral;

public class TesteMovimentaçãoCelulaParaCima {

	private Celula cima;
	private Celula baixo;
	private Celula esquerda;
	private Celula direita;
	private CelulaCentral cellCenter;

	@Before
	public void setup() {
		cima = new Celula(Integer.valueOf(1));
		baixo = new Celula(Integer.valueOf(2));
		esquerda = new Celula(Integer.valueOf(3));
		direita = new Celula(Integer.valueOf(4));

		cellCenter = new CelulaCentral(Integer.valueOf(0));
		cellCenter.setCima(cima);
		cellCenter.setBaixo(baixo);
		cellCenter.setEsquerda(esquerda);
		cellCenter.setDireita(direita);
	}

	@Test
	public void moverZeroPraCima() {
		cellCenter.moverParaCima();

		assertEquals(cima.getNumero(), Integer.valueOf(0));
	}

	@Test
	public void moverZeroPraBaixo() {
		cellCenter.moverParaBaixo();

		assertEquals(baixo.getNumero(), Integer.valueOf(0));
	}

	@Test
	public void moverZeroPraEsquerda() {
		cellCenter.moverParaEsquerda();

		assertEquals(esquerda.getNumero(), Integer.valueOf(0));
	}

	@Test
	public void moverZeroPraDireita() {
		cellCenter.moverParaDireita();

		assertEquals(direita.getNumero(), Integer.valueOf(0));
	}

}
