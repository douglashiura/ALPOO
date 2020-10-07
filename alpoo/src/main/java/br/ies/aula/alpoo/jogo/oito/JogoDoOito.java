package br.ies.aula.alpoo.jogo.oito;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class JogoDoOito {
	// [0] = linha [1] = coluna.
	Coordenadas posicaoAtualZero;
	int[][] matriz = new int[3][3];	

	public JogoDoOito() {
		// aleatoriedade dos numeros
		Integer[] numerosJogo = { 0, 1, 2, 3, 4, 5, 6, 7, 8 };

		List<Integer> intList = Arrays.asList(numerosJogo);

		Collections.shuffle(intList);

		intList.toArray(numerosJogo);

		int i = 0;

		// preenchimento da matriz
		for (int k = 0; k < 3; k++) {
			for (int j = 0; j < 3; j++) {
				matriz[k][j] = numerosJogo[i];
				if (numerosJogo[i] == 0) {
					posicaoAtualZero = new Coordenadas(k, j);
				}
				i++;
			}
		}
	}

	public void imprimeMatriz() {
		for (int l = 0; l < matriz.length; l++) {
			for (int c = 0; c < matriz[0].length; c++) {
				System.out.print(matriz[l][c] + " ");
			}
			System.out.println(" ");
		}
		System.out.println("\n");
	}
	
	//remover o switch
	public void moverZero(Direcao movimento) {
		switch(movimento) {
			case CIMA:
				this.moverCima();
				break;
			case BAIXO:
				this.moverBaixo();
				break;
			case ESQUERDA:
				this.moverEsquerda();
				break;
			case DIREITA:
				this.moverDireita();
				break;
		}
	}

	//melhorar a orientacao
	private void moverCima() {
		if (posicaoAtualZero.getLinha() > 0) {
			matriz[posicaoAtualZero.getLinha()][posicaoAtualZero
					.getColuna()] = matriz[posicaoAtualZero.getLinha() - 1][posicaoAtualZero.getColuna()];
			matriz[posicaoAtualZero.getLinha() - 1][posicaoAtualZero.getColuna()] = 0;
			posicaoAtualZero.setLinha(posicaoAtualZero.getLinha() - 1);
		}
		this.imprimeMatriz();
	}

	private void moverBaixo() {
		if (posicaoAtualZero.getLinha() < 2) {
			matriz[posicaoAtualZero.getLinha()][posicaoAtualZero
					.getColuna()] = matriz[posicaoAtualZero.getLinha() + 1][posicaoAtualZero.getColuna()];
			matriz[posicaoAtualZero.getLinha() + 1][posicaoAtualZero.getColuna()] = 0;
			posicaoAtualZero.setLinha(posicaoAtualZero.getLinha() + 1);
		}
		this.imprimeMatriz();
	}

	private void moverEsquerda() {
		if (posicaoAtualZero.getColuna() > 0) {
			matriz[posicaoAtualZero.getLinha()][posicaoAtualZero
					.getColuna()] = matriz[posicaoAtualZero.getLinha()][posicaoAtualZero.getColuna() - 1];
			matriz[posicaoAtualZero.getLinha()][posicaoAtualZero.getColuna() - 1] = 0;
			posicaoAtualZero.setColuna(posicaoAtualZero.getColuna() - 1);
		}
		this.imprimeMatriz();
	}

	private void moverDireita() {
		if (posicaoAtualZero.getColuna() < 2) {
			matriz[posicaoAtualZero.getLinha()][posicaoAtualZero
					.getColuna()] = matriz[posicaoAtualZero.getLinha()][posicaoAtualZero.getColuna() + 1];
			matriz[posicaoAtualZero.getLinha()][posicaoAtualZero.getColuna() + 1] = 0;
			posicaoAtualZero.setColuna(posicaoAtualZero.getColuna() + 1);
		}
		this.imprimeMatriz();
	}
}
