package game;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

import br.ies.aula.alpoo.EvenOrODD.models.GameResults;

public class Panel {
	private String name;
	private JFrame screen = new JFrame();
	private JTextField input;
	private JComboBox<GameResults> comboBox; 
	
	public Panel(String name) {
		this.name = name;
		createPanel();
		createField();
		createPlayButton();
		createBox();
		screen.setVisible(true);
		screen.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
	private void createPanel() {
		screen.setSize(500, 300);
		screen.setLayout(null);
		screen.setTitle("Even Or ODD");
	}
	
	private void createPlayButton() {
		JButton playButton = new JButton("Jogar");
		playButton.setLocation(50, 80);
		playButton.setSize(80,25);
		playButton.addActionListener(new ControlGameEvenOrODD(input));
		screen.add(playButton);
	}
	
	private void createField() {
		JLabel labelInput = new JLabel("Digite sua jogada, "+ name);
		labelInput.setSize(200,15);
		labelInput.setLocation(0, 50);
		screen.add(labelInput);
		
		input = new JTextField();
		input.setSize(100,20);
		input.setLocation(180, 45);
		screen.add(input);
	}
	
	private void createBox() {
		comboBox = new JComboBox<GameResults>();
		comboBox.setSize(100, 20);
		comboBox.setLocation(280, 45);
		comboBox.addItem(GameResults.IMPAR);
		comboBox.addItem(GameResults.PAR);
		screen.add(comboBox);
	}
}
