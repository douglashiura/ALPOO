package alpoo;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class MinhaPrimeiraJanela extends JFrame{

	private static final long serialVersionUID = 1L;

	String[] comboBoxStrings = {"PAR", "IMPAR"};
	
	JTextField entrada1 = new JTextField(4);
	JTextField entrada2 = new JTextField(4);
	
	JComboBox<?> comboBox1 = new JComboBox<Object>(comboBoxStrings);
	JComboBox<?> comboBox2 = new JComboBox<Object>(comboBoxStrings);
	
	MinhaPrimeiraJanela(){
		/* Screen Bounds*/
		setSize(350, 400);
		setLayout(null);
		setTitle("Jogo do Par Ou Ímpar");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	
		this.createJogador1Panel();
		this.createJogador2Panel();
		this.setupBotao();
		
		setVisible(true);
	}

	public void setupJogador1() {
		entrada1.setSize(200,20);
		entrada1.setLocation(45,40);
		
		comboBox1.setSize(200,20);
		comboBox1.setLocation(45,70);
	}
	
	private void createJogador1Panel() {
		JLabel campo1 = new JLabel("Jogada do Primeiro Jogador:");
		this.setupJogador1();
		
		add(campo1);
		campo1.setSize(200,20);
		campo1.setLocation(45,10);
		
		add(entrada1);
		add(comboBox1);
	}
	
	public void setupJogador2() {
		entrada2.setSize(200,20);
		entrada2.setLocation(45,130);
		
		comboBox2.setSize(200,20);
		comboBox2.setLocation(45,160);
		comboBox2.setSelectedIndex(0);
	}
	
	private void createJogador2Panel() {
		JLabel campo2 = new JLabel("Jogada do Segundo Jogador:");
		this.setupJogador2();
		
		add(campo2);
		campo2.setSize(200,20);
		campo2.setLocation(45,70);
		
		add(entrada2);
		add(comboBox2);
	}
	
	public void setupBotao() {
		JButton botao = new JButton("Enviar Resposta");
		
		add(botao);
		botao.setSize(200,40);
		botao.setLocation(45,200);
		
		botao.addActionListener(new ControleDoJogoParImpar(entrada1, entrada2, comboBox1, comboBox2));
	}

	public static void main(String[] args) {
		new MinhaPrimeiraJanela();
	}
	
}