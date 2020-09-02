package test.br.ies.aula.alpoo;


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
public class Minhaprimeiratela {

	public static void main(String[] args) {

//		JOptionPane.showInputDialog("Minha Primeira Tela");
		JogoParOuImpar jogo = new JogoParOuImpar();

		/*Bloco de setup da Tela*/

		JFrame tela = new JFrame();
		tela.setSize(300, 245);
@@ -34,12 +40,14 @@ public static void main(String[] args) {

		JTextField entrada2 = new JTextField(4);
		entrada2.setSize(200,20);
		entrada2.setLocation(45,90);
		entrada2.setLocation(45,100);

		JButton botao = new JButton("Enviar Resposta");
		botao.setSize(200,40);
		botao.setLocation(45,140);

		/* -END- Bloco de setup da Tela*/

		tela.add(campo1);
		tela.add(entrada1);
		tela.add(campo2);
@@ -48,6 +56,20 @@ public static void main(String[] args) {

		tela.setVisible(true);

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


	
	
	


