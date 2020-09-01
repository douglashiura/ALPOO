package alpoo;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JOptionPane;
import javax.swing.JTextField;

import br.ies.aula.alpoo.parouimpar.JogoParImpar;

public class ControlParImpar implements ActionListener {
	private JTextField imputPlayer1;
	private JTextField imputPlayer2;
	private String apostaPlayer1;
	private String apostaPlayer2;
	private JogoParImpar jogo;

	public ControlParImpar(JTextField imputPlayer1, JTextField imputPlayer2, String apostaPlayer1, String apostaPlayer2) {
		this.imputPlayer1 = imputPlayer1;
		this.imputPlayer2 = imputPlayer2;
		this.apostaPlayer1 = apostaPlayer1;
		this.apostaPlayer2 = apostaPlayer2;
		this.jogo = new JogoParImpar();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		JogoParImpar jogo = new JogoParImpar();
		
		try {			
			Integer num1 = Integer.valueOf(imputPlayer1.getText());
			Integer num2 = Integer.valueOf(imputPlayer2.getText());
			
			jogo.fixaApostas(apostaPlayer1, apostaPlayer2);
			jogo.fixaJogadas(num1, num2);	
			String resultado = jogo.parOuImpar().toString();
			JOptionPane.showMessageDialog(null, resultado);
			
		} catch(NumberFormatException ex) {
			JOptionPane.showMessageDialog(null, "Campo vazio! adiciona um valor");
		}
		
				
		
	}

}
