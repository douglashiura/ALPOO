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
	private JComboBox<ResultadosDoJogoParImpar> entradaDaApostaDoPrimeiroJogador;

	public ControleDoJogoParImpar(JTextField entradaDoPrimeiroJogador, JTextField entradaDoSegundoJogador,
			JComboBox<ResultadosDoJogoParImpar> entradaDaApostaDoPrimeiroJogador) {
		this.entradaDoPrimeiroJogador = entradaDoPrimeiroJogador;
		this.entradaDoSegundoJogador = entradaDoSegundoJogador;
		this.jogo = new JogoParImpar();
		this.entradaDaApostaDoPrimeiroJogador = entradaDaApostaDoPrimeiroJogador;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		try {
			Integer primeiro = Integer.valueOf(entradaDoPrimeiroJogador.getText());
			Integer segundo = Integer.valueOf(entradaDoSegundoJogador.getText());
			ResultadosDoJogoParImpar apostaPrimeiroJogador = (ResultadosDoJogoParImpar)entradaDaApostaDoPrimeiroJogador.getSelectedItem();
			jogo.fixaJogadas(primeiro, segundo);
			
			ResultadosDoJogoParImpar resultado = jogo.parOuImpar();
			
			if(apostaPrimeiroJogador == resultado) {
				JOptionPane.showMessageDialog(null, "O primeiro jogador GANHOU, apostando em: " + resultado);
			}else {
				JOptionPane.showMessageDialog(null, "O segundo jogador GANHOU, apostando em: " + resultado);
			}
		}catch (NumberFormatException ex) {
			JOptionPane.showMessageDialog(null, "Insira valores validos");
		}
		
		
		
	}
}