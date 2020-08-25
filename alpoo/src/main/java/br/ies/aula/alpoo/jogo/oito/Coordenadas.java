package br.ies.aula.alpoo.jogo.oito;

public class Coordenadas {
	private int linha;
	private int coluna;

	public Coordenadas(int linha, int coluna) {
		this.setLinha(linha);
		this.setColuna(coluna);
	}

	public int getLinha() {
		return linha;
	}

	public void setLinha(int linha) {
		this.linha = linha;
	}

	public int getColuna() {
		return coluna;
	}

	public void setColuna(int coluna) {
		this.coluna = coluna;
	}
}
