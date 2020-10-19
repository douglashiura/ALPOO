package br.ies.main.celulas;

public class CelulaInferiorDireita extends Celula {

	public CelulaInferiorDireita(Integer numero) {
		super(numero);
	}

	@Override
	public void moverParaBaixo() {
	}

	@Override
	public void moverParaDireita() {
	}

	@Override
	public Celula getDireita() {
		return this;
	}

	@Override
	public Celula getBaixo() {
		return this;
	}

}
