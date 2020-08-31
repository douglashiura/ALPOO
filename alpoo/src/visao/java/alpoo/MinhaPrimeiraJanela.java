package alpoo;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class MinhaPrimeiraJanela {

	public static void main(String[] args) {
		JFrame tela = new JFrame();
		tela.setSize(300, 250);
		tela.setLayout(null);
		tela.setTitle("Tela do jogo de Par e Impar - 100% IES");
		JLabel campoDoPrimeiroJogador = new JLabel("Jogada do primeiro jogador");
		campoDoPrimeiroJogador.setLocation(3, 3);
		campoDoPrimeiroJogador.setSize(200, 20);
		JTextField entradaDoPrimeiroJogador = new JTextField(4);
		entradaDoPrimeiroJogador.setSize(200, 20);
		entradaDoPrimeiroJogador.setLocation(210, 3);
		tela.add(campoDoPrimeiroJogador);
		tela.add(entradaDoPrimeiroJogador);
		JLabel campoDoSegundoJogador = new JLabel("Jogada do segundo jogador");
		campoDoSegundoJogador.setLocation(3, 30);
		campoDoSegundoJogador.setSize(200, 20);
		JTextField entradaDoSegundoJogador = new JTextField(4);
		entradaDoSegundoJogador.setSize(200, 20);
		entradaDoSegundoJogador.setLocation(210, 30);
		tela.add(campoDoSegundoJogador);
		tela.add(entradaDoSegundoJogador);
		JButton botaoJogar = new JButton("Jogar");
		botaoJogar.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				
				JOptionPane.showMessageDialog(null, "O botão foi clicado!");
			}
		});
		botaoJogar.setLocation(100, 100);
		botaoJogar.setSize(80, 25);
		tela.add(botaoJogar);
		tela.setVisible(true);
		tela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

}
