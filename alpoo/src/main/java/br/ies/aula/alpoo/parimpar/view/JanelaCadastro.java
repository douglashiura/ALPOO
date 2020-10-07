package br.ies.aula.alpoo.parimpar.view;


import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;


import br.ies.aula.alpoo.parimpar.controller.LojaDoJogoParImpar;
import br.ies.aula.alpoo.parimpar.controller.DAO.PessoaDAO;
import br.ies.aula.alpoo.parimpar.controller.ouvinte.OuvinteVencedor;
import br.ies.aula.alpoo.parimpar.model.Pessoa;

import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.sql.SQLException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.awt.event.ActionEvent;

public class JanelaCadastro extends JFrame {

	private JPanel contentPane;
	private JTextField inputNomePrimeiraPessoa;
	private JTextField inputDataNascPrimeiraPessoa;
	private JTextField inputNomeSegundaPessoa;
	private JTextField inputDataNascSegundaPessoa;


	public JanelaCadastro() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Cadastro");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblNewLabel.setBounds(179, 11, 75, 14);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Nome 1");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblNewLabel_1.setBounds(55, 45, 66, 14);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Data de Nascimento 1");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblNewLabel_2.setBounds(55, 86, 155, 14);
		contentPane.add(lblNewLabel_2);
		
		inputNomePrimeiraPessoa = new JTextField();
		inputNomePrimeiraPessoa.setBounds(220, 44, 166, 20);
		contentPane.add(inputNomePrimeiraPessoa);
		inputNomePrimeiraPessoa.setColumns(10);
		
		inputDataNascPrimeiraPessoa = new JTextField();
		inputDataNascPrimeiraPessoa.setBounds(220, 85, 166, 20);
		contentPane.add(inputDataNascPrimeiraPessoa);
		inputDataNascPrimeiraPessoa.setColumns(10);
		
		JButton btnNewButton = new JButton("Jogar");

		btnNewButton.setBounds(165, 227, 89, 23);
		contentPane.add(btnNewButton);
		
		JLabel lblNewLabel_3 = new JLabel("Nome 2");
		lblNewLabel_3.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblNewLabel_3.setBounds(55, 141, 66, 14);
		contentPane.add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("Data de Nascimento 2");
		lblNewLabel_4.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblNewLabel_4.setBounds(55, 181, 155, 14);
		contentPane.add(lblNewLabel_4);
		
		inputNomeSegundaPessoa = new JTextField();
		inputNomeSegundaPessoa.setColumns(10);
		inputNomeSegundaPessoa.setBounds(220, 140, 166, 20);
		contentPane.add(inputNomeSegundaPessoa);
		
		inputDataNascSegundaPessoa = new JTextField();
		inputDataNascSegundaPessoa.setColumns(10);
		inputDataNascSegundaPessoa.setBounds(220, 175, 166, 20);
		contentPane.add(inputDataNascSegundaPessoa);
		
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				PessoaDAO pessoaDao = new PessoaDAO();
				try {
					String nomePrimeiraPessoa = inputNomePrimeiraPessoa.getText();
					Date dtNascPrimeiraPessoa = new SimpleDateFormat("dd/MM/yyyy").parse(inputDataNascPrimeiraPessoa.getText());
					String nomeSegundaPessoa = inputNomeSegundaPessoa.getText();
					Date dtNascSegundaPessoa = new SimpleDateFormat("dd/MM/yyyy").parse(inputDataNascSegundaPessoa.getText());
					LojaDoJogoParImpar jogo = new LojaDoJogoParImpar();
					Pessoa primeiraPessoa = new Pessoa(nomePrimeiraPessoa,dtNascPrimeiraPessoa);
					pessoaDao.inserirPessoa(primeiraPessoa);
					Pessoa segundaPessoa = new Pessoa(nomeSegundaPessoa, dtNascSegundaPessoa);
					pessoaDao.inserirPessoa(segundaPessoa);
					new JanelaDoJogoParImpar(jogo, primeiraPessoa);
					new JanelaDoJogoParImpar(jogo, segundaPessoa);
					jogo.adicionarUmOuvinteDeResultado(new OuvinteVencedor());
				} catch(ParseException p) {
					JOptionPane.showMessageDialog(null, "Datas inválidas");
				} catch(SQLException e) {
					JOptionPane.showMessageDialog(null, "Erro ao inserir pessoa no banco");
				}
			}
		});
		setVisible(true);
	}

	public static void main(String[] args) {
		new JanelaCadastro();
	}

}
