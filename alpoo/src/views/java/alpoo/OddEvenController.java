package alpoo;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JOptionPane;
import javax.swing.JTextField;

import br.ies.aula.alpoo.oddEven.OddEven;

public class OddEvenController implements ActionListener{
	private JTextField firstPlayer;
	private JTextField secondPlayer;
	private String firstPlayerSelected;
	private OddEven game;
	
	public OddEvenController(JTextField firstPlayer, JTextField secondPlayer, String firstPlayerSelected) {
		this.firstPlayer = firstPlayer;
		this.secondPlayer = secondPlayer;
		this.firstPlayerSelected = firstPlayerSelected;
		game = new OddEven();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		try {
			game.setFirstNum(Integer.parseInt(firstPlayer.getText()));
			game.setSecondNum(Integer.parseInt(secondPlayer.getText()));
			JOptionPane.showMessageDialog(null, game.evaluate() == firstPlayerSelected ? "First player wins!" : "Second player wins!");					
		} catch (NumberFormatException err) {
			JOptionPane.showMessageDialog(null, "Error! Invalid Number!");
		}
		
	}

	
}
