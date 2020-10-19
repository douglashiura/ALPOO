package br.ies.main.celulas;

public class CelulaInferiorCentral extends Celula {

	public CelulaInferiorCentral(Integer numero) {
		super(numero);
	}

	@Override
	public void moverParaBaixo() {
	}

	@Override
	public Celula getBaixo() {
		return this;
	}

}
