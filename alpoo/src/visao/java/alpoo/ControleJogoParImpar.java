package alpoo;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JOptionPane;
import javax.swing.JTextField;


public class ControleJogoParImpar implements ActionListener {
	private JTextField entradaDoJogadorUm;
	private JTextField entradaDoJogadorDois;
	private Jogo jogo;
	
	public ControleJogoParImpar(JTextField entradaDoJogadorUm, JTextField entradaDoJogadorDois) {
		this.entradaDoJogadorUm = entradaDoJogadorUm;
		this.entradaDoJogadorDois = entradaDoJogadorDois;
		this.jogo = new Jogo();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		Integer primeiro = Integer.valueOf(entradaDoJogadorUm.getText());
		Integer segundo = Integer.valueOf(entradaDoJogadorDois.getText());
		jogo.fixaJogadas(primeiro,segundo);
		JOptionPane.showMessageDialog(null, String.format("O resultado foi %s", jogo.parOuImpar()));
		
	}

	
	

}
