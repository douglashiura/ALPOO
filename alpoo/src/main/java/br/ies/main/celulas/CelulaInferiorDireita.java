package br.ies.main.celulas;

public class CelulaInferiorDireita extends Celula {

	public CelulaInferiorDireita(Integer numero) {
		super(numero);
	}

	public void fixarCima(Celula cima) {
		setCima(cima);
	}

	public void fixarEsquerda(Celula esquerda) {
		setEsquerda(esquerda);
	}

	@Override
	public void moverParaBaixo() {
		System.out.println("Movimento n�o permitido");
	}

	@Override
	public void moverParaDireita() {
		System.out.println("Movimento n�o permitido");
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
