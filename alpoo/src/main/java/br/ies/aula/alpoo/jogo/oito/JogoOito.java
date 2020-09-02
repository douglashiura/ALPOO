package br.ies.aula.alpoo.jogo.oito;

public class JogoOito {
	private static Integer[] tabuleiro = new Integer[9];

	public JogoOito() {
		for (Integer i = Integer.valueOf(0); i < Integer.valueOf(9); i++) {
			tabuleiro[i] = i;
		}
	}

	public void moverPraCima() {
		Integer local = this.localizacaoNull();
		if (this.localizacaoNull() > Integer.valueOf(2)) {
			Integer swap = tabuleiro[this.localizacaoNull() - 3];
			tabuleiro[this.localizacaoNull() - Integer.valueOf(3)] = 0;
			tabuleiro[local] = swap;
		}
	}

	public void moverPraBaixo() {
		Integer local = this.localizacaoNull();
		if (this.localizacaoNull() < Integer.valueOf(5)) {
			Integer swap = tabuleiro[this.localizacaoNull() + 3];
			tabuleiro[this.localizacaoNull() + Integer.valueOf(3)] = 0;
			tabuleiro[local] = swap;
		}
	}

	public void moverPraDireita() {
		Integer local = this.localizacaoNull();
		if (this.localizacaoNull() + 1 < 8) {
			Integer swap = tabuleiro[this.localizacaoNull() + 1];
			tabuleiro[this.localizacaoNull() + Integer.valueOf(1)] = 0;
			tabuleiro[local] = swap;
		}
	}

	public void moverPraEsquerda() {
		Integer local = this.localizacaoNull();
		if (this.localizacaoNull() - 1 >= 0) {
			Integer swap = tabuleiro[this.localizacaoNull() - 1];
			tabuleiro[this.localizacaoNull() - Integer.valueOf(1)] = 0;
			tabuleiro[local] = swap;
		}
	}

	public Integer localizacaoNull() {
		for (Integer i = Integer.valueOf(0); i < Integer.valueOf(9); i++) {
			if (tabuleiro[i] == Integer.valueOf(0))
				return i;
		}
		return Integer.valueOf(88);
	}

	public void mostrarTabuleiro() {
		System.out.println(tabuleiro[0] + "" + tabuleiro[1] + "" + tabuleiro[2]);
		System.out.println(tabuleiro[3] + "" + tabuleiro[4] + "" + tabuleiro[5]);
		System.out.println(tabuleiro[6] + "" + tabuleiro[7] + "" + tabuleiro[8]);
	}
}