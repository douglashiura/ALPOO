package br.ies.main.tabuleiro;

public class ControleDoTabuleiro {

	private Tabuleiro tabuleiro;

	public ControleDoTabuleiro(Tabuleiro tabuleiro) {
		this.setTabuleiro(tabuleiro);
	}

	public Tabuleiro getTabuleiro() {
		return tabuleiro;
	}

	public void setTabuleiro(Tabuleiro tabuleiro) {
		this.tabuleiro = tabuleiro;
	}

	public void moverPraCima() {
		tabuleiro.getPonteiro().moverParaCima();
		tabuleiro.setPonteiro(tabuleiro.getPonteiro().getCima());
	}

	public void moverPraBaixo() {
		tabuleiro.getPonteiro().moverParaBaixo();
		tabuleiro.setPonteiro(tabuleiro.getPonteiro().getBaixo());
	}

	public void moverPraEsquerda() {
		tabuleiro.getPonteiro().moverParaEsquerda();
		tabuleiro.setPonteiro(tabuleiro.getPonteiro().getEsquerda());
	}

	public void moverPraDireita() {
		tabuleiro.getPonteiro().moverParaDireita();
		tabuleiro.setPonteiro(tabuleiro.getPonteiro().getDireita());
	}
}
