package br.edu.ies.alpoo.jogo.oito;
import java.util.Arrays;

public class Jogo {
	private int[][] jogo;
	private int linha;
	private int coluna;
	
	public Jogo() {
		this.jogo = new int[][] {{3,1,2},{6,7,8},{0,4,5}};
		this.coluna = 0;
		this.linha = 2;
		this.getEstadoAtualJogo();
	}
	
	public void movePecaZero(String move) {
		if(move == MOVIMENTO.CIMA.getDirecao()) {
			this.moveParaCima();
		}else if(move == MOVIMENTO.DESCE.getDirecao()) {
			this.moveParaBaixo();
		}else if(move == MOVIMENTO.DIREITA.getDirecao()) {
			this.moveParaDireita();
		}else if(move == MOVIMENTO.ESQUERDA.getDirecao()){
			this.movaParaEsquerda();
		}
		this.getEstadoAtualJogo();
	}
	
	private void movaParaEsquerda() {
		if(coluna > 0) {
			int troca = jogo[linha][coluna-1];
			jogo[linha][coluna-1] = 0;
			jogo[linha][coluna] = troca;
			coluna = coluna-1;
		}
	}
	
	private void moveParaCima() {
		if(linha > 0) {
			int troca = jogo[linha-1][coluna];
			jogo[linha-1][coluna] = 0;
			jogo[linha][coluna] = troca;
			linha = linha-1;
		}
	}
	
	private void moveParaDireita() {
		if(coluna > 3) {
			int troca = jogo[linha][coluna+1];
			jogo[linha][coluna+1] = 0;
			jogo[linha][coluna] = troca;
			coluna = coluna+1;
		}
	}
	
	private void moveParaBaixo() {
		if(linha < 3) {
			int troca = jogo[linha+1][coluna];
			jogo[linha+1][coluna] = 0;
			jogo[linha][coluna] = troca;
			linha = linha+1;
		}
	}
	
	
	
	public int[][] obterNumeros() {
		return this.jogo;
	}
	public void getEstadoAtualJogo() {
		for(int[] linha: this.obterNumeros()) {
			for(int coluna : linha) {
				System.out.printf("%s ",coluna);
			}
			System.out.println();
		}
		System.out.println("==+==");
	}
	
	
}
