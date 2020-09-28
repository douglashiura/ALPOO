package alpoo;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.FlowLayout;
import javax.swing.JLabel;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JComboBox;

public class TelaWindowBuilder extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TelaWindowBuilder frame = new TelaWindowBuilder();
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
	public TelaWindowBuilder() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Digite nome");
		lblNewLabel.setBounds(10, 11, 79, 14);
		contentPane.add(lblNewLabel);
		
		textField = new JTextField();
		textField.setBounds(89, 8, 86, 20);
		contentPane.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(89, 36, 86, 20);
		contentPane.add(textField_1);
		
		JLabel lblDeigiteOValor = new JLabel("Digite o valor");
		lblDeigiteOValor.setBounds(10, 39, 79, 14);
		contentPane.add(lblDeigiteOValor);
		
		JLabel lblInsiraAposta = new JLabel("Insira Aposta");
		lblInsiraAposta.setBounds(10, 70, 79, 14);
		contentPane.add(lblInsiraAposta);
		
		JButton btnNewButton = new JButton("Jogar");
		btnNewButton.setBounds(155, 182, 89, 23);
		contentPane.add(btnNewButton);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setBounds(89, 67, 86, 20);
		contentPane.add(comboBox);
	}
}
