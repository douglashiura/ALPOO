package br.ies.aula.alpoo.jogo.parimpar;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

import br.ies.aula.alpoo.jogo.parimpar.dao.implementacao.jdbc.PessoaDaoJdbc;
import net.sourceforge.jdatepicker.impl.JDatePanelImpl;
import net.sourceforge.jdatepicker.impl.JDatePickerImpl;
import net.sourceforge.jdatepicker.impl.SqlDateModel;

public class JanelaCadastro extends JFrame {

	private static final long serialVersionUID = 1L;

	private JLabel labelNome;
	private JLabel labelDataNascimento;
	private JLabel labelLoguin;
	private JLabel labelSenha;
	private JTextField textFieldNome;
	private JTextField textFieldLoguin;
	private JPasswordField textFieldSenha;
	private JDatePickerImpl datePickerDataNascimento;
	private JButton botaoSalvar;
	private JButton botaoSair;
	
	public JanelaCadastro() {
		configurarTela();
		montarTela();
		setLocationRelativeTo(null);
		setVisible(true);
	}


	private void configurarTela() {
		setTitle("CADASTRO - JOGO PAR OU IMPAR");		
		setSize(350, 250);
		setLayout(null);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
	private void montarTela() {
		montarLabels();
		montarTextFields();
		montarDatePicker();
		montarBotoes();
	}

	private void montarLabels() {
		labelNome = new JLabel("Nome: ");
		labelNome.setSize(50, 20);
		labelNome.setLocation(20, 10);
		
		labelDataNascimento = new JLabel("Data Nascimento: ");
		labelDataNascimento.setSize(120, 20);
		labelDataNascimento.setLocation(20, 50);
		
		labelLoguin = new JLabel("Loguin: ");
		labelLoguin.setSize(50, 20);
		labelLoguin.setLocation(20, 90);
		
		labelSenha = new JLabel("Senha: ");
		labelSenha.setSize(50, 20);
		labelSenha.setLocation(20, 130);
		
		add(labelNome);
		add(labelDataNascimento);
		add(labelLoguin);
		add(labelSenha);
	}
	
	private void montarTextFields() {
		textFieldNome = new JTextField();
		textFieldNome.setSize(150, 25);
		textFieldNome.setLocation(130, 10);
		
		textFieldLoguin = new JTextField();
		textFieldLoguin.setSize(150, 25);
		textFieldLoguin.setLocation(130, 90);
		
		textFieldSenha = new JPasswordField();
		textFieldSenha.setSize(150, 25);
		textFieldSenha.setLocation(130, 130);
		
		add(textFieldNome);
		add(textFieldLoguin);
		add(textFieldSenha);
	}
	
	private void montarDatePicker() {
		SqlDateModel model = new SqlDateModel();
		JDatePanelImpl datePanel = new JDatePanelImpl(model);
		datePickerDataNascimento = new JDatePickerImpl(datePanel);
		
		datePickerDataNascimento.setSize(150, 30);
		datePickerDataNascimento.setLocation(130, 50);
		
		add(datePickerDataNascimento);
	}
	
	private void montarBotoes() {
		botaoSalvar = new JButton("Salvar");
		botaoSalvar.setSize(70, 25);
		botaoSalvar.setLocation(130, 170);
		botaoSalvar.addActionListener(new ControleCadastro(textFieldNome, textFieldLoguin, textFieldSenha, datePickerDataNascimento, new PessoaDaoJdbc()));
		
		botaoSair = new JButton("Sair");
		botaoSair.setSize(70, 25);
		botaoSair.setLocation(210, 170);
		botaoSair.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				dispose();
			}
		});
		
		add(botaoSalvar);
		add(botaoSair);
	}
}
