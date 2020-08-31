package alpoo;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

import java.awt.Component;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import br.ies.aula.alpoo.calculadora.JogoImparPar;

public class MinhaPrimeiraJanela {
	public static void main(String[] args) {
		
		JogoImparPar jogo = new JogoImparPar();
		
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
		JButton jogarBotao = new JButton("Jogar");
		
		
		
		jogarBotao.setSize(80, 40);
		jogarBotao.setLocation(150, 83);
		JTextField entradaPrimeiro = new JTextField("1");
		entradaPrimeiro.setSize(200, 20);
		entradaPrimeiro.setLocation(210, 3);
		JTextField entradaSegundo = new JTextField("2");
		entradaSegundo.setSize(200, 20);
		entradaSegundo.setLocation(210, 43);
		Float jogadorUm = Float.parseFloat(entradaPrimeiro.getText());
		Float jogadorDois = Float.parseFloat(entradaSegundo.getText());
		
		JLabel resultado = new JLabel(jogo.calculo(jogadorUm, jogadorDois).toString());
		resultado.setSize(200, 20);
		resultado.setLocation(200, 300);

		jogarBotao.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null, "O botão foi clicado");
			}
		});
		tela.add(resultado);
		tela.add(primeiroCampo);
		tela.add(entradaPrimeiro);
		tela.add(segundoCampo);
		tela.add(entradaSegundo);
		tela.add(jogarBotao);
		tela.setVisible(true);
		tela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}
