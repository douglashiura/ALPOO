package br.ies.test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.Before;
import org.junit.Test;

import br.ies.main.tabuleiro.ControleDoTabuleiro;
import br.ies.main.tabuleiro.Tabuleiro;

public class TesteDeMovimentacaoDoTabuleiroComOControle {

	private ControleDoTabuleiro controle;

	@Before
	public void setup() {
		controle = new ControleDoTabuleiro(new Tabuleiro());
	}

	@Test
	public void moverPonteiroPraCima() {
		Integer posicaoAcimaPonteiro = controle.getTabuleiro().getPonteiro().getCima().getNumero();
		controle.moverPraCima();
		assertEquals(posicaoAcimaPonteiro, controle.getTabuleiro().getPonteiro().getBaixo().getNumero());
	}

	@Test
	public void moverPonteiroPraEsquerda() {
		Integer posicaoAcimaPonteiro = controle.getTabuleiro().getPonteiro().getEsquerda().getNumero();
		controle.moverPraEsquerda();
		assertEquals(posicaoAcimaPonteiro, controle.getTabuleiro().getPonteiro().getDireita().getNumero());
	}

	@Test
	public void moverPonteiroPraDireita() {
		Integer posicaoAcimaPonteiro = controle.getTabuleiro().getPonteiro().getDireita().getNumero();
		controle.moverPraDireita();
		assertEquals(posicaoAcimaPonteiro, controle.getTabuleiro().getPonteiro().getEsquerda().getNumero());
	}

	@Test
	public void moverPonteiroPraBaixo() {
		Integer posicaoAcimaPonteiro = controle.getTabuleiro().getPonteiro().getBaixo().getNumero();
		controle.moverPraBaixo();
		assertEquals(posicaoAcimaPonteiro, controle.getTabuleiro().getPonteiro().getCima().getNumero());
	}

}
