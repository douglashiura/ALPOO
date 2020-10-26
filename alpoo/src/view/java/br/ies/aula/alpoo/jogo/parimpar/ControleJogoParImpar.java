package br.ies.aula.alpoo.jogo.parimpar;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.SQLException;

import javax.swing.JComboBox;
import javax.swing.JTextField;

import br.ies.aula.alpoo.jogo.parimpar.entidade.Aposta;
import br.ies.aula.alpoo.jogo.parimpar.entidade.ResultadosParImpar;

public class ControleJogoParImpar implements ActionListener{

	private LojaJogoParImpar jogo;
	
	private JTextField textFieldNomeDoJogador;
	private JTextField textFieldJogadaDoJogador;
	private JComboBox<ResultadosParImpar> comboBoxApostaDoJogador;

	public ControleJogoParImpar(JTextField textFieldNomeDoJogador, JTextField textFieldJogadaDoJogador, JComboBox<ResultadosParImpar> comboBoxApostaDoJogador, LojaJogoParImpar jogo) {
		this.textFieldNomeDoJogador = textFieldNomeDoJogador;
		this.textFieldJogadaDoJogador = textFieldJogadaDoJogador;
		this.comboBoxApostaDoJogador = comboBoxApostaDoJogador;
		this.jogo = jogo;
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		Aposta aposta = new Aposta(textFieldNomeDoJogador.getText(), Integer.valueOf(textFieldJogadaDoJogador.getText()), (ResultadosParImpar)comboBoxApostaDoJogador.getSelectedItem());
		try {
			jogo.fixarJogada(aposta);
		} catch (SQLException e1) {
			e1.printStackTrace();
		}
	}
}
