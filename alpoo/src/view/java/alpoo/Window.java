package alpoo;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class Window {

	public static void main(String[] args) {
		JFrame frame = new JFrame();
		frame.setSize(500, 250);
		frame.setLayout(null);
		frame.setTitle("Jogo Par Impar");

		JLabel player1Label = new JLabel("Jogada do primeiro jogador");
		player1Label.setSize(200,20);
		player1Label.setLocation(3, 3);
		
		JTextField imputPlayer1 = new JTextField(4);		
		imputPlayer1.setSize(200, 20);
		imputPlayer1.setLocation(213, 3);
		
		JLabel player2Label = new JLabel("Jogada do segundo jogador");
		player2Label.setSize(200,20);
		player2Label.setLocation(3, 33);
		
		JTextField imputPlayer2 = new JTextField(4);		
		imputPlayer2.setSize(200, 20);
		imputPlayer2.setLocation(213, 33);
		
		JButton button = new JButton("Jogar");
		button.setLocation(100, 100);
		button.setSize(80, 25);
		
		frame.add(player1Label);
		frame.add(player2Label);
		frame.add(imputPlayer1);
		frame.add(imputPlayer2);
		frame.add(button);
		
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

}
