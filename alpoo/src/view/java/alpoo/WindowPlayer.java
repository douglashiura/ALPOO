package alpoo;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

import br.ies.aula.alpoo.parouimpar.Results;

public class WindowPlayer extends JFrame {

	private static final long serialVersionUID = 1L;
	private JTextField imputPlayer;
	private JLabel player1Label;
	private JLabel player1LabelAposta;
	private JComboBox<Results> apostaPlayer;
	private JButton button;
	
	public WindowPlayer() {
		setSize(430, 200);
		setLayout(null);
		setTitle("Jogo Par Impar");
		
		player1Label = new JLabel("Digite número:");
		player1Label.setSize(200,20);
		player1Label.setLocation(10, 10);
		
		imputPlayer = new JTextField(4);		
		imputPlayer.setSize(200, 20);
		imputPlayer.setLocation(10, 40);
		
		player1LabelAposta = new JLabel("Escolha aposta:");
		player1LabelAposta.setSize(200,20);
		player1LabelAposta.setLocation(10, 70);

		apostaPlayer = new JComboBox<Results>();
		apostaPlayer.addItem(Results.IMPAR);
		apostaPlayer.addItem(Results.PAR);
		
		apostaPlayer.setLocation(10, 100);
		apostaPlayer.setSize(200, 20);
		apostaPlayer.setSelectedIndex(0);
		
		add(player1Label);
		add(imputPlayer);
		add(apostaPlayer);
		add(player1LabelAposta);
		
		createButton();
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
	public void createButton() {
		button = new JButton("Jogar");		
		button.addActionListener(new ControlParImpar(imputPlayer, apostaPlayer));
		button.setLocation(110, 140);
		button.setSize(200, 25);
		add(button);		
	}

	public static void main(String[] args) {
		new WindowPlayer();
		new WindowPlayer();
	}
}
