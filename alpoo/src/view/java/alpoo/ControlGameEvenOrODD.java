package alpoo;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JOptionPane;
import javax.swing.JTextField;

import br.ies.aula.alpoo.EvenOrODD.EvenOrODD;
import br.ies.aula.alpoo.EvenOrODD.GameResults;

public class ControlGameEvenOrODD implements ActionListener {
	private JTextField firstInput;
	private JTextField secondInput;
	private int instances;
	private EvenOrODD game;

	public ControlGameEvenOrODD(JTextField input) {
		this.instances =+ 1;
		
		if(this.instances == 1) {
			this.firstInput = input;
		} else if(this.instances == 2) {
			this.secondInput = input;
		}
		
		game = new EvenOrODD();
	}
	
	private boolean betsIsValid() {
		System.out.println("Primeiro: "+ firstInput.getText() +" Segundo: "+ secondInput.getText());
		return this.instances == 2? true: false;
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		if(betsIsValid()) {
			GameResults result = game.playGame(
					Integer.parseInt(firstInput.getText()), 
					Integer.parseInt(secondInput.getText()));
			
			JOptionPane.showMessageDialog(null, "O resultado é: "+ result);
		} else {
			JOptionPane.showMessageDialog(null, "Por favor, aguarde a aposta do outro jogador!");
		}
	}
}
