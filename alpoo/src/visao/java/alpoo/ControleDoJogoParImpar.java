package alpoo;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JComboBox;
import javax.swing.JTextField;

import br.ies.aula.alpoo.jogo.JogoParImpar;
import br.ies.aula.alpoo.jogo.ResultadosDoJogoParImpar;

public class ControleDoJogoParImpar implements ActionListener {
	private JTextField entradaDoPrimeiroJogador;
	private JComboBox<ResultadosDoJogoParImpar> entradaDaApostaDoPrimeiroJogador;
	private JTextField entradaDoNomeDoJogador;

	public ControleDoJogoParImpar(JTextField entradaDoPrimeiroJogador,
			JComboBox<ResultadosDoJogoParImpar> entradaDaApostaDoPrimeiroJogador, JTextField entradaDoNomeDoJogador) {
		this.entradaDoPrimeiroJogador = entradaDoPrimeiroJogador;
		this.entradaDaApostaDoPrimeiroJogador = entradaDaApostaDoPrimeiroJogador;
		this.entradaDoNomeDoJogador = entradaDoNomeDoJogador;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		Integer valor = Integer.valueOf(entradaDoPrimeiroJogador.getText());
		ResultadosDoJogoParImpar aposta = (ResultadosDoJogoParImpar) entradaDaApostaDoPrimeiroJogador.getSelectedItem();
		String nome = entradaDoNomeDoJogador.getText();
		JogoParImpar.obterInstancia().fixaJogada(nome, aposta, valor);
	}
}
