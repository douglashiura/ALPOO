package br.ies.aula.alpoo.parimpar;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

import br.ies.aula.alpoo.parimpar.JogoParImpar;
import br.ies.aula.alpoo.parimpar.Results;

public class ControlParImpar implements ActionListener {
	private JTextField imputPlayer;
	private JComboBox<Results> apostaPlayer;
	private JTextField imputPlayerName;

	public ControlParImpar(JTextField imputPlayer, JComboBox<Results> apostaPlayer, JTextField imputPlayerName) {
		this.imputPlayer = imputPlayer;
		this.apostaPlayer = apostaPlayer;
		this.imputPlayerName = imputPlayerName;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		try {			
			Integer valor = Integer.valueOf(imputPlayer.getText());
			Results aposta = (Results) apostaPlayer.getSelectedItem();	
			String nome = imputPlayerName.getText();
			JogoParImpar.obterInstancia().fixaJogada(nome, aposta, valor);
			
		} catch(NumberFormatException ex) {
			JOptionPane.showMessageDialog(null, "Campo vazio! adiciona um valor");
		}		
	}

}
