package alpoo;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class FirstWindow {
	
	public static void main(String[] args) {
		JFrame frame = new JFrame();
		frame.setSize(300,250);
		frame.setLayout(null);
		frame.setTitle("Tela do Jogo ParImpar");
		JLabel campoDoPrimeiroJogador = new JLabel("Jogada do Primeiro Jogador");
		campoDoPrimeiroJogador.setLocation(3, 3);
		campoDoPrimeiroJogador.setSize(200, 20);
		JTextField entradaPrimeiroJogador = new JTextField(4);
		entradaPrimeiroJogador.setSize(200,20);
		entradaPrimeiroJogador.setLocation(210,3);
		frame.add(campoDoPrimeiroJogador);
		frame.add(entradaPrimeiroJogador);
		
		JLabel campoDoSegundoJogador = new JLabel("Jogada do Segundo Jogador");
		campoDoSegundoJogador.setLocation(3, 30);
		campoDoSegundoJogador.setSize(200, 20);
		JTextField entradaSegundoJogador = new JTextField(4);
		entradaSegundoJogador.setSize(200,20);
		entradaSegundoJogador.setLocation(210,30);
		frame.add(campoDoSegundoJogador);
		frame.add(entradaSegundoJogador);
		
		JButton btJogar = new JButton("Jogar");
		btJogar.setLocation(100, 100);
		btJogar.setSize(100, 25);
		frame.add(btJogar);
		
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
}
