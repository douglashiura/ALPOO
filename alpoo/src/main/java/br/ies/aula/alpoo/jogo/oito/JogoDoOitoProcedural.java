package br.ies.aula.alpoo.jogo.oito;

public class JogoDoOitoProcedural {
	private int[][] tabuleiro;
	private int coluna;
	private int linha;

	public JogoDoOitoProcedural() {
		tabuleiro = new int[][] { { 3, 1, 2 }, { 0, 4, 5 }, { 6, 7, 8 } };
		coluna = 0;
		linha = 1;
	}

	public void moverAPecaBranca(String direcao) throws InterruptedException {
		System.out.println();
		pintarTabuleiro();
		if ("CIMA".equals(direcao)) {
			if (linha > 0) {
				int troca = tabuleiro[linha - 1][coluna];
				tabuleiro[linha - 1][coluna] = 0;
				tabuleiro[linha][coluna] = troca;
				linha = linha - 1;
			}
		} else if ("DIREITA".equals(direcao)) {
			if (coluna < 2) {
				int troca = tabuleiro[linha][coluna + 1];
				tabuleiro[linha][coluna + 1] = 0;
				tabuleiro[linha][coluna] = troca;
				coluna = coluna + 1;
			}
		} else if ("BAIXO".equals(direcao)) {
			if (linha < 2) {
				int troca = tabuleiro[linha + 1][coluna];
				tabuleiro[linha + 1][coluna] = 0;
				tabuleiro[linha][coluna] = troca;
				linha = linha + 1;
			}
		} else if ("ESQUERDA".equals(direcao)) {
			if (coluna > 0) {
				int troca = tabuleiro[linha][coluna - 1];
				tabuleiro[linha][coluna - 1] = 0;
				tabuleiro[linha][coluna] = troca;
				coluna = coluna - 1;
			}
		}

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
