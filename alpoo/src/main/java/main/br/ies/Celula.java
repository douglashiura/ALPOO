package main.br.ies;

public class Celula {
	private Integer numero;
	private Integer posicao;

	public Celula(Integer numero, Integer posicao) {
		this.setNumero(numero);
		this.setPosicao(posicao);
	}

	public Integer getNumero() {
		return numero;
	}

	public void setNumero(Integer numero) {
		this.numero = numero;
	}

	public Integer getPosicao() {
		return posicao;
	}

	public void setPosicao(Integer posicao) {
		this.posicao = posicao;
	}

	public static void trocarNumero(Celula x, Celula y) {
		Integer swap = x.getNumero();
		x.setNumero(y.getNumero());
		y.setNumero(swap);
	}
}
//Aloka