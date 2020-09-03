package alpoo;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

import br.ies.aula.alpoo.parouimpar.JogoParImpar;
import br.ies.aula.alpoo.parouimpar.Results;

public class ControlParImpar implements ActionListener {
	private JTextField imputPlayer;

	public ControlParImpar(JTextField imputPlayer, JComboBox<Results> apostaPlayer) {
		this.imputPlayer = imputPlayer;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
//		JogoParImpar jogo = new JogoParImpar();		
		
		try {			
			Integer num1 = Integer.valueOf(imputPlayer.getText());
			System.out.println(num1);
//			jogo.fixaApostas(apostaPlayer1, apostaPlayer2);
//			jogo.fixaJogadas(num1, num2);	
//			String resultado = jogo.parOuImpar().toString();
//			JOptionPane.showMessageDialog(null, resultado);
			
		} catch(NumberFormatException ex) {
			JOptionPane.showMessageDialog(null, "Campo vazio! adiciona um valor");
		}		
	}

}
