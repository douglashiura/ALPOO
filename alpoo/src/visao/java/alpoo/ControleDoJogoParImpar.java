package alpoo;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

import br.ies.aula.alpoo.jogo.JogoParImpar;
import br.ies.aula.alpoo.jogo.ResultadosDoJogoParImpar;

public class ControleDoJogoParImpar implements ActionListener {
	private JTextField entradaDoPrimeiroJogador;
	private JTextField entradaDoSegundoJogador;

	public ControleDoJogoParImpar(JTextField entradaDoPrimeiroJogador, 
			JComboBox<ResultadosDoJogoParImpar> entradaDaApostaDoPrimeiroJogador) {
		this.entradaDoPrimeiroJogador = entradaDoPrimeiroJogador;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		Integer primeiro = Integer.valueOf(entradaDoPrimeiroJogador.getText());
		Integer segundo = Integer.valueOf(entradaDoSegundoJogador.getText());
		JogoParImpar instancia = JogoParImpar.obterInstancia();
		instancia.fixaJogadas(primeiro, segundo);
		JOptionPane.showMessageDialog(null, String.format("O resultado foi %s", instancia.parOuImpar()));
	}
}
