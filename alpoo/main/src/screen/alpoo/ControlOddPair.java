package alpoo;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

import jogoParImpar.ResultParImpar;
import jogoParImpar.Verifica;

public class ControlOddPair  implements ActionListener{
	protected JTextField firstPlayerEntry;
	protected JComboBox<ResultParImpar> firstBetPlayer;

	public ControlOddPair(JTextField firstPlayerEntry, JComboBox<ResultParImpar> firstBetPlayer) {
		this.firstPlayerEntry = firstPlayerEntry;
		this.firstBetPlayer = firstBetPlayer;
	}

	@Override
	public void actionPerformed(ActionEvent arg0) {
		Integer primary;
		String result;

		primary = Integer.valueOf(firstPlayerEntry.getText());
		System.out.println(primary);
		ResultParImpar bet = (ResultParImpar) firstBetPlayer.getSelectedItem();
		Verifica.obterInstancia().setPlays(bet, primary);

		/*while(true) {
			result = Verifica.obterInstancia().parOuImpar().toString();

			if(result.equalsIgnoreCase(bet.toString())) {
				JOptionPane.showMessageDialog(null, String.format("Player one winner = %s %s", result, bet.toString()));
				break;
			}
			else if(result.equalsIgnoreCase(bet.toString())) {
				JOptionPane.showMessageDialog(null, String.format("Player two winner %s %s", result, bet.toString()));
				break;
			}
			else {
				JOptionPane.showMessageDialog(null, String.format("A tie %s %s", result, bet.toString()));
				break;
			}
		}*/
	}
}
