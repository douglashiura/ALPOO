package alpoo;


import java.awt.Component;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class MinhaPrimeiraJanela {

	public static void main(String[] args) {
		JFrame tela = new JFrame();
		tela.setSize(300, 250);
		tela.setLayout(null);
		tela.setTitle("Tela do jogo de Par e Impar - 100% IES");
		JLabel campoDoPrimeiroJogado = new JLabel("Jogada do primeiro jogador");
		campoDoPrimeiroJogado.setLocation(3, 3);
		campoDoPrimeiroJogado.setSize(200, 20);
		JTextField entradaDoPrimeiroJogador = new JTextField(4);
		entradaDoPrimeiroJogador.setSize(200, 20);
		entradaDoPrimeiroJogador.setLocation(210,3);
		tela.add(campoDoPrimeiroJogado);
		tela.add(entradaDoPrimeiroJogador);
		JLabel campoDoPrimeiroJogado2 = new JLabel("Jogada do segundo jogador");
		campoDoPrimeiroJogado2.setLocation(3, 30);
		campoDoPrimeiroJogado2.setSize(200, 20);
		JTextField entradaDoPrimeiroJogador2 = new JTextField(4);
		entradaDoPrimeiroJogador2.setSize(200, 20);
		entradaDoPrimeiroJogador2.setLocation(210,30);
		tela.add(campoDoPrimeiroJogado2);
		tela.add(entradaDoPrimeiroJogador2);
		Component botaoJogar= new JButton("Jogar");
		botaoJogar.setLocation(100, 100);
		botaoJogar.setSize(80, 25);
		tela.add(botaoJogar);
		tela.setVisible(true);
		tela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

}
