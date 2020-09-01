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
	private JogoParImpar jogo;

	public ControleDoJogoParImpar(JTextField entradaDoPrimeiroJogador, JTextField entradaDoSegundoJogador,
			JComboBox<ResultadosDoJogoParImpar> entradaDaApostaDoPrimeiroJogador) {
		this.entradaDoPrimeiroJogador = entradaDoPrimeiroJogador;
		this.entradaDoSegundoJogador = entradaDoSegundoJogador;
		this.jogo = new JogoParImpar();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		Integer primeiro = Integer.valueOf(entradaDoPrimeiroJogador.getText());
		Integer segundo = Integer.valueOf(entradaDoSegundoJogador.getText());
		jogo.fixaJogadas(primeiro, segundo);

		JOptionPane.showMessageDialog(null, String.format("O resultado foi %s", jogo.parOuImpar()));
	}
}
