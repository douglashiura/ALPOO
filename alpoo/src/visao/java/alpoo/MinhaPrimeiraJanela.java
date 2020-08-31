package alpoo;

import java.awt.Component;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

import parOuImpar.JogoParOuImpar;

@SuppressWarnings("unused")
public class MinhaPrimeiraJanela {

	public static void main(String[] args) {
		
		JogoParOuImpar jogo = new JogoParOuImpar();
		
		/*Bloco de setup da Tela*/
		
		JFrame tela = new JFrame();
		tela.setSize(300, 245);
		tela.setLayout(null);
		tela.setTitle("Jogo Par Ou Ímpar");
		
		JLabel campo1 = new JLabel("Jogada do Primeiro Jogador:");
		campo1.setSize(200,20);
		campo1.setLocation(45,10);
		
		JTextField entrada1 = new JTextField(4);
		entrada1.setSize(200,20);
		entrada1.setLocation(45,40);
		
		JLabel campo2 = new JLabel("Jogada do Segundo Jogador:");
		campo2.setSize(200,20);
		campo2.setLocation(45,70);
		
		JTextField entrada2 = new JTextField(4);
		entrada2.setSize(200,20);
		entrada2.setLocation(45,100);
		
		JButton botao = new JButton("Enviar Resposta");
		botao.setSize(200,40);
		botao.setLocation(45,140);
		
		/* -END- Bloco de setup da Tela*/
		
		tela.add(campo1);
		tela.add(entrada1);
		tela.add(campo2);
		tela.add(entrada2);
		tela.add(botao);
		
		tela.setVisible(true);
		
		//Pop up do botão de envio
				botao.addActionListener(new ActionListener() {
					@Override
					public void actionPerformed(ActionEvent e) {
						Boolean resultado = jogo.resultado(Integer.parseInt(entrada1.getText()), Integer.parseInt(entrada2.getText()));
						if(resultado) {
							JOptionPane.showMessageDialog(null, "Par Ganhou!");
						}else {
							JOptionPane.showMessageDialog(null, "Ímpar Ganhou!");
						}
					}
							
				});
		
	}
	
}