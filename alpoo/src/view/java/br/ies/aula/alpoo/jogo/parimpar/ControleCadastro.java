package br.ies.aula.alpoo.jogo.parimpar;

import java.awt.Component;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Date;
import java.time.LocalDate;

import javax.swing.JComponent;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.SwingUtilities;

import br.ies.aula.alpoo.jogo.parimpar.dao.PessoaDao;
import br.ies.aula.alpoo.jogo.parimpar.entidade.Pessoa;
import net.sourceforge.jdatepicker.impl.JDatePickerImpl;

public class ControleCadastro implements ActionListener{
	
	private PessoaDao pessoaDao;
	
	private JTextField textFieldNome;
	private JTextField textFieldLoguin;
	private JPasswordField textFieldSenha;
	private JDatePickerImpl datePickerDataNascimento;

	public ControleCadastro(JTextField textFieldNome, JTextField textFieldLoguin, JPasswordField textFieldSenha, JDatePickerImpl datePickerDataNascimento, PessoaDao pessoaDao) {
		this.textFieldNome = textFieldNome;
		this.textFieldLoguin = textFieldLoguin;
		this.textFieldSenha = textFieldSenha;
		this.datePickerDataNascimento = datePickerDataNascimento;
		this.pessoaDao = pessoaDao;
	}
	
	
	@Override
	public void actionPerformed(ActionEvent event) {
		try {
			String nome = textFieldNome.getText();
			LocalDate dataNascimento = ((Date)datePickerDataNascimento.getModel().getValue()).toLocalDate();
			String loguin = textFieldLoguin.getText();
			String senha = String.valueOf(textFieldSenha.getPassword());
			
			Pessoa pessoa = new Pessoa(null, nome, dataNascimento, loguin, senha);
			pessoaDao.inserir(pessoa);
			
			fecharJanela(event);
			JOptionPane.showMessageDialog(null, "Cadastro efetuado com sucesso!");
			
		} catch (Exception exception) {
			JOptionPane.showMessageDialog(null, "Ocorreu um erro ao efetuar seu cadastro!");
			exception.printStackTrace();
		}
	}

	private void fecharJanela(ActionEvent event) {
		JComponent source = (JComponent)event.getSource();
		Component root = SwingUtilities.getRoot(source);
		JFrame janelaCadastro = (JFrame)root;
		janelaCadastro.dispose();
	}
}
