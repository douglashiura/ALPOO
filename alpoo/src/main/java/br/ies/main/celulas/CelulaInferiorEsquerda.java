package br.ies.main.celulas;

public class CelulaInferiorEsquerda extends Celula {

	public CelulaInferiorEsquerda(Integer numero) {
		super(numero);
	}

	@Override
	public void moverParaBaixo() {
	}

	@Override
	public void moverParaEsquerda() {
	}

	@Override
	public Celula getEsquerda() {
		return this;
	}

	@Override
	public Celula getBaixo() {
		return this;
	}

}
