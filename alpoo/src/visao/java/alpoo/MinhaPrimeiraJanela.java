package alpoo;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

import br.ies.aula.alpoo.jogo.JogoParImpar;

import java.awt.Component;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MinhaPrimeiraJanela {

	public static void main (String[] args) {
		JFrame tela = new JFrame();
		tela.setSize(200, 300);
		tela.setVisible(true);
		tela.setLayout(null);
		tela.setTitle("Tela do jogo de Par e Impar 100% ies");
		
		JLabel campoDoPrimeiroJogador = new JLabel("Jogada do primeiro Jogador");
		campoDoPrimeiroJogador.setSize(200,20);
		campoDoPrimeiroJogador.setLocation(3,0);
		JTextField entradaDoPrimeiroJogador = new JTextField(4);
		entradaDoPrimeiroJogador.setSize(200, 20);
		entradaDoPrimeiroJogador.setLocation(210, 3);
		
		
		JLabel campoDoSegundoJogador = new JLabel("Jogada do segundo Jogador");
		campoDoSegundoJogador.setSize(200, 20);
		campoDoSegundoJogador.setLocation(3, 30);
		JTextField entradaDoSegundoJogador = new JTextField(4);
		entradaDoSegundoJogador.setSize(200, 20);
		entradaDoSegundoJogador.setLocation(210, 30);
		
		
		JButton botaoJogar = new JButton("<<<Jogar>>>");
		botaoJogar.setSize(150, 75);
		botaoJogar.setLocation(100, 100);
		botaoJogar.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
				JogoParImpar parImpar = new JogoParImpar();
				Integer primeiroJogadorValor = Integer.valueOf(entradaDoPrimeiroJogador.getText());
				Integer segundoJogadorValor = Integer.valueOf(entradaDoSegundoJogador.getText());
				parImpar.fixaJogadas(primeiroJogadorValor, segundoJogadorValor);
				JOptionPane.showMessageDialog(null, "O resultado é: " + parImpar.parOuImpar());	
			}
		});
				
		
		tela.add(entradaDoPrimeiroJogador);
		tela.add(campoDoPrimeiroJogador);
		tela.add(entradaDoSegundoJogador);
		tela.add(campoDoSegundoJogador);
		tela.add(botaoJogar);
	}
}
