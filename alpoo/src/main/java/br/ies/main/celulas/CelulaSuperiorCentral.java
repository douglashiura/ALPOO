package br.ies.main.celulas;

public class CelulaSuperiorCentral extends Celula {

	public CelulaSuperiorCentral(Integer numero) {
		super(numero);
	}

	public void fixarBaixo(Celula Baixo) {
		setBaixo(Baixo);
	}

	public void fixarDireita(Celula direita) {
		setDireita(direita);
	}

	public void fixarEsquerda(Celula esquerda) {
		setEsquerda(esquerda);
	}

	@Override
	public void moverParaCima() {
		System.out.println("Movimento não permitido");
	}

	@Override
	public Celula getCima() {
		return this;
	}

}
