package alpoo;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class Panel {
	private String name;
	private JFrame screen = new JFrame();
	private JTextField input;
	
	public Panel(String name) {
		this.name = name;
		createPanel();
		createField();
		createPlayButton();
		screen.setVisible(true);
		screen.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
	public void createPanel() {
		screen.setSize(400, 300);
		screen.setLayout(null);
		screen.setTitle("Even Or ODD");
	}
	
	public void createPlayButton() {
		JButton playButton = new JButton("Jogar");
		playButton.setLocation(50, 80);
		playButton.setSize(80,25);
		playButton.addActionListener(new ControlGameEvenOrODD(input));
		screen.add(playButton);
	}
	
	public void createField() {
		JLabel labelInput = new JLabel("Digite sua jogada, "+ name);
		labelInput.setSize(200,15);
		labelInput.setLocation(0, 50);
		screen.add(labelInput);
		
		input = new JTextField();
		input.setSize(100,20);
		input.setLocation(200, 45);
		screen.add(input);
	}
}
