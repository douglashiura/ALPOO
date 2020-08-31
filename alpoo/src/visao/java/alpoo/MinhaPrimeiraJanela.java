package alpoo;

import java.awt.Component;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

import br.ies.aula.alpoo.jogo.JogoParImpar;

public class MinhaPrimeiraJanela {
	public static void main(String[] args) {
		JogoParImpar parImpar = new JogoParImpar();
		JFrame tela = new JFrame();
		tela.setSize(300, 250);
		tela.setLayout(null);
		tela.setTitle("Tela do jogo de Par e Impar - 100% IES");
		JLabel campoPrimeiroJogador = new JLabel("Jogada do primeiro jogador");
		campoPrimeiroJogador.setLocation(3, 3);
		campoPrimeiroJogador.setSize(200, 20);
		JTextField entradaDoPrimeiroJogador = new JTextField(4);
		entradaDoPrimeiroJogador.setSize(200, 20);
		entradaDoPrimeiroJogador.setLocation(210, 3);
		tela.add(campoPrimeiroJogador);
		tela.add(entradaDoPrimeiroJogador);
		JLabel campoSegundoJogador = new JLabel("Jogada do segundo jogador");
		campoSegundoJogador.setLocation(3, 30);
		campoSegundoJogador.setSize(200, 20);
		JTextField entradaDoSegundoJogador = new JTextField(4);
		entradaDoSegundoJogador.setSize(200, 20);
		entradaDoSegundoJogador.setLocation(210, 30);
		tela.add(campoSegundoJogador);
		tela.add(entradaDoSegundoJogador);
		JButton botaoJogar = new JButton("Jogar");
		botaoJogar.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				try {
					int primeiroNumero = Integer.parseInt(entradaDoPrimeiroJogador.getText());
					int segundoNumero = Integer.parseInt(entradaDoSegundoJogador.getText());
					parImpar.fixaJogadas(primeiroNumero, segundoNumero);
					JOptionPane.showMessageDialog(null, parImpar.parOuImpar());
					entradaDoPrimeiroJogador.setText(null);
					entradaDoSegundoJogador.setText(null);
				}catch (NumberFormatException ex) {
					JOptionPane.showMessageDialog(null, "Insira valores validos");
				}
				
				
			}
		});
		botaoJogar.setLocation(100, 60);
		botaoJogar.setSize(80, 25);
		tela.add(botaoJogar);
		tela.setVisible(true);
		tela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}
}
