package br.ies.main.celulas;

public class CelulaSuperiorCentral extends Celula {

	public CelulaSuperiorCentral(Integer numero) {
		super(numero);
	}

	@Override
	public void moverParaCima() {
	}

	@Override
	public Celula getCima() {
		return this;
	}

}
