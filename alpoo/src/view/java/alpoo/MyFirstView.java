package alpoo;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

import br.ies.aula.alpoo.EightGame.*;

public class MyFirstView {

	public static void main(String[] args) {
		EightGame game = new EightGame();
		JFrame screen = new JFrame();
		
		screen.setSize(400, 300);
		screen.setLayout(null);
		screen.setTitle("Eight Game");
		JLabel labelInput1 = new JLabel("Digite a primeira Jogada");
		labelInput1.setSize(200, 15);
		labelInput1.setLocation(0, 20);
		JTextField input1 = new JTextField();
		input1.setSize(100,20);
		input1.setLocation(200, 15);
		screen.add(labelInput1);
		screen.add(input1);
		JLabel labelInput2 = new JLabel("Digite a segunda Jogada");
		labelInput2.setSize(200,15);
		labelInput2.setLocation(0, 50);
		JTextField input2 = new JTextField();
		input2.setSize(100,20);
		input2.setLocation(200, 45);
		JButton botao = new JButton("Jogar");
		botao.setLocation(50, 80);
		botao.setSize(80,25);
		screen.add(botao);
		screen.add(labelInput2);
		screen.add(input2);
		screen.setVisible(true);
		screen.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}