package br.ies.aula.alpoo.jogo;


import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class FirstWindow {
	
	public static void main(String[] args) {
		
		JFrame tela = new JFrame();
		
		tela.setTitle("Jogo do Par ou Impar");		
		tela.setSize(400, 400);
		tela.setLayout(null);
		tela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		//Labels
		JLabel lbPrimeiroJogador = new JLabel("Jogada primeiro jogador: ");
		lbPrimeiroJogador.setSize(200, 20);
		lbPrimeiroJogador.setLocation(1, 10);
		
		JLabel lbSegundoJogador = new JLabel("Jogada segundo jogador: ");
		lbSegundoJogador.setSize(200, 20);
		lbSegundoJogador.setLocation(1, 60);
		
		
		//Text Fields
		JTextField txtPrimeiroJogador = new JTextField();
		txtPrimeiroJogador.setSize(100, 25);
		txtPrimeiroJogador.setLocation(150, 10);
		
		JTextField txtSegundoJogador = new JTextField();
		txtSegundoJogador.setSize(100, 25);
		txtSegundoJogador.setLocation(150, 60);
		
		
		//Button
		JButton btJogar = new JButton("Jogar");
		btJogar.setSize(80, 25);
		btJogar.setLocation(1, 100);
		
		
		tela.add(lbPrimeiroJogador);
		tela.add(lbSegundoJogador);
		tela.add(txtPrimeiroJogador);
		tela.add(txtSegundoJogador);
		tela.add(btJogar);
		
		tela.setVisible(true);
	}
	
}
