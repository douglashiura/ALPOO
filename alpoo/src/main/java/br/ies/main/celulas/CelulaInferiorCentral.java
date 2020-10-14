package br.ies.main.celulas;

public class CelulaInferiorCentral extends Celula {

	public CelulaInferiorCentral(Integer numero) {
		super(numero);
	}

	public void fixarCima(Celula cima) {
		setCima(cima);
	}

	public void fixarDireita(Celula direita) {
		setDireita(direita);
	}

	public void fixarEsquerda(Celula esquerda) {
		setEsquerda(esquerda);
	}

	@Override
	public void moverParaBaixo() {
		System.out.println("Movimento não permitido");
	}

	@Override
	public Celula getBaixo() {
		return this;
	}

}
