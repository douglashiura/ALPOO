package br.ies.main.celulas;

public class CelulaSuperiorDireita extends Celula {

	public CelulaSuperiorDireita(Integer numero) {
		super(numero);
	}

	@Override
	public void moverParaCima() {
	}

	@Override
	public void moverParaDireita() {
	}

	@Override
	public Celula getCima() {
		return this;
	}

	@Override
	public Celula getDireita() {
		return this;
	}

}
