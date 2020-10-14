package br.ies.main.celulas;

public class CelulaSuperiorEsquerda extends Celula {

	public CelulaSuperiorEsquerda(Integer numero) {
		super(numero);
	}

	public void fixarBaixo(Celula baixo) {
		setBaixo(baixo);
	}

	public void fixarDireita(Celula direita) {
		setDireita(direita);
	}

	@Override
	public void moverParaCima() {
		System.out.println("Movimento n�o permitido");
	}

	@Override
	public void moverParaEsquerda() {
		System.out.println("Movimento n�o permitido");
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