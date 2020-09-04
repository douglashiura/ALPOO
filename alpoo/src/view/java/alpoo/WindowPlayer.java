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
	private JTextField imputPlayerName;
	private JLabel playerLabel;
	private JLabel playerLabelName;
	private JLabel playerLabelAposta;
	private JComboBox<Results> apostaPlayer;
	private JButton button;
	
	public WindowPlayer() {
		setSize(300, 300);
		setLayout(null);
		setTitle("Jogo Par Impar");
		
		playerLabelName = new JLabel("Digite nome:");
		playerLabelName.setSize(200,20);
		playerLabelName.setLocation(10, 10);
		
		imputPlayerName = new JTextField(4);		
		imputPlayerName.setSize(200, 20);
		imputPlayerName.setLocation(10, 40);
		
		playerLabel = new JLabel("Digite número:");
		playerLabel.setSize(200,20);
		playerLabel.setLocation(10, 70);
		
		imputPlayer = new JTextField(4);		
		imputPlayer.setSize(200, 20);
		imputPlayer.setLocation(10, 100);
		
		playerLabelAposta = new JLabel("Escolha aposta:");
		playerLabelAposta.setSize(200,20);
		playerLabelAposta.setLocation(10, 130);

		apostaPlayer = new JComboBox<Results>();
		apostaPlayer.addItem(Results.IMPAR);
		apostaPlayer.addItem(Results.PAR);
		
		apostaPlayer.setLocation(10, 160);
		apostaPlayer.setSize(200, 20);
		apostaPlayer.setSelectedIndex(0);
		
		add(playerLabel);
		add(imputPlayer);
		add(apostaPlayer);
		add(playerLabelAposta);
		add(playerLabelName);
		add(imputPlayerName);
		
		createButton();
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
	public void createButton() {
		button = new JButton("Jogar");		
		button.addActionListener(new ControlParImpar(imputPlayer, apostaPlayer, imputPlayerName));
		button.setLocation(10, 200);
		button.setSize(200, 25);
		add(button);		
	}

	public static void main(String[] args) {
		new WindowPlayer();
		new WindowPlayer();
	}
}
