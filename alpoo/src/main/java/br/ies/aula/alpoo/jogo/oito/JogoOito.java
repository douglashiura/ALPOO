package br.ies.aula.alpoo.jogo.oito;

import java.sql.Connection;
import java.util.concurrent.ThreadLocalRandom;

import br.ies.alpoo.jogo.oito.database.ConnectDB;
import br.ies.alpoo.jogo.oito.database.ControleDB;

public class JogoOito {
	private static ControleDB control = new ControleDB();
	private static int randomNum = ThreadLocalRandom.current().nextInt(1, 6 + 1);
	private static Integer[][] tabuleiro = control.getTabuleiro(randomNum);; 
	private static Integer linha, coluna;
	
	Connection cnn = ConnectDB.connect();
	
	public JogoOito() {
		setTabuleiro(tabuleiro);
		
		int x = 0,y = 0;
		
		for(int i=0 ; i<3;i++){
			for(int j=0 ; j<3; j++){
				if (tabuleiro[i][j] == 0) {
					x = j;
					y = i;
				}
			}
		}
		
		setColuna(x);
		setLinha(y);
	}
	
	public static int getTabuId() {
		return randomNum;
	}
	
	public static void mover(String direcao){
		
		switch(direcao) {
		case "UP" : 
			if (getLinha() > 0) {
				int troca = getTabuleiro()[getLinha() - 1][getColuna()];
				getTabuleiro()[getLinha() - 1][getColuna()] = 0;
				getTabuleiro()[getLinha()][getColuna()] = troca;
				setLinha(getLinha() - 1);
			}
			break;
		case "RIGHT" :
			if (getColuna() < 2) {
				int troca = getTabuleiro()[getLinha()][getColuna() + 1];
				getTabuleiro()[getLinha()][getColuna() + 1] = 0;
				getTabuleiro()[getLinha()][getColuna()] = troca;
				setColuna(getColuna() + 1);
			}
			break;
		case "LEFT" :
			if (getColuna() > 0) {
				int troca = getTabuleiro()[getLinha()][getColuna()-1];
				getTabuleiro()[getLinha()][getColuna()-1] = 0;
				getTabuleiro()[getLinha()][getColuna()] = troca;
				setColuna(getColuna() -1);
			}
			break;
		case "DOWN" :
			if (getLinha() < 2) {
				int troca = getTabuleiro()[getLinha() + 1][getColuna()];
				getTabuleiro()[getLinha() + 1][getColuna()] = 0;
				getTabuleiro()[getLinha()][getColuna()] = troca;
				setLinha(getLinha() + 1);
			}
			break;
		}

	}

	public static void moverWithPrint(String direcao){
		
		switch(direcao) {
		case "UP" : 
			if (getLinha() > 0) {
				int troca = getTabuleiro()[getLinha() - 1][getColuna()];
				getTabuleiro()[getLinha() - 1][getColuna()] = 0;
				getTabuleiro()[getLinha()][getColuna()] = troca;
				setLinha(getLinha() - 1);
			}
			break;
		case "RIGHT" :
			if (getColuna() < 2) {
				int troca = getTabuleiro()[getLinha()][getColuna() + 1];
				getTabuleiro()[getLinha()][getColuna() + 1] = 0;
				getTabuleiro()[getLinha()][getColuna()] = troca;
				setColuna(getColuna() + 1);
			}
			break;
		case "LEFT" :
			if (getColuna() > 0) {
				int troca = getTabuleiro()[getLinha()][getColuna()-1];
				getTabuleiro()[getLinha()][getColuna()-1] = 0;
				getTabuleiro()[getLinha()][getColuna()] = troca;
				setColuna(getColuna() -1);
			}
			break;
		case "DOWN" :
			if (getLinha() < 2) {
				int troca = getTabuleiro()[getLinha() + 1][getColuna()];
				getTabuleiro()[getLinha() + 1][getColuna()] = 0;
				getTabuleiro()[getLinha()][getColuna()] = troca;
				setLinha(getLinha() + 1);
			}
			break;
		}
		System.out.println();
		printTabuleiro();

	}
	
	public static void printTabuleiro() {
		for (Integer[] linha : getTabuleiro()) {
			for (int coluna : linha) {
				System.out.printf("%s ", coluna);
			}
			System.out.println();
		}
	}

	public static Integer[][] getTabuleiro() {
		return tabuleiro;
	}

	public static void setTabuleiro(Integer[][] integers) {
		JogoOito.tabuleiro = integers;
	}
	
	public static void setTabuleiroByID(int id) {
		JogoOito.tabuleiro = control.getTabuleiro(id);
	}

	public static Integer getColuna() {
		return coluna;
	}

	public static void setColuna(Integer coluna) {
		JogoOito.coluna = coluna;
	}
	
	public static Integer getLinha() {
		return linha;
	}

	public static void setLinha(Integer linha) {
		JogoOito.linha = linha;
	}
}

