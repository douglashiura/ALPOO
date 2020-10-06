package jogo.oito;

public class JogoDoOito {

	private Integer[][] matrizDoJogo;
	private Integer coluna;
	private Integer linha;

	public JogoDoOito() {
		this.matrizDoJogo = new Integer[][] { { 3, 7, 2 }, { 4, 0, 6 }, { 5, 1, 8 } };
		this.coluna = 1;
		this.linha = 1;
	}

	public void cima() {
		if (this.linha > 0) {
			Integer troca = this.matrizDoJogo[this.linha - 1][this.coluna];
			this.matrizDoJogo[this.linha - 1][this.coluna] = 0;
			this.matrizDoJogo[this.linha][this.coluna] = troca;
			this.linha = this.linha - 1;
		}
		this.mostrarJogo();

	}

	public void baixo() {
		if (this.linha < 2) {
			Integer troca = this.matrizDoJogo[this.linha + 1][this.coluna];
			this.matrizDoJogo[this.linha + 1][this.coluna] = 0;
			this.matrizDoJogo[this.linha][this.coluna] = troca;
			this.linha = this.linha + 1;
		}
		this.mostrarJogo();

	}

	public void direita() {
		if (this.coluna < 2) {
			Integer troca = this.matrizDoJogo[this.linha][this.coluna + 1];
			this.matrizDoJogo[this.linha][this.coluna + 1] = 0;
			this.matrizDoJogo[this.linha][this.coluna] = troca;
			this.coluna = this.coluna + 1;
		}
		this.mostrarJogo();

	}

	public void esquerda() {
		if (this.coluna > 0) {
			Integer troca = this.matrizDoJogo[this.linha][this.coluna - 1];
			this.matrizDoJogo[this.linha][this.coluna - 1] = 0;
			this.matrizDoJogo[this.linha][this.coluna] = troca;
			this.coluna = this.coluna - 1;
		}
		this.mostrarJogo();
	}

	public void mostrarJogo() {
		for (Integer[] linha : this.obterNumeros()) {
			System.out.print("|");
			for (Integer coluna : linha) {
				System.out.printf(" %s ", coluna);
			}
			System.out.println("|");
		}
		System.out.println("-----------");
	}

	private Integer[][] obterNumeros() {
		return this.matrizDoJogo;
	}

}
