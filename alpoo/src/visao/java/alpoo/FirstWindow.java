package alpoo;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import br.ies.aula.alpoo.jogo.JogoParImpar;

public class FirstWindow {
	
	public static void main(String[] args) {
		
		JogoParImpar parImpar = new JogoParImpar();
		
		JFrame frame = new JFrame();
		frame.setSize(400,250);
		frame.setLayout(null);
		frame.setTitle("Tela do Jogo ParImpar");
		JLabel campoDoPrimeiroJogador = new JLabel("Jogada do Primeiro Jogador");
		campoDoPrimeiroJogador.setLocation(3, 3);
		campoDoPrimeiroJogador.setSize(200, 20);
		JTextField entradaPrimeiroJogador = new JTextField(4);
		entradaPrimeiroJogador.setSize(100,20);
		entradaPrimeiroJogador.setLocation(180,3);
		frame.add(campoDoPrimeiroJogador);
		frame.add(entradaPrimeiroJogador);
		
		JLabel campoDoSegundoJogador = new JLabel("Jogada do Segundo Jogador");
		campoDoSegundoJogador.setLocation(3, 30);
		campoDoSegundoJogador.setSize(200, 20);
		JTextField entradaSegundoJogador = new JTextField(4);
		entradaSegundoJogador.setSize(100,20);
		entradaSegundoJogador.setLocation(180,30);
		frame.add(campoDoSegundoJogador);
		frame.add(entradaSegundoJogador);
		
		JCheckBox parBox1 = new JCheckBox("Par");
		JCheckBox parBox2 = new JCheckBox("Par");
		parBox1.setSize(50,20);
		parBox1.setLocation(300,3);
		parBox2.setSize(50,20);
		parBox2.setLocation(300, 30);
		frame.add(parBox1);
		frame.add(parBox2);
		
		parBox1.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				if(parBox2.isSelected()) {
					parBox2.setSelected(false);
				}
				parImpar.SetParUm();
			}
		});
		
		parBox2.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				if(parBox1.isSelected()) {
					parBox1.setSelected(false);
				}
				parImpar.SetParDois();
			}
		});
		
		JButton btJogar = new JButton("Jogar");
		
		btJogar.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				if(parBox1.isSelected() || parBox2.isSelected()) {
					String jogador1 = entradaPrimeiroJogador.getText();
					String jogador2 = entradaSegundoJogador.getText();
					
					parImpar.ParOuImpar(Integer.parseInt(jogador1), Integer.parseInt(jogador2));
					String resultado = parImpar.getResult();
					
					String vencedor;
					int quemEPar = parImpar.CheckPar();
					switch(quemEPar) {
					case 1:
						if(resultado == "Par") {
							vencedor = "Jogador 1";
						}
						else {
							vencedor = "Jogador 2";
						}
						break;
					case 2:
						if(resultado == "Par") {
							vencedor = "Jogador 2";
						}
						else {
							vencedor = "Jogador 1";
						}
						break;
					default:
						vencedor = "Ninguém";
						break;
					}
					
					JOptionPane.showMessageDialog(null, "O vencedor foi " + vencedor + " Já que o resultado foi " + resultado);
				}
				else {
					JOptionPane.showMessageDialog(null, "Selecione que é o par!");
				}
			}
		});
		btJogar.setLocation(100, 100);
		btJogar.setSize(100, 25);
		frame.add(btJogar);
		
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
}
