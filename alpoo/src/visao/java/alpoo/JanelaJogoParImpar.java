package alpoo;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

import aula.par.impar.LojaDoJogoParImpar;
import aula.par.impar.OuvinteDeResultado;
import aula.par.impar.ResultadosDoJogoParImpar;

public class JanelaJogoParImpar extends JFrame implements OuvinteDeResultado{
	private static final long serialVersionUID = 1L;
	
	private JTextField jogadaTextField = new JTextField(4);
	private JComboBox<ResultadosDoJogoParImpar> apostaTextField = new JComboBox<ResultadosDoJogoParImpar>();
	private JTextField nomeTextField = new JTextField(4);
	
	private JLabel ganhadorLabel;
	
	private LojaDoJogoParImpar jogo;
	
	JanelaJogoParImpar(Integer x, Integer y, LojaDoJogoParImpar jogo) {
		this.jogo = jogo;
		//Tela
		setSize(350, 400);
		setLocation(x, y);
		getContentPane().setLayout(null); 
		setTitle("Jogo Par Ou Ímpar");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		//Conteúdo
		jogo.adicionarUmOuvinteDeResultado(this);
		createPlayerView();
		//Habilitar o conteúdo visível
		setVisible(true);
	}

	private void createPlayerView() {
		JLabel nomeLabel = new JLabel("Seu Nome:");
		JLabel jogadaLabel = new JLabel("Sua Jogada:");
		JButton botao = new JButton("Jogar");
		botao.addActionListener(new ControleDoJogoParImpar(jogadaTextField, apostaTextField, nomeTextField, jogo));
		ganhadorLabel = new JLabel("O vencedor é: ...");
		
		apostaTextField.addItem(ResultadosDoJogoParImpar.IMPAR);
		apostaTextField.addItem(ResultadosDoJogoParImpar.PAR);
		
		setupJogador(nomeLabel, jogadaLabel, botao, ganhadorLabel);
		
		getContentPane().add(nomeLabel);
		getContentPane().add(nomeTextField);
		getContentPane().add(jogadaLabel);
		getContentPane().add(jogadaTextField);
		getContentPane().add(apostaTextField);
		getContentPane().add(botao);
		getContentPane().add(ganhadorLabel);
	}
	
	public void setupJogador(JLabel nomeLabel, JLabel jogadaLabel, JButton botao, JLabel ganhadorLabel) {
		//Nome
		nomeLabel.setSize(200,20);
		nomeLabel.setLocation(45,10);
		nomeTextField.setSize(200, 20);
		nomeTextField.setLocation(45,40);
		//Jogada
		jogadaLabel.setSize(200,20);
		jogadaLabel.setLocation(45,70);
		jogadaTextField.setSize(200,20);
		jogadaTextField.setLocation(45,100);
		//Aposta
		apostaTextField.setSize(200,20);
		apostaTextField.setLocation(45,135);
		//Botão
		botao.setSize(200,40);
		botao.setLocation(45,180);
		//Ganhador
		ganhadorLabel.setSize(200, 57);
		ganhadorLabel.setLocation(45,230);
	}
	
	public static void main(String[] args) {
		LojaDoJogoParImpar jogo = new LojaDoJogoParImpar();
		
		Integer xP1 = Integer.valueOf(600);
		Integer yP1 = Integer.valueOf(300);
		
		Integer xP2 = Integer.valueOf(940);
		Integer yP2 = Integer.valueOf(300);
		
		new JanelaJogoParImpar(xP1, yP1, jogo);
		new JanelaJogoParImpar(xP2, yP2, jogo);

	}

	@Override
	public void avisa(ResultadosDoJogoParImpar parOuImpar) {
		ganhadorLabel.setText("<html>Ganha: "+ parOuImpar + "<br/>O vencedor é: </html>");
	}
	
}