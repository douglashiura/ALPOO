package alpoo;

import java.awt.Color;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

import jogoParImpar.ResultParImpar;

public class ScreenOne extends JFrame{
	/**
	 * :)
	 */
	private static final long serialVersionUID = 1L;
	private JTextField firstPlayerEntry;
	private JTextField namePlayer;
	private JComboBox<ResultParImpar> playerFirstBet;
	//screen
	public ScreenOne() {
		setSize(800, 250);
		setLayout(null);
		setTitle("Class IES about Jframe");

		add(setPanelPrimary());

		setButton();
		//setExtendedState(Frame.MAXIMIZED_BOTH);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
	}
	//button
	private void setButton() {
		JButton button = new JButton("Play");
		button.addActionListener(new ControlOddPair(this.firstPlayerEntry, this.playerFirstBet));
		button.setLocation(350, 100);
		button.setSize(80, 25);
		add(button);
	}
		
	//panel
	private JPanel setPanelPrimary() {
		JPanel panel = new JPanel();
	
		
		JLabel labelFirst;
		labelFirst = new JLabel("Play the value");

		firstPlayerEntry = new JTextField(4);
		namePlayer = new JTextField("Type your name", 20);
		
		playerFirstBet = new JComboBox<ResultParImpar>();
		playerFirstBet.addItem(ResultParImpar.IMPAR);
		playerFirstBet.addItem(ResultParImpar.PAR);

		panel.setBackground(Color.DARK_GRAY);
		panel.add(labelFirst);
		panel.add(firstPlayerEntry);
		panel.add(playerFirstBet);
		panel.add(namePlayer);
		panel.setSize(800, 30);
		panel.setLocation(100, 0);

		return panel;
	}
}