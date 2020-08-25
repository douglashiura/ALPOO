package br.ies.aula.alpoo.calculadora;

public class jogo8 {
	private int[][] tabuleiro;
	private int coluna;
	private int linha;

	public jogo8() {
		tabuleiro = new int[][] { { 2, 3, 1 }, { 0, 5, 4 }, { 8, 7, 6 } };
		coluna = 0;
		linha = 1;
	}

	public void moverQuadrado(String direcao) throws InterruptedException {
		Thread.sleep(1000);
		if ("up".equals(direcao)) {
			if (linha > 0) {
				int troca = tabuleiro[linha - 1][coluna];
				tabuleiro[linha - 1][coluna] = 0;
				tabuleiro[linha][coluna] = troca;
				linha = linha - 1;
			}
		} else if ("right".equals(direcao)) {
			if (coluna < 2) {
				int troca = tabuleiro[linha][coluna + 1];
				tabuleiro[linha][coluna + 1] = 0;
				tabuleiro[linha][coluna] = troca;
				coluna = coluna + 1;
			}
		} else if ("down".equals(direcao)) {
			if (linha < 2) {
				int troca = tabuleiro[linha + 1][coluna];
				tabuleiro[linha + 1][coluna] = 0;
				tabuleiro[linha][coluna] = troca;
				linha = linha + 1;
			}
		} else if ("left".equals(direcao)) {
			if (coluna > 0) {
				int troca = tabuleiro[linha ][coluna-1];
				tabuleiro[linha ][coluna-1] = 0;
				tabuleiro[linha][coluna] = troca;
				coluna = coluna -1;
			}
		}
		System.out.println();
		pintarTabuleiro();
	}

	public int[][] obterNumeros() {
		return tabuleiro;
	}

	public void pintarTabuleiro() {
		for (int[] linha : obterNumeros()) {
			for (int coluna : linha) {
				System.out.printf("%s ", coluna);
			}
			System.out.println();
		}
	}

}
