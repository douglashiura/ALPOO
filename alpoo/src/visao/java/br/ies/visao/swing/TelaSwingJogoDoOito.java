package br.ies.visao.swing;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.KeyListener;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;

import br.ies.main.tabuleiro.ControleDoTabuleiro;
import br.ies.main.tabuleiro.Tabuleiro;

public class TelaSwingJogoDoOito {

	private JFrame frmJogoDoOito;
	private ControleDoTabuleiro controle;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TelaSwingJogoDoOito window = new TelaSwingJogoDoOito();
					window.getFrmJogoDoOito().setVisible(true);
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
		controle = new ControleDoTabuleiro(new Tabuleiro());
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmJogoDoOito = new JFrame();
		getFrmJogoDoOito().getContentPane().setBackground(Color.WHITE);
		getFrmJogoDoOito().setTitle("APS - Jogo Do Oito");
		getFrmJogoDoOito().setBounds(100, 100, 450, 300);
		getFrmJogoDoOito().setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		getFrmJogoDoOito().getContentPane().setLayout(new GridLayout(0, 3, 0, 0));

		JLabel superiorEsquerdo = new JLabel(controle.getTabuleiro().getSuperiorEsquerda().toString());
		superiorEsquerdo.setFont(new Font("Tahoma", Font.PLAIN, 22));
		superiorEsquerdo.setHorizontalAlignment(SwingConstants.CENTER);
		superiorEsquerdo.setBackground(Color.BLACK);
		getFrmJogoDoOito().getContentPane().add(superiorEsquerdo);

		JLabel superiorCentral = new JLabel(controle.getTabuleiro().getSuperiorCentral().toString());
		superiorCentral.setFont(new Font("Tahoma", Font.PLAIN, 22));
		superiorCentral.setHorizontalAlignment(SwingConstants.CENTER);
		superiorCentral.setBackground(Color.BLACK);
		getFrmJogoDoOito().getContentPane().add(superiorCentral);

		JLabel superiorDireita = new JLabel(controle.getTabuleiro().getSuperiorDireita().toString());
		superiorDireita.setFont(new Font("Tahoma", Font.PLAIN, 22));
		superiorDireita.setHorizontalAlignment(SwingConstants.CENTER);
		superiorDireita.setBackground(Color.BLACK);
		getFrmJogoDoOito().getContentPane().add(superiorDireita);

		JLabel centroEsquerda = new JLabel(controle.getTabuleiro().getCentroEsquerda().toString());
		centroEsquerda.setFont(new Font("Tahoma", Font.PLAIN, 22));
		centroEsquerda.setHorizontalAlignment(SwingConstants.CENTER);
		centroEsquerda.setBackground(Color.BLACK);
		getFrmJogoDoOito().getContentPane().add(centroEsquerda);

		JLabel centroCentral = new JLabel(controle.getTabuleiro().getCentro().toString());
		centroCentral.setFont(new Font("Tahoma", Font.PLAIN, 22));
		centroCentral.setHorizontalAlignment(SwingConstants.CENTER);
		centroCentral.setBackground(Color.BLACK);
		getFrmJogoDoOito().getContentPane().add(centroCentral);

		JLabel centroDireita = new JLabel(controle.getTabuleiro().getCentroDireita().toString());
		centroDireita.setFont(new Font("Tahoma", Font.PLAIN, 22));
		centroDireita.setHorizontalAlignment(SwingConstants.CENTER);
		centroDireita.setBackground(Color.BLACK);
		getFrmJogoDoOito().getContentPane().add(centroDireita);

		JLabel inferiorEsquerdo = new JLabel(controle.getTabuleiro().getInferiorEsquerda().toString());
		inferiorEsquerdo.setFont(new Font("Tahoma", Font.PLAIN, 22));
		inferiorEsquerdo.setHorizontalAlignment(SwingConstants.CENTER);
		inferiorEsquerdo.setBackground(Color.BLACK);
		getFrmJogoDoOito().getContentPane().add(inferiorEsquerdo);

		JLabel inferiorCentral = new JLabel(controle.getTabuleiro().getInferiorCentral().toString());
		inferiorCentral.setFont(new Font("Tahoma", Font.PLAIN, 22));
		inferiorCentral.setHorizontalAlignment(SwingConstants.CENTER);
		inferiorCentral.setBackground(Color.BLACK);
		getFrmJogoDoOito().getContentPane().add(inferiorCentral);

		JLabel inferiorDireita = new JLabel(controle.getTabuleiro().getInferiorDireita().toString());
		inferiorDireita.setFont(new Font("Tahoma", Font.PLAIN, 22));
		inferiorDireita.setHorizontalAlignment(SwingConstants.CENTER);
		inferiorDireita.setBackground(Color.BLACK);
		getFrmJogoDoOito().getContentPane().add(inferiorDireita);

		KeyListener teclado = new Teclado(controle, superiorEsquerdo, superiorCentral, superiorDireita, centroEsquerda,
				centroCentral, centroDireita, inferiorCentral, inferiorEsquerdo, inferiorDireita, this);

		atualizaTodasAsCelulas(superiorEsquerdo, superiorCentral, superiorDireita, centroEsquerda, centroCentral,
				centroDireita, inferiorCentral, inferiorEsquerdo, inferiorDireita);

		getFrmJogoDoOito().addKeyListener(teclado);
	}

	public void atualizaTodasAsCelulas(JLabel superiorEsquerdo, JLabel superiorCentral, JLabel superiorDireita,
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

		new PintadorDeCelulasVizinhas().pintarDeCelulas(superiorEsquerdo, superiorCentral, superiorDireita,
				centroEsquerda, centroCentral, centroDireita, inferiorCentral, inferiorEsquerdo, inferiorDireita,
				controle);
		getFrmJogoDoOito().setFocusable(true);
		getFrmJogoDoOito().setFocusTraversalKeysEnabled(false);
	}

	public JFrame getFrmJogoDoOito() {
		return frmJogoDoOito;
	}

}
