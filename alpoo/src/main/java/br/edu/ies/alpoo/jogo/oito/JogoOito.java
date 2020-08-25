package br.edu.ies.alpoo.jogo.oito;

public class JogoOito {

	private int[][] arrayNumeros;
	
	private int linhaZeroIndex = 2;
	private int colunaZeroIndex = 0;

	public JogoOito () {
		this.arrayNumeros = getArray();
	}
	
	public void moveUp() {
		int variavelAux = this.arrayNumeros[linhaZeroIndex-1][colunaZeroIndex];
		this.arrayNumeros[linhaZeroIndex-1][colunaZeroIndex] = this.arrayNumeros[linhaZeroIndex][colunaZeroIndex];
		this.arrayNumeros[linhaZeroIndex][colunaZeroIndex] = variavelAux;
		this.linhaZeroIndex = this.arrayNumeros[linhaZeroIndex-1][colunaZeroIndex];
		this.colunaZeroIndex = this.arrayNumeros[linhaZeroIndex][colunaZeroIndex];
		showTable();
	}
	
	public void moveDown() {
		
	}
	
	public void moveLeft() {
		
	}
	
	public void moveRight() {
		
	}
	
	public void showTable () {
		for(int[] linha: arrayNumeros) {
			for (int coluna: linha) {
				System.out.printf("|%s|", coluna);
			}
			System.out.println();
		}
		System.out.println("--------------");
	}
	
	private int[][] getArray () {
		return new int[][] {{3,1,2},{6,7,8},{0,4,5}};
	}
}
