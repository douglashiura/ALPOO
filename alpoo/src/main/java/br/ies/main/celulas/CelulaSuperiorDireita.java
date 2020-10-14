package br.ies.main.celulas;

public class CelulaSuperiorDireita extends Celula {

	public CelulaSuperiorDireita(Integer numero) {
		super(numero);
	}

	public void fixarBaixo(Celula baixo) {
		setBaixo(baixo);
	}

	public void fixarEsquerda(Celula esquerda) {
		setEsquerda(esquerda);
	}

	@Override
	public void moverParaCima() {
		System.out.println("Movimento não permitido");
	}

	@Override
	public void moverParaDireita() {
		System.out.println("Movimento não permitido");
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
