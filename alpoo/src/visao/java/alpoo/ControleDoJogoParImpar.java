package alpoo;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JOptionPane;
import javax.swing.JTextField;

import par.impar.JogoParImpar;

public class ControleDoJogoParImpar implements ActionListener {

	JogoParImpar jogo = new JogoParImpar();
	
	JTextField entradaTextField1;
	JTextField entradaTextField2;
	
	ControleDoJogoParImpar(JTextField entrada1, JTextField entrada2){
		this.entradaTextField1 = entrada1;
		this.entradaTextField2 = entrada2;
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		Integer entradaP1 = Integer.parseInt(entradaTextField1.getText());
		Integer entradaP2 = Integer.parseInt(entradaTextField2.getText());
		
		jogo.updateAtributes(entradaP1, entradaP2);
		
		JOptionPane.showMessageDialog(null, String.format("%s ganhou!", jogo.parOuImpar()));
	}
			
			
}
