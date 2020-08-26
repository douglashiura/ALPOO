package alpoo;

import java.awt.Component;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class OddEvenView {

	public static void main(String[] args) {
		JFrame frame = new JFrame();
		frame.setSize(500, 250);
		frame.setLayout(null);
		frame.setTitle("Odd Even game");
		Component firstPlayerField = new JLabel("First player's turn");
		firstPlayerField.setLocation(3, 3);
		firstPlayerField.setSize(200, 20);
		JTextField firstPlayerTextField = new JTextField(4);
		firstPlayerTextField.setSize(200, 20);
		firstPlayerTextField.setLocation(210, 3);
		frame.add(firstPlayerField); 
		frame.add(firstPlayerTextField);
		
		Component secondPlayerField = new JLabel("Second player's turn");
		secondPlayerField.setLocation(3, 30);
		secondPlayerField.setSize(200, 20);
		JTextField secondPlayerTextField = new JTextField(4);
		secondPlayerTextField.setSize(200, 20);
		secondPlayerTextField.setLocation(210, 30);
		frame.add(secondPlayerField); 
		frame.add(secondPlayerTextField);
		
		Component playBtn = new JButton("Play");
		playBtn.setLocation(60, 60);
		playBtn.setSize(100, 25);
		frame.add(playBtn);
		
		
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

}
