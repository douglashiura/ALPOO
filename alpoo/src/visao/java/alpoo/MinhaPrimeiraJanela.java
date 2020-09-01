package alpoo;

import javax.swing.JButton;
import javax.swing.JComboBox;
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
		
		String[] imparPar = {"Impar", "Par"};
		
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
		
		JTextField entradaPrimeiro = new JTextField(null);
		entradaPrimeiro.setSize(30, 20);
		entradaPrimeiro.setLocation(190, 3);
		entradaPrimeiro.setHorizontalAlignment(JTextField.CENTER);
		
		JComboBox<Object> primeiraCaixa = new JComboBox<Object>(imparPar);
		primeiraCaixa.setSize(200, 20);
		primeiraCaixa.setLocation(250, 3);
		
		JTextField entradaSegundo = new JTextField(null);
		entradaSegundo.setSize(30, 20);
		entradaSegundo.setLocation(190, 43);
		entradaSegundo.setHorizontalAlignment(JTextField.CENTER);
		
		JComboBox<Object> segundaCaixa = new JComboBox<Object>(imparPar);
		segundaCaixa.setSize(200, 20);
		segundaCaixa.setLocation(250, 43);
		
		JLabel resultado = new JLabel();
		resultado.setSize(200, 20);
		resultado.setLocation(150, 200);

		jogarBotao.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				if(primeiraCaixa.getSelectedItem() == segundaCaixa.getSelectedItem()) {
					JOptionPane.showMessageDialog(null, "As apostas precisam ser diferente!");
				}else {
					Float jogadorUm = Float.parseFloat(entradaPrimeiro.getText());
					Float jogadorDois = Float.parseFloat(entradaSegundo.getText());
					
					if(primeiraCaixa.getSelectedItem().toString().toUpperCase().equals(
							jogo.calculo(jogadorUm, jogadorDois).toString()) ) {
						resultado.setText("Primeiro jogador ganhou!");
					}else {
						resultado.setText("Segundo jogador ganhou!");						
					}
				}
			}
		});
		
		tela.add(segundaCaixa);
		tela.add(primeiraCaixa);
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
