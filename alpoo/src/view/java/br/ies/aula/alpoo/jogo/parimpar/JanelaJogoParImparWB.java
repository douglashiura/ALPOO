package br.ies.aula.alpoo.jogo.parimpar;

import java.awt.EventQueue;

import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;

import br.ies.aula.alpoo.jogo.parimpar.entidade.ResultadosParImpar;

public class JanelaJogoParImparWB extends JFrame {


	private static final long serialVersionUID = 1L;
	
	private JPanel contentPane;
	private JTextField textFieldNome;
	private JTextField textFieldJogada;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					JanelaJogoParImparWB frame = new JanelaJogoParImparWB();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public JanelaJogoParImparWB() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 250, 200);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		
		JLabel labelNome = new JLabel("Nome Jogador:");
		labelNome.setHorizontalAlignment(SwingConstants.LEFT);
		labelNome.setBounds(15, 18, 73, 17);
		
		JLabel labelJogada = new JLabel("Jogada Jogador:");
		labelJogada.setHorizontalAlignment(SwingConstants.LEFT);
		labelJogada.setBounds(15, 45, 81, 14);
		
		JLabel labelAposta = new JLabel("Aposta Jogador:");
		labelAposta.setHorizontalAlignment(SwingConstants.LEFT);
		labelAposta.setBounds(15, 71, 80, 14);
		
		textFieldNome = new JTextField();
		textFieldNome.setBounds(106, 16, 86, 20);
		textFieldNome.setColumns(10);
		
		textFieldJogada = new JTextField();
		textFieldJogada.setBounds(106, 42, 86, 20);
		textFieldJogada.setColumns(10);
		
		JComboBox<ResultadosParImpar> comboBoxAposta = new JComboBox<ResultadosParImpar>();
		comboBoxAposta.setBounds(105, 68, 87, 20);
		comboBoxAposta.setModel(new DefaultComboBoxModel<ResultadosParImpar>(ResultadosParImpar.values()));
		
		JButton botaoJogar = new JButton("Jogar");
		botaoJogar.setBounds(77, 99, 59, 23);
		contentPane.setLayout(null);
		contentPane.add(labelNome);
		contentPane.add(textFieldNome);
		contentPane.add(labelJogada);
		contentPane.add(textFieldJogada);
		contentPane.add(labelAposta);
		contentPane.add(comboBoxAposta);
		contentPane.add(botaoJogar);
	}
}
