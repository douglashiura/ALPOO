package br.ies.visao;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;

import br.ies.main.tabuleiro.ControleDoTabuleiro;
import br.ies.main.tabuleiro.Tabuleiro;

public class TelaSwingJogoDoOito {

	private JFrame frmJogoDoOito;
	private ControleDoTabuleiro controle = new ControleDoTabuleiro(new Tabuleiro());

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TelaSwingJogoDoOito window = new TelaSwingJogoDoOito();
					window.frmJogoDoOito.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public TelaSwingJogoDoOito() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmJogoDoOito = new JFrame();
		frmJogoDoOito.getContentPane().setBackground(Color.WHITE);
		frmJogoDoOito.setTitle("Jogo Do Oito");
		frmJogoDoOito.setBounds(100, 100, 450, 300);
		frmJogoDoOito.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		JLabel superiorEsquerdo = new JLabel(controle.getTabuleiro().getSuperiorEsquerda().toString());
		superiorEsquerdo.setHorizontalAlignment(SwingConstants.CENTER);
		superiorEsquerdo.setBackground(Color.BLACK);
		superiorEsquerdo.setBounds(117, 28, 34, 34);
		frmJogoDoOito.getContentPane().add(superiorEsquerdo);

		JLabel superiorCentral = new JLabel(controle.getTabuleiro().getSuperiorCentral().toString());
		superiorCentral.setHorizontalAlignment(SwingConstants.CENTER);
		superiorCentral.setBackground(Color.BLACK);
		superiorCentral.setBounds(190, 28, 34, 34);
		frmJogoDoOito.getContentPane().add(superiorCentral);

		JLabel superiorDireita = new JLabel(controle.getTabuleiro().getSuperiorDireita().toString());
		superiorDireita.setHorizontalAlignment(SwingConstants.CENTER);
		superiorDireita.setBackground(Color.BLACK);
		superiorDireita.setBounds(262, 28, 34, 34);
		frmJogoDoOito.getContentPane().add(superiorDireita);

		JLabel centroEsquerda = new JLabel(controle.getTabuleiro().getCentroEsquerda().toString());
		centroEsquerda.setHorizontalAlignment(SwingConstants.CENTER);
		centroEsquerda.setBackground(Color.BLACK);
		centroEsquerda.setBounds(117, 73, 34, 34);
		frmJogoDoOito.getContentPane().add(centroEsquerda);

		JLabel centroCentral = new JLabel(controle.getTabuleiro().getCentro().toString());
		centroCentral.setHorizontalAlignment(SwingConstants.CENTER);
		centroCentral.setBackground(Color.BLACK);
		centroCentral.setBounds(190, 73, 34, 34);
		frmJogoDoOito.getContentPane().add(centroCentral);

		JLabel centroDireita = new JLabel(controle.getTabuleiro().getCentroDireita().toString());
		centroDireita.setHorizontalAlignment(SwingConstants.CENTER);
		centroDireita.setBackground(Color.BLACK);
		centroDireita.setBounds(262, 73, 34, 34);
		frmJogoDoOito.getContentPane().add(centroDireita);

		JLabel inferiorCentral = new JLabel(controle.getTabuleiro().getInferiorCentral().toString());
		inferiorCentral.setHorizontalAlignment(SwingConstants.CENTER);
		inferiorCentral.setBackground(Color.BLACK);
		inferiorCentral.setBounds(190, 118, 34, 34);
		frmJogoDoOito.getContentPane().add(inferiorCentral);

		JLabel inferiorEsquerdo = new JLabel(controle.getTabuleiro().getInferiorEsquerda().toString());
		inferiorEsquerdo.setHorizontalAlignment(SwingConstants.CENTER);
		inferiorEsquerdo.setBackground(Color.BLACK);
		inferiorEsquerdo.setBounds(117, 118, 34, 34);
		frmJogoDoOito.getContentPane().add(inferiorEsquerdo);

		JLabel inferiorDireita = new JLabel(controle.getTabuleiro().getInferiorDireita().toString());
		inferiorDireita.setHorizontalAlignment(SwingConstants.CENTER);
		inferiorDireita.setBackground(Color.BLACK);
		inferiorDireita.setBounds(262, 118, 34, 34);
		frmJogoDoOito.getContentPane().add(inferiorDireita);

		JButton botaoCima = new JButton("Cima");
		botaoCima.setBounds(156, 190, 107, 23);

		ActionListener cimaPressionado = new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				controle.moverPraBaixo();
				atualizeTodasAsCelulas(superiorEsquerdo, superiorCentral, superiorDireita, centroEsquerda,
						centroCentral, centroDireita, inferiorCentral, inferiorEsquerdo, inferiorDireita);
			}
		};

		botaoCima.addActionListener(cimaPressionado);

		JButton botaoEsquerda = new JButton("Esquerda");
		botaoEsquerda.setBounds(117, 214, 89, 23);

		ActionListener esquerdaPressionado = new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				controle.moverPraDireita();
				atualizeTodasAsCelulas(superiorEsquerdo, superiorCentral, superiorDireita, centroEsquerda,
						centroCentral, centroDireita, inferiorCentral, inferiorEsquerdo, inferiorDireita);
			}
		};

		botaoEsquerda.addActionListener(esquerdaPressionado);
		frmJogoDoOito.getContentPane().setLayout(null);
		frmJogoDoOito.getContentPane().add(botaoEsquerda);
		frmJogoDoOito.getContentPane().add(botaoCima);

		JButton botaoDireita = new JButton("Direita");
		botaoDireita.setBounds(213, 214, 89, 23);

		ActionListener direitaPressionado = new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				controle.moverPraEsquerda();
				atualizeTodasAsCelulas(superiorEsquerdo, superiorCentral, superiorDireita, centroEsquerda,
						centroCentral, centroDireita, inferiorCentral, inferiorEsquerdo, inferiorDireita);
			}
		};

		botaoDireita.addActionListener(direitaPressionado);
		frmJogoDoOito.getContentPane().add(botaoDireita);

		JButton botaoBaixo = new JButton("Baixo");
		botaoBaixo.setBounds(156, 238, 107, 23);

		ActionListener baixoPressionado = new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				controle.moverPraCima();
				atualizeTodasAsCelulas(superiorEsquerdo, superiorCentral, superiorDireita, centroEsquerda,
						centroCentral, centroDireita, inferiorCentral, inferiorEsquerdo, inferiorDireita);
			}
		};

		botaoBaixo.addActionListener(baixoPressionado);
		frmJogoDoOito.getContentPane().add(botaoBaixo);

		KeyListener teclado = new KeyListener() {

			@Override
			public void keyTyped(KeyEvent e) {
			}

			@Override
			public void keyReleased(KeyEvent e) {
			}

			@Override
			public void keyPressed(KeyEvent e) {
				Map<Integer, Runnable> mapa = new HashMap<Integer, Runnable>();
				mapa.put(KeyEvent.VK_W, () -> controle.moverPraBaixo());
				mapa.put(KeyEvent.VK_S, () -> controle.moverPraCima());
				mapa.put(KeyEvent.VK_A, () -> controle.moverPraDireita());
				mapa.put(KeyEvent.VK_D, () -> controle.moverPraEsquerda());

				mapa.get(e.getKeyCode()).run();

				atualizeTodasAsCelulas(superiorEsquerdo, superiorCentral, superiorDireita, centroEsquerda,
						centroCentral, centroDireita, inferiorCentral, inferiorEsquerdo, inferiorDireita);
			}
		};

		botaoCima.addKeyListener(teclado);

		atualizeTodasAsCelulas(superiorEsquerdo, superiorCentral, superiorDireita, centroEsquerda, centroCentral,
				centroDireita, inferiorCentral, inferiorEsquerdo, inferiorDireita);
	}

	private void atualizeTodasAsCelulas(JLabel superiorEsquerdo, JLabel superiorCentral, JLabel superiorDireita,
			JLabel centroEsquerda, JLabel centroCentral, JLabel centroDireita, JLabel inferiorCentral,
			JLabel inferiorEsquerdo, JLabel inferiorDireita) {
		superiorEsquerdo.setText(controle.getTabuleiro().getSuperiorEsquerda().toString());
		superiorCentral.setText(controle.getTabuleiro().getSuperiorCentral().toString());
		superiorDireita.setText(controle.getTabuleiro().getSuperiorDireita().toString());
		centroEsquerda.setText(controle.getTabuleiro().getCentroEsquerda().toString());
		centroCentral.setText(controle.getTabuleiro().getCentro().toString());
		centroDireita.setText(controle.getTabuleiro().getCentroDireita().toString());
		inferiorCentral.setText(controle.getTabuleiro().getInferiorCentral().toString());
		inferiorEsquerdo.setText(controle.getTabuleiro().getInferiorEsquerda().toString());
		inferiorDireita.setText(controle.getTabuleiro().getInferiorDireita().toString());

		pintarDeBranco(superiorEsquerdo, superiorCentral, superiorDireita, centroEsquerda, centroCentral, centroDireita,
				inferiorCentral, inferiorEsquerdo, inferiorDireita);
	}

	private void pintarDeBranco(JLabel superiorEsquerdo, JLabel superiorCentral, JLabel superiorDireita,
			JLabel centroEsquerda, JLabel centroCentral, JLabel centroDireita, JLabel inferiorCentral,
			JLabel inferiorEsquerdo, JLabel inferiorDireita) {

		List<JLabel> listaDeTextos = new ArrayList<JLabel>();

		listaDeTextos.add(superiorEsquerdo);
		listaDeTextos.add(superiorCentral);
		listaDeTextos.add(superiorDireita);
		listaDeTextos.add(centroEsquerda);
		listaDeTextos.add(centroCentral);
		listaDeTextos.add(centroDireita);
		listaDeTextos.add(inferiorCentral);
		listaDeTextos.add(inferiorEsquerdo);
		listaDeTextos.add(inferiorDireita);

		for (JLabel x : listaDeTextos) {
			try {
				Map<String, Runnable> mapa = new HashMap<String, Runnable>();
				mapa.put("0", () -> x.setText(""));
				mapa.get(x.getText()).run();
			} catch (NullPointerException e) {

			}

		}

	}
}
