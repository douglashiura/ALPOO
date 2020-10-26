package br.ies.aula.alpoo.jogo.parimpar;

import java.awt.Component;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.SQLException;

import javax.swing.JComponent;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.SwingUtilities;

import br.ies.aula.alpoo.jogo.parimpar.dao.PessoaDao;
import br.ies.aula.alpoo.jogo.parimpar.entidade.Pessoa;

public class ControleJanelaLoguin implements ActionListener{

	private PessoaDao pessoaDao;
	
	private JTextField textFieldLoguin;
	private JPasswordField textFieldSenha;
	private LojaJogoParImpar jogo;

	public ControleJanelaLoguin(JTextField textFieldLoguin, JPasswordField textFieldSenha, LojaJogoParImpar jogo, PessoaDao pessoaDao) {
		this.textFieldLoguin = textFieldLoguin;
		this.textFieldSenha = textFieldSenha;
		this.jogo = jogo;
		this.pessoaDao = pessoaDao;
	}

	@Override
	public void actionPerformed(ActionEvent event) {
		boolean autenticado = autenticarUsuario(textFieldLoguin.getText());
		
		if (autenticado) {
			new JanelaJogoParImpar(jogo);
			new JanelaJogoParImpar(jogo);
			jogo.iniciarPartida();
			fecharJanela(event);
		} else {
			JOptionPane.showMessageDialog(null, "Loguin ou senha incorretos!");
		}
	}

	private boolean autenticarUsuario(String loguin) {
		try {
			Pessoa pessoa = pessoaDao.pesquisarPorLoguin(loguin);
			
			if (pessoa == null) {
				return false;
			}
			
			if (pessoa.getSenha().equals(String.valueOf(textFieldSenha.getPassword()))) {
				return true;
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return false;
	}
	
	private void fecharJanela(ActionEvent event) {
		JComponent source = (JComponent)event.getSource();
		Component root = SwingUtilities.getRoot(source);
		JFrame janelaCadastro = (JFrame)root;
		janelaCadastro.dispose();
	}
}
