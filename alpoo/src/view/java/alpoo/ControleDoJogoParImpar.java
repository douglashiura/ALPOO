package alpoo;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.SQLException;

import javax.swing.JComboBox;
import javax.swing.JTextField;

import entidade.Aposta;
import entidade.ResultadoDoJogoParImpar;
import jogoparimpar.LojaDoJogoParImpar;

public class ControleDoJogoParImpar implements ActionListener {
	private JTextField entradaDoPrimeiroJogador;
	private JComboBox<ResultadoDoJogoParImpar> entradaDaApostaDoPrimeiroJogador;
	private JTextField entradaDoNomeDoJogador;
	private LojaDoJogoParImpar jogo;

	public ControleDoJogoParImpar(JTextField entradaDoPrimeiroJogador,
			JComboBox<ResultadoDoJogoParImpar> entradaDaApostaDoPrimeiroJogador, JTextField entradaDoNomeDoJogador,
			LojaDoJogoParImpar jogo) {
		this.entradaDoPrimeiroJogador = entradaDoPrimeiroJogador;
		this.entradaDaApostaDoPrimeiroJogador = entradaDaApostaDoPrimeiroJogador;
		this.entradaDoNomeDoJogador = entradaDoNomeDoJogador;
		this.jogo = jogo;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		Integer valor = Integer.valueOf(entradaDoPrimeiroJogador.getText());
		ResultadoDoJogoParImpar aposta = (ResultadoDoJogoParImpar) entradaDaApostaDoPrimeiroJogador.getSelectedItem();
		String nome = entradaDoNomeDoJogador.getText();
		try {
			jogo.fixaJogada(new Aposta(nome, aposta, valor));
		} catch (SQLException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
	}
}
