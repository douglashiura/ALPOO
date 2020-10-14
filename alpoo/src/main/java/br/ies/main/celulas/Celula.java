package br.ies.main.celulas;

import br.ies.main.movimentos.Movimentos;

public class Celula implements Movimentos {
	protected Integer numero;
	protected Celula cima;
	protected Celula baixo;
	protected Celula esquerda;
	protected Celula direita;

	public Celula(Integer numero) {
		this.setNumero(numero);
	}

	public Integer getNumero() {
		return numero;
	}

	public void setNumero(Integer numero) {
		this.numero = numero;
	}

	public static void trocarNumero(Celula origem, Celula destino) {
		Integer armazenamentoTemporario = origem.getNumero();
		origem.setNumero(destino.getNumero());
		destino.setNumero(armazenamentoTemporario);
	}

	@Override
	public void moverParaCima() {
		trocarNumero(this, cima);
	}

	@Override
	public void moverParaBaixo() {
		trocarNumero(this, baixo);
	}

	@Override
	public void moverParaEsquerda() {
		trocarNumero(this, esquerda);
	}

	@Override
	public void moverParaDireita() {
		trocarNumero(this, direita);
	}

	public Celula getCima() {
		return cima;
	}

	public void setCima(Celula cima) {
		this.cima = cima;
	}

	public Celula getBaixo() {
		return baixo;
	}

	public void setBaixo(Celula baixo) {
		this.baixo = baixo;
	}

	public Celula getEsquerda() {
		return esquerda;
	}

	public void setEsquerda(Celula esquerda) {
		this.esquerda = esquerda;
	}

	public Celula getDireita() {
		return direita;
	}

	public void setDireita(Celula direita) {
		this.direita = direita;
	}
}
