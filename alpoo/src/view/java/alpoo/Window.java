package alpoo;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class Window {

	public static void main(String[] args) {
		
		JFrame frame = new JFrame();
		frame.setSize(430, 200);
		frame.setLayout(null);
		frame.setTitle("Jogo Par Impar");

		JLabel player1Label = new JLabel("Jogada do primeiro jogador");
		player1Label.setSize(200,20);
		player1Label.setLocation(10, 10);
		
		JTextField imputPlayer1 = new JTextField(4);		
		imputPlayer1.setSize(200, 20);
		imputPlayer1.setLocation(10, 40);
		
		JLabel player1LabelAposta = new JLabel("Aposta do primeiro jogador");
		player1LabelAposta.setSize(200,20);
		player1LabelAposta.setLocation(10, 70);
		
		JLabel player2Label = new JLabel("Jogada do segundo jogador");
		player2Label.setSize(200,20);
		player2Label.setLocation(220, 10);
		
		JTextField imputPlayer2 = new JTextField(4);		
		imputPlayer2.setSize(200, 20);
		imputPlayer2.setLocation(220, 40);
		
		JLabel player2LabelAposta = new JLabel("Aposta do segundo jogador");
		player2LabelAposta.setSize(200,20);
		player2LabelAposta.setLocation(220, 70);
		
		String[] apostas = { "Par", "Impar" };		
		JComboBox<String> apostaPlayer1 = new JComboBox<String>(apostas);
		apostaPlayer1.setLocation(10, 100);
		apostaPlayer1.setSize(200, 20);
		apostaPlayer1.setSelectedIndex(0);
		
		JComboBox<String> apostaPlayer2 = new JComboBox<String>(apostas);
		apostaPlayer2.setLocation(220, 100);
		apostaPlayer2.setSize(200, 20);
		apostaPlayer2.setSelectedIndex(1);
		
		JButton button = new JButton("Jogar");
		button.setLocation(110, 140);
		button.setSize(200, 25);
		button.addActionListener(new ControlParImpar(imputPlayer1, imputPlayer2, apostaPlayer1.getSelectedIndex(), apostaPlayer2.getSelectedIndex()));
		
		frame.add(player1Label);
		frame.add(player2Label);
		frame.add(imputPlayer1);
		frame.add(imputPlayer2);
		frame.add(button);
		frame.add(apostaPlayer1);
		frame.add(apostaPlayer2);
		frame.add(player1LabelAposta);
		frame.add(player2LabelAposta);
		
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

}
