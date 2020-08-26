package alpoo;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

import br.edu.ies.alpoo.JogoParImpar;

public class MinhaPrimeiraJanela {

	public static void main(String[] args) {
		JogoParImpar jogo = new JogoParImpar();
		JFrame tela = new JFrame();
		
		tela.setSize(300,300);
		tela.setLayout(null);
		tela.setTitle("Jogo Par e Impar");
		JLabel tituloInput1 = new JLabel("Digite a primeira Jogada");
		tituloInput1.setSize(200,15);
		tituloInput1.setLocation(0, 20);
		JTextField input1 = new JTextField();
		input1.setSize(100,20);
		input1.setLocation(200, 15);
		tela.add(tituloInput1);
		tela.add(input1);
		JLabel tituloInput2 = new JLabel("Digite a segunda Jogada");
		tituloInput2.setSize(200,15);
		tituloInput2.setLocation(0, 50);
		JTextField input2 = new JTextField();
		input2.setSize(100,20);
		input2.setLocation(200, 45);
		JButton botao = new JButton("Jogar");
		botao.setLocation(50, 80);
		botao.setSize(80,25);
		tela.add(botao);
		tela.add(tituloInput2);
		tela.add(input2);
		tela.setVisible(true);
		tela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}
