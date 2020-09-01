package alpoo;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;


public class minhaPrimeiraJanela {
	
	public static void main(String[] args) {
		JFrame tela = new JFrame();
		tela.setSize(450, 250);
		tela.setLayout(null);
		tela.setTitle("Tela jogo Par e Impar");
		JLabel campoDoJogadorUm = new JLabel("Jogada do Jogador um");
		campoDoJogadorUm.setLocation(3, 3);
		campoDoJogadorUm.setSize(200, 20);
		JTextField entradaDoJogadorUm = new JTextField(4);
		entradaDoJogadorUm.setLocation(210, 3);
		entradaDoJogadorUm.setSize(200,20);
		tela.add(campoDoJogadorUm);
		tela.add(entradaDoJogadorUm);
		JLabel campoDoJogadorDois = new JLabel("Jogada do Jogador dois");
		campoDoJogadorDois.setLocation(3,30);
		campoDoJogadorDois.setSize(200,20);
		JTextField entradaDoJogadorDois = new JTextField(4);
		entradaDoJogadorDois.setSize(200,20);
		entradaDoJogadorDois.setLocation(210,30);
		tela.add(campoDoJogadorDois);
		tela.add(entradaDoJogadorDois);
		tela.setVisible(true);
		JButton botaoJogar= new JButton("Jogar");
		botaoJogar.setLocation(175, 100);
		botaoJogar.setSize(80, 25);
		botaoJogar.addActionListener(new ControleJogoParImpar(entradaDoJogadorUm, entradaDoJogadorDois));
		tela.add(botaoJogar);
		tela.setVisible(true);
		tela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}



}
