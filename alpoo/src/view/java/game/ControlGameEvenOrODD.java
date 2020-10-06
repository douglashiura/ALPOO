package game;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JComboBox;
import javax.swing.JTextField;

import br.ies.aula.alpoo.EvenOrODD.GameStateControl;

public class ControlGameEvenOrODD implements ActionListener {
	private JTextField firstInput;
	private JTextField secondInput;
	private JComboBox choose;
	private int instances;
	private GameStateControl gameState;

	public ControlGameEvenOrODD(JTextField input) {
		this.instances =+ 1;
		
		if(this.instances == 1) {
			this.firstInput = input;
		} else if(this.instances == 2) {
			this.secondInput = input;
		}
		
		this.gameState = new GameStateControl();
	}
	
	private boolean betsIsValid() {
		System.out.println("Primeiro: "+ firstInput.getText() +" Segundo: "+ secondInput.getText());
		return this.instances == 2? true: false;
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		int value = Integer.parseInt(firstInput.getText());
	}
	
	public void setGameState(GameStateControl gameState) {
		this.gameState = gameState;
	}
}
