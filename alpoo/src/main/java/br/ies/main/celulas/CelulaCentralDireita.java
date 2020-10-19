package br.ies.main.celulas;

public class CelulaCentralDireita extends Celula {

	public CelulaCentralDireita(Integer numero) {
		super(numero);
	}

	@Override
	public void moverParaDireita() {

	}

	@Override
	public Celula getDireita() {
		return this;
	}

}
