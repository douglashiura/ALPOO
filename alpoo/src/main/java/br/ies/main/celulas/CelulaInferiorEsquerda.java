package br.ies.main.celulas;

public class CelulaInferiorEsquerda extends Celula {

	public CelulaInferiorEsquerda(Integer numero) {
		super(numero);
	}

	public void fixarCima(Celula cima) {
		setCima(cima);
	}

	public void fixarDireita(Celula direita) {
		setDireita(direita);
	}

	@Override
	public void moverParaBaixo() {
		System.out.println("Movimento não permitido");
	}

	@Override
	public void moverParaEsquerda() {
		System.out.println("Movimento não permitido");
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
