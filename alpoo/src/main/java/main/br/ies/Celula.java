package main.br.ies;

public class Celula {
	private Integer numero;
	private Celula direita;

	public Celula(Integer numero) {
		this.setNumero(numero);
	}

	public Integer getNumero() {
		return numero;
	}

	public void setNumero(Integer numero) {
		this.numero = numero;
	}

	public void trocarNumero(Celula origem, Celula destino) {
		Integer swap = origem.getNumero();
		origem.setNumero(destino.getNumero());
		destino.setNumero(swap);
	}

	public void fixaDireita(Celula direita) {
		this.direita = direita;
	}

	public void moverParaDireita() {
		trocarNumero(this, direita);
	}
}
