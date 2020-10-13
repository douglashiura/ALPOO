package main.br.ies;

public class Celula {
	private Integer numero;
	private Celula direita;
	private Celula esquerda;
	private Celula acima;
	private Celula abaixo;
	
	private static Celula posicaoZero;

	public Celula(Integer numero) {
		this.setNumero(numero);
//		posicaoZero = new CelulaNove();
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
//		posicaoZero = destino;
	}

	/* Fixar Posi��es dos vizinhos */
	/*
	 * Como existe classes espec�ficas para cada posi��o
	 * talvez seja melhor que esses fixaPosi��es fixem as classes
	 * das posi��es do tabuleiro?
	 * 
	 * Ex:
	 * CelulaNove fixa CelulaOito como esquerda, n�o fixa nada na direita,
	 * fixa CelulaSeis como acima e n�o fixa nada como abaixo.
	 * 
	 * Obs:
	 * O fixa nada pode ser uma fun��o vazia ou algo do g�nero.
	 * 
	 * Pensamentos:
	 * A posicaoZero deve ser inicializada com a CelulaNove que cont�m 
	 * o n�mero 0 por padr�o?
	 * A posicaoZero deve ser atualizada no ato de execu��o do m�todo
	 * trocarNumero?
	 * Talvez criar instancias �nicas das c�lulas um a 9 para poder manter
	 * as posi��es sempre conhecidas?
	 * Ser� necess�rio uma lista ou um hashmap para guardar as instancias?
	 * 
	 * 
	 * */
	public void fixaDireita(Celula direita) {
		this.direita = direita;
	}
	
	public void fixaEsquerda(Celula esquerda) {
		this.esquerda = esquerda;
	}
	
	public void fixaAcima(Celula acima) {
		this.acima = acima;
	}
	
	public void fixaAbaixo(Celula abaixo) {
		this.abaixo = abaixo;
	}

	/* Movimenta��es */
	public void moverParaDireita() {
		trocarNumero(this, direita);
	}
	
	public void moverParaEsquerda() {
		trocarNumero(this, esquerda);
	}
	
	public void moverParaCima() {
		trocarNumero(this, acima);
	}
	
	public void moverParaBaixo() {
		trocarNumero(this, abaixo);
	}
}
