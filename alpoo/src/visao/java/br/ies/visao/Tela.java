package br.ies.visao;

import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

import br.ies.main.tabuleiro.ControleDoTabuleiro;
import br.ies.main.tabuleiro.OrganizadorDeTabuleiro;

public class Tela {

	private JFrame frame;
	private ControleDoTabuleiro controle = new ControleDoTabuleiro(new OrganizadorDeTabuleiro());

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Tela window = new Tela();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Tela() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setBounds(122, 91, 46, 14);
		frame.getContentPane().add(lblNewLabel);

		JButton btnNewButton = new JButton("Cima");
		btnNewButton.setBounds(156, 0, 107, 23);
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				controle.moverPraCima();
			}
		});

		JButton btnNewButton_1 = new JButton("Esquerda");
		btnNewButton_1.setBounds(0, 119, 89, 23);
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				controle.moverPraEsquerda();
				lblNewLabel.setText(controle.getTabuleiro().getCentro().toString());

			}
		});
		frame.getContentPane().setLayout(null);
		frame.getContentPane().add(btnNewButton_1);
		frame.getContentPane().add(btnNewButton);

		JButton btnNewButton_2 = new JButton("Direita");
		btnNewButton_2.setBounds(345, 119, 89, 23);
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				controle.moverPraDireita();
			}
		});
		frame.getContentPane().add(btnNewButton_2);

		JButton btnNewButton_3 = new JButton("Baixo");
		btnNewButton_3.setBounds(156, 238, 107, 23);
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				controle.moverPraBaixo();

			}
		});
		frame.getContentPane().add(btnNewButton_3);

	}
}
