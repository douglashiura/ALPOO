package br.ies.main.celulas;

public class CelulaSuperiorEsquerda extends Celula {

	public CelulaSuperiorEsquerda(Integer numero) {
		super(numero);
	}

	@Override
	public void moverParaCima() {
	}

	@Override
	public void moverParaEsquerda() {
	}

	@Override
	public Celula getCima() {
		return this;
	}

	@Override
	public Celula getEsquerda() {
		return this;
	}

}