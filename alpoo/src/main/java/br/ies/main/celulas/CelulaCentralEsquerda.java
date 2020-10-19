package br.ies.main.celulas;

public class CelulaCentralEsquerda extends Celula {

	public CelulaCentralEsquerda(Integer numero) {
		super(numero);
	}

	@Override
	public void moverParaEsquerda() {

	}

	@Override
	public Celula getEsquerda() {
		return this;
	}

}
