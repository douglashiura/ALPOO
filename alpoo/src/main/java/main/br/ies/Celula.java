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

	/* Fixar Posições dos vizinhos */
	/*
	 * Como existe classes específicas para cada posição
	 * talvez seja melhor que esses fixaPosições fixem as classes
	 * das posições do tabuleiro?
	 * 
	 * Ex:
	 * CelulaNove fixa CelulaOito como esquerda, não fixa nada na direita,
	 * fixa CelulaSeis como acima e não fixa nada como abaixo.
	 * 
	 * Obs:
	 * O fixa nada pode ser uma função vazia ou algo do gênero.
	 * 
	 * Pensamentos:
	 * A posicaoZero deve ser inicializada com a CelulaNove que contém 
	 * o número 0 por padrão?
	 * A posicaoZero deve ser atualizada no ato de execução do método
	 * trocarNumero?
	 * Talvez criar instancias únicas das células um a 9 para poder manter
	 * as posições sempre conhecidas?
	 * Será necessário uma lista ou um hashmap para guardar as instancias?
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

	/* Movimentações */
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
