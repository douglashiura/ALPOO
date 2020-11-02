package tabuleiro;

import movimento.Movimentos;

public class TabuleiroController implements Movimentos{

	private Tabuleiro tabuleiro;
	
	public TabuleiroController(Tabuleiro tab) {
		this.setTabuleiro(tab);
	}

	public void  resetGame() {
		this.setTabuleiro(new Tabuleiro());
	}
	private void setTabuleiro(Tabuleiro tab) { this.tabuleiro = tab; }
	
	public Tabuleiro getTabuleiro() { return this.tabuleiro; }

	public void moveCima() {
		this.tabuleiro.getPonteiro().moveCima();
		this.tabuleiro.setPonteiro(this.tabuleiro.getPonteiro().getCima());
	}

	
	public void moveBaixo() {
		this.tabuleiro.getPonteiro().moveBaixo();
		this.tabuleiro.setPonteiro(this.tabuleiro.getPonteiro().getBaixo());
	}

	
	public void moveDireita() {
		this.tabuleiro.getPonteiro().moveDireita();
		this.tabuleiro.setPonteiro(this.tabuleiro.getPonteiro().getDireita());
	}


	public void moveEsquerda() {
		this.tabuleiro.getPonteiro().moveEsquerda();
		this.tabuleiro.setPonteiro(this.tabuleiro.getPonteiro().getEsquerda());
	}
}
