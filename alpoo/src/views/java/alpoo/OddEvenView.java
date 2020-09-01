package alpoo;

import java.awt.Component;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

import br.ies.aula.alpoo.oddEven.OddEven;

public class OddEvenView {

	public static void main(String[] args) {
		OddEven game = new OddEven();
		
		JFrame frame = new JFrame();
		frame.setSize(550, 250);
		frame.setLayout(null);
		frame.setLocationRelativeTo(null);
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
		
		
		JComboBox<String> firstPlayerSelector = new JComboBox<String>();
		JComboBox<String> secondPlayerSelector = new JComboBox<String>();
		
		firstPlayerSelector.addItem("Odd");
		firstPlayerSelector.addItem("Even");
		firstPlayerSelector.setSize(90, 20);
		firstPlayerSelector.setLocation(420, 3);
		firstPlayerSelector.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent arg0) {
				secondPlayerSelector.setSelectedIndex(firstPlayerSelector.getSelectedIndex() == 0 ? 1 : 0);
				
			}
		});
		frame.add(firstPlayerSelector);
		
		
		secondPlayerSelector.addItem("Odd");
		secondPlayerSelector.addItem("Even");
		secondPlayerSelector.setSelectedIndex(1);
		secondPlayerSelector.setSize(90, 20);
		secondPlayerSelector.setLocation(420, 30);
		secondPlayerSelector.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent arg0) {
				firstPlayerSelector.setSelectedIndex(secondPlayerSelector.getSelectedIndex() == 0 ? 1 : 0);
				
			}
		});
		frame.add(secondPlayerSelector);

		
		JButton playBtn = new JButton("Play");
		playBtn.addActionListener(new OddEvenController(firstPlayerTextField, secondPlayerTextField, firstPlayerSelector.getSelectedItem().toString()));
		playBtn.setLocation(60, 60);
		playBtn.setSize(100, 25);
		frame.add(playBtn);
				
		
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

}
