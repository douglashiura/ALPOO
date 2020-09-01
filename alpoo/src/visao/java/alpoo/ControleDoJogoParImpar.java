package alpoo;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

import par.impar.JogoParImpar;

public class ControleDoJogoParImpar implements ActionListener {

	JogoParImpar jogo = new JogoParImpar();
	
	JTextField entrada1TextField;
	JTextField entrada2TextField;
	
	JComboBox<?> player1Selecao;
	JComboBox<?> player2Selecao;
	
	public ControleDoJogoParImpar(JTextField entrada1, JTextField entrada2, JComboBox<?> comboBox1, JComboBox<?> comboBox2) {
		this.entrada1TextField = entrada1;
		this.entrada2TextField = entrada2;
		this.player1Selecao = comboBox1;
		this.player2Selecao = comboBox2;
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		Integer entradaP1 = Integer.parseInt(entrada1TextField.getText());
		Integer entradaP2 = Integer.parseInt(entrada2TextField.getText());
		
		String comboBoxP1 = String.valueOf(player1Selecao.getSelectedItem());
		String comboBoxP2 = String.valueOf(player2Selecao.getSelectedItem());
		
		jogo.updateApostas(comboBoxP1, comboBoxP2);
		jogo.updateAtributes(entradaP1, entradaP2);
		
		JOptionPane.showMessageDialog(null, String.format(
				  "Jogador 1 jogou " + comboBoxP1
				+ "\nJogador 2 jogou " + comboBoxP2 
				+ "\n\nO resultado é: " + jogo.parOuImpar() ));
	}
	
}
