package controller;

import dao.MovimentosDao;
import entities.Tabuleiro;
import impl.JogadorImpl;
import impl.LogImpl;
import impl.TabuleiroImpl;

public class TabuleiroController implements MovimentosDao{

	private Tabuleiro tabuleiro;
	
	public TabuleiroController(Tabuleiro tab) {
		this.setTabuleiro(tab);
	}

	public void  resetGame() {
		TabuleiroImpl tabuleiroImpl = new TabuleiroImpl();
		LogImpl logImpl = new LogImpl();

		try {
			tabuleiroImpl.removeTabuleiro();
			tabuleiroImpl.criaTabuleiro();
			
			logImpl.removeLogs();
			
			this.setTabuleiro(new Tabuleiro());
		} catch (Exception e) {
			e.printStackTrace();
		}
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
