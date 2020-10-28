package br.ies.aula.alpoo.jogo.parimpar;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

import br.ies.aula.alpoo.jogo.parimpar.dao.implementacao.jdbc.PessoaDaoJdbc;

public class JanelaLoguin extends JFrame{

	private static final long serialVersionUID = 1L;
	
	private JLabel labelLoguin;
	private JLabel labelSenha;
	private JTextField textFieldLoguin;
	private JPasswordField textFieldSenha;
	private JButton botaoLogar;
	private JButton botaoSair;
	private JButton botaoCadastrar;

	private LojaJogoParImpar jogo;
	
	public JanelaLoguin(LojaJogoParImpar jogo) {
		this.jogo = jogo;
		configurarTela();
		montarTela();
		setLocationRelativeTo(null);
		setVisible(true);
	}

	private void configurarTela() {
		setTitle("LOGUIN - JOGO PAR OU IMPAR");		
		setSize(350, 250);
		setLayout(null);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

	private void montarTela() {
		montarLabels();
		montarTextFields();
		montarBotoes();
	}

	private void montarLabels() {
		labelLoguin = new JLabel("Loguin: ");
		labelLoguin.setSize(50, 20);
		labelLoguin.setLocation(50, 40);
		
		labelSenha = new JLabel("Senha: ");
		labelSenha.setSize(50, 20);
		labelSenha.setLocation(50, 80);
		
		add(labelLoguin);
		add(labelSenha);
	}
	
	private void montarTextFields() {
		textFieldLoguin = new JTextField();
		textFieldLoguin.setSize(150, 25);
		textFieldLoguin.setLocation(110, 40);
		
		textFieldSenha = new JPasswordField();
		textFieldSenha.setSize(150, 25);
		textFieldSenha.setLocation(110, 80);
		
		add(textFieldLoguin);
		add(textFieldSenha);
	}
	
	private void montarBotoes() {
		botaoLogar = new JButton("Logar");
		botaoLogar.setSize(70, 25);
		botaoLogar.setLocation(110, 120);
		botaoLogar.addActionListener(new ControleJanelaLoguin(textFieldLoguin, textFieldSenha, jogo, new PessoaDaoJdbc()));
				
//				new ActionListener() {
//			
//			@Override
//			public void actionPerformed(ActionEvent e) {
//				new JanelaJogoParImpar(jogo);
//				new JanelaJogoParImpar(jogo);
//				jogo.iniciarPartida();
//				dispose();
//			}
//		}
		
		botaoSair = new JButton("Sair");
		botaoSair.setSize(70, 25);
		botaoSair.setLocation(190, 120);
		botaoSair.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				dispose();
			}
		});
		
		botaoCadastrar = new JButton("Cadastrar");
		botaoCadastrar.setSize(150, 25);
		botaoCadastrar.setLocation(110, 160);
		botaoCadastrar.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				new JanelaCadastro();
			}
		});
		
		add(botaoLogar);
		add(botaoSair);
		add(botaoCadastrar);
	}
	
	public static void main(String[] args) {
		LojaJogoParImpar jogo = new LojaJogoParImpar();
		new JanelaLoguin(jogo);
	}

}
