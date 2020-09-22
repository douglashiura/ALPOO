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
		frame.setLocation(400, 200);
		frame.setSize(400,250);
		frame.getContentPane().setLayout(null);
		frame.setTitle("Tela do Jogo ParImpar");
		JLabel campoDoPrimeiroJogador = new JLabel("Jogada do Primeiro Jogador");
		campoDoPrimeiroJogador.setLocation(3, 30);
		campoDoPrimeiroJogador.setSize(200, 20);
		JTextField entradaPrimeiroJogador = new JTextField(4);
		entradaPrimeiroJogador.setSize(100,20);
		entradaPrimeiroJogador.setLocation(180,30);
		frame.getContentPane().add(campoDoPrimeiroJogador);
		frame.getContentPane().add(entradaPrimeiroJogador);
		JTextField entradaNomePrimeiroJogador = new JTextField(20);
		entradaNomePrimeiroJogador.setSize(100, 20);
		entradaNomePrimeiroJogador.setLocation(180, 3);
		JLabel nomePrimeiroJogador = new JLabel("Digite seu nome: ");
		nomePrimeiroJogador.setSize(200, 20);
		nomePrimeiroJogador.setLocation(3, 3);
		frame.getContentPane().add(entradaNomePrimeiroJogador);
		frame.getContentPane().add(nomePrimeiroJogador);
		
		JCheckBox parBox1 = new JCheckBox("Par");
		parBox1.setSize(50,20);
		parBox1.setLocation(300,30);
		frame.getContentPane().add(parBox1);
		
		entradaPrimeiroJogador.setText("0");
		
		JCheckBox jogou1 = new JCheckBox("Pronto");
		jogou1.setSize(70,20);
		jogou1.setLocation(300, 3);
		frame.getContentPane().add(jogou1);

		//Segunda Tela
		
		JFrame frame2 = new JFrame();
		frame2.setLocation(1000, 200);
		frame2.setSize(400,250);
		frame2.getContentPane().setLayout(null);
		frame2.setTitle("Tela do Jogo ParImpar");
		
		JLabel campoDoSegundoJogador = new JLabel("Jogada do Segundo Jogador");
		campoDoSegundoJogador.setLocation(3, 30);
		campoDoSegundoJogador.setSize(200, 20);
		JTextField entradaSegundoJogador = new JTextField(4);
		entradaSegundoJogador.setSize(100,20);
		entradaSegundoJogador.setLocation(180,30);
		frame2.getContentPane().add(campoDoSegundoJogador);
		frame2.getContentPane().add(entradaSegundoJogador);
		JTextField entradaNomeSegundoJogador = new JTextField(20);
		entradaNomeSegundoJogador.setSize(100, 20);
		entradaNomeSegundoJogador.setLocation(180, 3);
		JLabel nomeSegundoJogador = new JLabel("Digite seu nome: ");
		nomeSegundoJogador.setSize(200, 20);
		nomeSegundoJogador.setLocation(3, 3);
		frame2.getContentPane().add(entradaNomeSegundoJogador);
		frame2.getContentPane().add(nomeSegundoJogador);
		
		JCheckBox parBox2 = new JCheckBox("Par");
		parBox2.setSize(50,20);
		parBox2.setLocation(300, 30);
		frame2.getContentPane().add(parBox2);
		
		entradaSegundoJogador.setText("0");
		
		JCheckBox jogou2 = new JCheckBox("Pronto");
		jogou2.setSize(70,20);
		jogou2.setLocation(300, 3);
		frame2.getContentPane().add(jogou2);
		
		parBox2.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				if(parBox1.isSelected()) {
					parBox1.setSelected(false);
				}
				parImpar.SetParDois();
			}
		});
		
		parBox1.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				if(parBox2.isSelected()) {
					parBox2.setSelected(false);
				}
				parImpar.SetParUm();
			}
		});
		
		//Fim Segunda Tela
		
		//Primeiro Botão
		
		JButton btJogar = new JButton("Salvar e Jogar");
		
		btJogar.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				if(parBox1.isSelected() || parBox2.isSelected()) {
					String jogador1 = entradaPrimeiroJogador.getText();
					String nomePrimeiro = entradaNomePrimeiroJogador.getText();
					
					parImpar.SalvarUm(jogador1, nomePrimeiro);
					
					jogou1.setSelected(true);
					if(jogou1.isSelected() == true && jogou2.isSelected() == true) {
						parImpar.ParOuImparPronto();
						String resultado = parImpar.getResult();
						String vencedor;
						int quemEPar = parImpar.CheckPar();
						String nome1 = parImpar.ReturnNomeUm();
						String nome2 = parImpar.ReturnNomeDois();
						
						switch(quemEPar) {
						case 1:
							if(resultado == "Par") {
								vencedor = nome1;
							}
							else {
								vencedor = nome2;
							}
							break;
						case 2:
							if(resultado == "Par") {
								vencedor = nome2;
							}
							else {
								vencedor = nome1;
							}
							break;
						default:
							vencedor = "Ninguém";
							break;
						}
						JOptionPane.showMessageDialog(null, "O vencedor foi " + vencedor + " Já que o resultado foi " + resultado);
					}
				}
				else {
					JOptionPane.showMessageDialog(null, "Selecione quem é o par!");
				}
			}
		});
		btJogar.setLocation(170, 90);
		btJogar.setSize(120, 25);
		frame.getContentPane().add(btJogar);
		
		//Fim Primeiro Botão

		//Começo Segundo Botão
		
		JButton btJogar2 = new JButton("Salvar e Jogar");
		
		btJogar2.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				if(parBox1.isSelected() || parBox2.isSelected()) {
					String jogador2 = entradaSegundoJogador.getText();
					String nomeSegundo = entradaNomeSegundoJogador.getText();
					
					parImpar.SalvarDois(jogador2, nomeSegundo);
					
					jogou2.setSelected(true);
					if(jogou1.isSelected() == true && jogou2.isSelected() == true) {
						parImpar.ParOuImparPronto();
						String resultado = parImpar.getResult();
						String vencedor;
						int quemEPar = parImpar.CheckPar();
						String nome1 = parImpar.ReturnNomeUm();
						String nome2 = parImpar.ReturnNomeDois();
						
						switch(quemEPar) {
						case 1:
							if(resultado == "Par") {
								vencedor = nome1;
							}
							else {
								vencedor = nome2;
							}
							break;
						case 2:
							if(resultado == "Par") {
								vencedor = nome2;
							}
							else {
								vencedor = nome1;
							}
							break;
						default:
							vencedor = "Ninguém";
							break;
						}
						JOptionPane.showMessageDialog(null, "O vencedor foi " + vencedor + " Já que o resultado foi " + resultado);
					}
				}
				else {
					JOptionPane.showMessageDialog(null, "Selecione quem é o par!");
				}
			}
		});
		
		btJogar2.setLocation(170, 102);
		btJogar2.setSize(120, 25);
		frame2.getContentPane().add(btJogar2);
		
		//Fim Segundo Botão
		
		frame2.setVisible(true);
		frame2.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
}
