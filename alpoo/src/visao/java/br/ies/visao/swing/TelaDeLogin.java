package br.ies.visao.swing;

import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class TelaDeLogin {

	private JFrame frame;
	private JTextField textField;
	private JTextField textField_1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TelaDeLogin window = new TelaDeLogin();
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
	public TelaDeLogin() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		TelaDeLogin tela = this;
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);

		JLabel lblNewLabel = new JLabel("Usuário");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 22));
		lblNewLabel.setBounds(173, 23, 73, 51);
		frame.getContentPane().add(lblNewLabel);

		JLabel lblSenha = new JLabel("Senha");
		lblSenha.setFont(new Font("Tahoma", Font.PLAIN, 22));
		lblSenha.setBounds(186, 118, 60, 51);
		frame.getContentPane().add(lblSenha);

		textField = new JTextField();
		getTextField().setBounds(173, 75, 86, 20);
		frame.getContentPane().add(getTextField());
		getTextField().setColumns(10);

		textField_1 = new JTextField();
		getTextField_1().setBounds(173, 180, 86, 20);
		frame.getContentPane().add(getTextField_1());
		getTextField_1().setColumns(10);

		JButton btnNewButton = new JButton("Logar");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new ChecadorDeCadastros().checa(tela, frame);
			}
		});
		btnNewButton.setBounds(173, 227, 89, 23);
		frame.getContentPane().add(btnNewButton);
	}

	public JTextField getTextField() {
		return textField;
	}

	public JTextField getTextField_1() {
		return textField_1;
	}
}
