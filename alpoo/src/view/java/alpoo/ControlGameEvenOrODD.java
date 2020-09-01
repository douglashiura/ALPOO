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
	private EvenOrODD game;

	public ControlGameEvenOrODD(JTextField firstInput, JTextField secondInput) {
		this.firstInput = firstInput;
		this.secondInput = secondInput;
		game = new EvenOrODD();
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		GameResults result = game.playGame(
				Integer.parseInt(firstInput.getText()), 
				Integer.parseInt(secondInput.getText()));
		
		JOptionPane.showMessageDialog(null, "O resultado é: "+ result);
	}

}
