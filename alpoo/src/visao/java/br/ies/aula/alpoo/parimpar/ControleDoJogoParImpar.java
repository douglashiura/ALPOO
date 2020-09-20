package br.ies.aula.alpoo.parimpar;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JComboBox;
import javax.swing.JTextField;

import br.ies.aula.alpoo.jogo.parimpar.LojaDoJogoParImpar;
import br.ies.aula.alpoo.jogo.parimpar.entidade.Aposta;
import br.ies.aula.alpoo.jogo.parimpar.entidade.ResultadosDoJogoParImpar;

public class ControleDoJogoParImpar implements ActionListener {
	private JTextField entradaDoPrimeiroJogador;
	private JComboBox<ResultadosDoJogoParImpar> entradaDaApostaDoPrimeiroJogador;
	private JTextField entradaDoNomeDoJogador;
	private LojaDoJogoParImpar jogo;

	public ControleDoJogoParImpar(JTextField entradaDoPrimeiroJogador,
			JComboBox<ResultadosDoJogoParImpar> entradaDaApostaDoPrimeiroJogador, JTextField entradaDoNomeDoJogador,
			LojaDoJogoParImpar jogo) {
		this.entradaDoPrimeiroJogador = entradaDoPrimeiroJogador;
		this.entradaDaApostaDoPrimeiroJogador = entradaDaApostaDoPrimeiroJogador;
		this.entradaDoNomeDoJogador = entradaDoNomeDoJogador;
		this.jogo = jogo;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		Integer valor = Integer.valueOf(entradaDoPrimeiroJogador.getText());
		ResultadosDoJogoParImpar aposta = (ResultadosDoJogoParImpar) entradaDaApostaDoPrimeiroJogador.getSelectedItem();
		String nome = entradaDoNomeDoJogador.getText();
		jogo.fixaJogada(new Aposta(nome, aposta, valor));
	}
}
