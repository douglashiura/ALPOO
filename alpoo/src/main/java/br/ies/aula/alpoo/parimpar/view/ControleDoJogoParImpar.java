package br.ies.aula.alpoo.parimpar.view;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.SQLException;

import javax.swing.JComboBox;
import javax.swing.JTextField;

import br.ies.aula.alpoo.parimpar.controller.LojaDoJogoParImpar;
import br.ies.aula.alpoo.parimpar.model.Aposta;
import br.ies.aula.alpoo.parimpar.model.Pessoa;
import br.ies.aula.alpoo.parimpar.model.ResultadosDoJogoParImpar;

public class ControleDoJogoParImpar implements ActionListener {
	private JTextField entradaDoPrimeiroJogador;
	private JComboBox<ResultadosDoJogoParImpar> entradaDaApostaDoPrimeiroJogador;
	private LojaDoJogoParImpar jogo;
	private Pessoa pessoa;
		

	public ControleDoJogoParImpar(JTextField entradaDoPrimeiroJogador,
			JComboBox<ResultadosDoJogoParImpar> entradaDaApostaDoPrimeiroJogador,LojaDoJogoParImpar jogo, Pessoa pessoa) {
		this.entradaDoPrimeiroJogador = entradaDoPrimeiroJogador;
		this.entradaDaApostaDoPrimeiroJogador = entradaDaApostaDoPrimeiroJogador;
		this.jogo = jogo;
		this.pessoa = pessoa;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		Integer valor = Integer.valueOf(entradaDoPrimeiroJogador.getText());
		ResultadosDoJogoParImpar aposta = (ResultadosDoJogoParImpar) entradaDaApostaDoPrimeiroJogador.getSelectedItem();
		try {
			jogo.fixaJogada(new Aposta(pessoa, aposta, valor));
		} catch (SQLException e1) {
			e1.printStackTrace();
		}
	}
}