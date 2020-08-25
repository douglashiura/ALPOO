package br.ies.aula.alpoo.jogo.oito;

public class JogoOito {
	private int[][] tabuleiro; 
	private int linha, coluna;
	
	public JogoOito() {
		tabuleiro = new int[][] { { 5, 7, 2 }, { 1, 0, 3 }, { 8, 4, 6 } };
		coluna = 1;
		linha = 1;
	}

	public void moveZero(String direcao) throws InterruptedException {
		Thread.sleep(1500);
		
		switch(direcao) {
		case "UP" : 
			if (linha > 0) {
				int troca = tabuleiro[linha - 1][coluna];
				tabuleiro[linha - 1][coluna] = 0;
				tabuleiro[linha][coluna] = troca;
				linha = linha - 1;
			}
			break;
		case "RIGHT" :
			if (coluna < 2) {
				int troca = tabuleiro[linha][coluna + 1];
				tabuleiro[linha][coluna + 1] = 0;
				tabuleiro[linha][coluna] = troca;
				coluna = coluna + 1;
			}
			break;
		case "LEFT" :
			if (coluna > 0) {
				int troca = tabuleiro[linha ][coluna-1];
				tabuleiro[linha ][coluna-1] = 0;
				tabuleiro[linha][coluna] = troca;
				coluna = coluna -1;
			}
			break;
		case "DOWN" :
			if (linha < 2) {
				int troca = tabuleiro[linha + 1][coluna];
				tabuleiro[linha + 1][coluna] = 0;
				tabuleiro[linha][coluna] = troca;
				linha = linha + 1;
			}
			break;
		}
		System.out.println();
		printTabuleiro();

	}

	public int[][] obterNumeros() {
		return tabuleiro;
	}

	public void printTabuleiro() {
		for (int[] linha : obterNumeros()) {
			for (int coluna : linha) {
				System.out.printf("%s ", coluna);
			}
			System.out.println();
		}
	}

}

