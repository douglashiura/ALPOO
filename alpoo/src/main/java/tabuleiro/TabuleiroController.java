package tabuleiro;

import movimento.Movimentos;

public class TabuleiroController implements Movimentos{

	private Tabuleiro tabuleiro;
	
	public TabuleiroController(Tabuleiro tab) {
		this.setTabuleiro(tab);
	}

	private void setTabuleiro(Tabuleiro tab) { this.tabuleiro = tab; }
	
	public Tabuleiro getTabuleiro() { return this.tabuleiro; }

	@Override
	public void moveCima() {
		this.tabuleiro.getPonteiro().moveCima();
		this.tabuleiro.setPonteiro(this.tabuleiro.getPonteiro().getCima());
	}

	@Override
	public void moveBaixo() {
		this.tabuleiro.getPonteiro().moveBaixo();
		this.tabuleiro.setPonteiro(this.tabuleiro.getPonteiro().getBaixo());
	}

	@Override
	public void moveDireita() {
		this.tabuleiro.getPonteiro().moveDireita();
		this.tabuleiro.setPonteiro(this.tabuleiro.getPonteiro().getDireita());
	}

	@Override
	public void moveEsquerda() {
		this.tabuleiro.getPonteiro().moveEsquerda();
		this.tabuleiro.setPonteiro(this.tabuleiro.getPonteiro().getEsquerda());
	}
}
