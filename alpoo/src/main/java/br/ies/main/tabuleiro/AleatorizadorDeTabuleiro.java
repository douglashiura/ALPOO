package br.ies.main.tabuleiro;

import java.util.HashMap;
import java.util.Random;

public class AleatorizadorDeTabuleiro {

	private Tabuleiro tabuleiro;

	public AleatorizadorDeTabuleiro(Tabuleiro tabuleiro) {
		this.setTabuleiro(tabuleiro);
		aleatorizar(this.tabuleiro);
	}

	public void setTabuleiro(Tabuleiro tabuleiro) {
		this.tabuleiro = tabuleiro;
	}

	public void aleatorizar(Tabuleiro tabuleiro) {
		HashMap<Integer, Runnable> mapaDeMovimentos = new HashMap<Integer, Runnable>();
		ControleDoTabuleiro controle = new ControleDoTabuleiro(tabuleiro);

		mapaDeMovimentos.put(0, () -> controle.moverPraBaixo());
		mapaDeMovimentos.put(1, () -> controle.moverPraCima());
		mapaDeMovimentos.put(2, () -> controle.moverPraDireita());
		mapaDeMovimentos.put(3, () -> controle.moverPraEsquerda());

		Random random = new Random();

		for (int i = 0; i != 666; i++) {
			mapaDeMovimentos.get(random.nextInt(4)).run();
		}
	}
}
