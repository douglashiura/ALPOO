package br.ies.visao.swing;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.HashMap;
import java.util.Map;

import javax.swing.JLabel;

import br.ies.main.tabuleiro.ControleDoTabuleiro;

public class Teclado implements KeyListener {

	private ControleDoTabuleiro controle;
	private JLabel superiorEsquerdo;
	private JLabel superiorCentral;
	private JLabel superiorDireita;
	private JLabel centroEsquerda;
	private JLabel centroCentral;
	private JLabel centroDireita;
	private JLabel inferiorCentral;
	private JLabel inferiorEsquerdo;
	private JLabel inferiorDireita;
	private TelaSwingJogoDoOito tela;

	public Teclado(ControleDoTabuleiro controle, JLabel superiorEsquerdo, JLabel superiorCentral,
			JLabel superiorDireita, JLabel centroEsquerda, JLabel centroCentral, JLabel centroDireita,
			JLabel inferiorCentral, JLabel inferiorEsquerdo, JLabel inferiorDireita, TelaSwingJogoDoOito tela) {

		this.controle = controle;
		this.superiorEsquerdo = superiorEsquerdo;
		this.superiorCentral = superiorCentral;
		this.superiorDireita = superiorDireita;
		this.centroEsquerda = centroEsquerda;
		this.centroCentral = centroCentral;
		this.centroDireita = centroDireita;
		this.inferiorCentral = inferiorCentral;
		this.inferiorEsquerdo = inferiorEsquerdo;
		this.inferiorDireita = inferiorDireita;
		this.tela = tela;
	}

	@Override
	public void keyTyped(KeyEvent e) {

	}

	@Override
	public void keyPressed(KeyEvent e) {
		Map<Integer, Runnable> mapa = new HashMap<Integer, Runnable>();
		mapa.put(KeyEvent.VK_W, () -> controle.moverPraBaixo());
		mapa.put(KeyEvent.VK_S, () -> controle.moverPraCima());
		mapa.put(KeyEvent.VK_A, () -> controle.moverPraDireita());
		mapa.put(KeyEvent.VK_D, () -> controle.moverPraEsquerda());

		mapa.get(e.getKeyCode()).run();

		tela.atualizaTodasAsCelulas(superiorEsquerdo, superiorCentral, superiorDireita, centroEsquerda, centroCentral,
				centroDireita, inferiorCentral, inferiorEsquerdo, inferiorDireita);

	}

	@Override
	public void keyReleased(KeyEvent e) {

	}

}
