package alpoo;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

import java.awt.Component;

import br.ies.aula.alpoo.calculadora.JogoImparPar;

public class MinhaPrimeiraJanela {
	public static void main(String[] args) {
		JFrame tela = new JFrame();
		tela.setSize(500, 500);
		tela.setLayout(null);
		tela.setTitle("Jogo do Par e Impar");
		JLabel primeiroCampo = new JLabel("Entrada do primeiro jogador: ");
		primeiroCampo.setSize(200, 20);
		primeiroCampo.setLocation(10, 3);
		JLabel segundoCampo = new JLabel("Entrada do segundo jogador: ");
		segundoCampo.setSize(200, 20);
		segundoCampo.setLocation(10, 43);
		Component jogarBotao = new JButton("Jogar");
		jogarBotao.setSize(80, 40);
		jogarBotao.setLocation(150, 83);
		JTextField entradaPrimeiro = new JTextField();
		entradaPrimeiro.setSize(200, 20);
		entradaPrimeiro.setLocation(210, 3);
		JTextField entradaSegundo = new JTextField();
		entradaSegundo.setSize(200, 20);
		entradaSegundo.setLocation(210, 43);
		tela.add(primeiroCampo);
		tela.add(entradaPrimeiro);
		tela.add(segundoCampo);
		tela.add(entradaSegundo);
		tela.add(jogarBotao);
		tela.setVisible(true);
		tela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}
