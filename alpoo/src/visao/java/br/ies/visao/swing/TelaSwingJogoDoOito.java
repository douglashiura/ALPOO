package br.ies.visao.swing;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyListener;

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
				atualizaTodasAsCelulas(superiorEsquerdo, superiorCentral, superiorDireita, centroEsquerda,
						centroCentral, centroDireita, inferiorCentral, inferiorEsquerdo, inferiorDireita);
			}
		};

		botaoCima.addActionListener(cimaPressionado);

		JButton botaoEsquerda = new JButton("Esquerda");
		botaoEsquerda.setBounds(117, 214, 89, 23);

		ActionListener esquerdaPressionado = new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				controle.moverPraDireita();
				atualizaTodasAsCelulas(superiorEsquerdo, superiorCentral, superiorDireita, centroEsquerda,
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
				atualizaTodasAsCelulas(superiorEsquerdo, superiorCentral, superiorDireita, centroEsquerda,
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
				atualizaTodasAsCelulas(superiorEsquerdo, superiorCentral, superiorDireita, centroEsquerda,
						centroCentral, centroDireita, inferiorCentral, inferiorEsquerdo, inferiorDireita);
			}
		};

		botaoBaixo.addActionListener(baixoPressionado);
		frmJogoDoOito.getContentPane().add(botaoBaixo);

		KeyListener teclado = new Teclado(controle, superiorEsquerdo, superiorCentral, superiorDireita, centroEsquerda,
				centroCentral, centroDireita, inferiorCentral, inferiorEsquerdo, inferiorDireita, this);

		frmJogoDoOito.addKeyListener(teclado);

		atualizaTodasAsCelulas(superiorEsquerdo, superiorCentral, superiorDireita, centroEsquerda, centroCentral,
				centroDireita, inferiorCentral, inferiorEsquerdo, inferiorDireita);
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
		frmJogoDoOito.setFocusable(true);
		frmJogoDoOito.setFocusTraversalKeysEnabled(false);

	}

}
