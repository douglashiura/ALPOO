package br.ies.main.celulas;

public class CelulaCentral extends Celula {

	public CelulaCentral(Integer numero) {
		super(numero);
	}

	public void fixarDireita(Celula direita) {
		this.setDireita(direita);
	}

	public void fixarEsquerda(Celula esquerda) {
		this.setEsquerda(esquerda);
	}

	public void fixarBaixo(Celula baixo) {
		this.setBaixo(baixo);
	}

	public void fixarCima(Celula cima) {
		this.setCima(cima);
	}

}
