package br.ies.test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.Before;
import org.junit.Test;

import br.ies.main.tabuleiro.ControleDoTabuleiro;
import br.ies.main.tabuleiro.Tabuleiro;

public class TesteDasCelulasSeMovimentandoParaAsBordas {

	private ControleDoTabuleiro controle;

	@Before
	public void setup() {
		controle = new ControleDoTabuleiro(new Tabuleiro());
	}

	@Test
	public void movimentandoPraBordaDeCima() {
		controle.moverPraCima();
		Integer valorEsperado = controle.getTabuleiro().getPonteiro().getCima().getNumero();
		controle.moverPraCima();
		assertEquals(valorEsperado, controle.getTabuleiro().getPonteiro().getNumero());
	}

	@Test
	public void movimentandoPraBordaDeBaixo() {
		controle.moverPraBaixo();
		Integer valorEsperado = controle.getTabuleiro().getPonteiro().getBaixo().getNumero();
		controle.moverPraBaixo();
		assertEquals(valorEsperado, controle.getTabuleiro().getPonteiro().getNumero());
	}

	@Test
	public void movimentandoPraBordaDeDireita() {
		controle.moverPraDireita();
		Integer valorEsperado = controle.getTabuleiro().getPonteiro().getDireita().getNumero();
		controle.moverPraDireita();
		assertEquals(valorEsperado, controle.getTabuleiro().getPonteiro().getNumero());
	}

	@Test
	public void movimentandoPraBordaDeEsquerda() {
		controle.moverPraEsquerda();
		Integer valorEsperado = controle.getTabuleiro().getPonteiro().getEsquerda().getNumero();
		controle.moverPraEsquerda();
		assertEquals(valorEsperado, controle.getTabuleiro().getPonteiro().getNumero());
	}

}
