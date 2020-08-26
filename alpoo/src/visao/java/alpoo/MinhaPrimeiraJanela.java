package alpoo;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

import java.awt.Component;

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
		
		Component botaoJogar = new JButton("<<<Jogar>>>");
		botaoJogar.setSize(150, 75);
		botaoJogar.setLocation(100, 100);
		
		
		
		tela.add(entradaDoPrimeiroJogador);
		tela.add(campoDoPrimeiroJogador);
		tela.add(entradaDoSegundoJogador);
		tela.add(campoDoSegundoJogador);
		tela.add(botaoJogar);
	}
}
