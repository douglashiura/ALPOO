package br.ies.aula.alpoo.jogoDoOito;

import java.util.Random;

public class Jogo {
	private int posicaoAtual;
	private int tabuleiro [] [];
	
	public Jogo() {	
		
		tabuleiro  = new int[3][3];
		tabuleiro = Jogo.gerarTabuleiro(tabuleiro);
		Jogo.pintarTabuleiro(tabuleiro);
		System.out.println(tabuleiro[1][1]);
		//tabuleiro = Jogo.embaralhar(tabuleiro);
		//clearConsole.limpatela();
		//Jogo.pintarTabuleiro(tabuleiro);
			
	}
	
	
	public static int[][] embaralhar(int[][] tabuleiro) {	
		Random random = new Random();
		
		for (int i=0; i <= 2 ; i++) {
			int j = random.nextInt(tabuleiro.length);
			int[] temp = tabuleiro[i];
			tabuleiro[i] = tabuleiro[j];
			tabuleiro[j] = temp;
			
			int z = random.nextInt(tabuleiro.length);
			temp = tabuleiro[z];
			tabuleiro[z] = tabuleiro[j];
			tabuleiro[j] = temp;
			
			
			
		}
		return tabuleiro;
	}
	
	public static int[][] gerarTabuleiro (int[][] tabuleiro){

		tabuleiro[0][0]= 0;
		tabuleiro[0][1]= 1;
		tabuleiro[0][2]= 2;
		tabuleiro[1][0]= 3;
		tabuleiro[1][1]= 4;
		tabuleiro[1][2]= 5;
		tabuleiro[2][0]= 6;
		tabuleiro[2][1]= 7;
		tabuleiro[2][2]= 8;
		return tabuleiro;
	}
	
	public static void pintarTabuleiro(int[][] tabuleiro) {	
		int j = 0;
		int i = 0 ;
		
		for (j = 0 ; j<=2 ; j++) {
		for (i = 0 ; i<= 2 ; i++ ) {			
			System.out.print(" "+tabuleiro[j][i]);							
	     } 
		System.out.println("");	
		}
	}
	

	public static void main(String[] args) {	
		Jogo jogo = new Jogo();
		
	}
	
	
	
	

}
