package alpoo;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

import aula.par.impar.LojaDoJogoParImpar;
import aula.par.impar.OuvinteDeResultado;
import aula.par.impar.banco.de.dados.ArmazenadorDeVitoriasNoBancoDeDados;
import aula.par.impar.entidade.Aposta;
import aula.par.impar.entidade.ResultadosDoJogoParImpar;

public class JanelaJogoParImpar extends JFrame implements OuvinteDeResultado {
	private static final long serialVersionUID = 1L;

	private JTextField jogadaTextField;
	private JComboBox<ResultadosDoJogoParImpar> apostaTextField;
	private JTextField nomeTextField;
	private JLabel ganhadorLabel;

	private LojaDoJogoParImpar jogo;

	JanelaJogoParImpar(Integer x, Integer y, LojaDoJogoParImpar jogo) {
		jogadaTextField = new JTextField(4);
		apostaTextField = new JComboBox<ResultadosDoJogoParImpar>();
		nomeTextField = new JTextField(4);

		this.jogo = jogo;
		jogo.adicionarUmOuvinteDeResultado(this);
		// Tela
		setSize(350, 400);
		setLocation(x, y);
		getContentPane().setLayout(null);
		setTitle("Jogo Par Ou Ímpar");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		// Conteúdo
		createPlayerView();
		// Habilitar o conteúdo visível
		setVisible(true);
	}

	private void createPlayerView() {
		JLabel nomeLabel = new JLabel("Seu Nome:");
		JLabel jogadaLabel = new JLabel("Sua Jogada:");
		JButton botaoJogar = new JButton("Jogar");
		botaoJogar.addActionListener(new ControleDoJogoParImpar(jogadaTextField, apostaTextField, nomeTextField, jogo));
		ganhadorLabel = new JLabel("O vencedor é: ...");

		apostaTextField.addItem(ResultadosDoJogoParImpar.IMPAR);
		apostaTextField.addItem(ResultadosDoJogoParImpar.PAR);

		setupJogador(nomeLabel, jogadaLabel, botaoJogar, ganhadorLabel);

		getContentPane().add(nomeLabel);
		getContentPane().add(nomeTextField);
		getContentPane().add(jogadaLabel);
		getContentPane().add(jogadaTextField);
		getContentPane().add(apostaTextField);
		getContentPane().add(botaoJogar);
		getContentPane().add(ganhadorLabel);
	}

	public void setupJogador(JLabel nomeLabel, JLabel jogadaLabel, JButton botaoJogar, JLabel ganhadorLabel) {
		// Nome
		nomeLabel.setSize(200, 20);
		nomeLabel.setLocation(45, 10);
		nomeTextField.setSize(200, 20);
		nomeTextField.setLocation(45, 40);
		// Jogada
		jogadaLabel.setSize(200, 20);
		jogadaLabel.setLocation(45, 70);
		jogadaTextField.setSize(200, 20);
		jogadaTextField.setLocation(45, 100);
		// Aposta
		apostaTextField.setSize(200, 20);
		apostaTextField.setLocation(45, 135);
		// Botão
		botaoJogar.setSize(200, 40);
		botaoJogar.setLocation(45, 180);
		// Ganhador
		ganhadorLabel.setSize(200, 57);
		ganhadorLabel.setLocation(45, 230);
	}

	public static void main(String[] args) {
		LojaDoJogoParImpar jogo = new LojaDoJogoParImpar();
		jogo.adicionarUmOuvinteDeResultado(new ArmazenadorDeVitoriasNoBancoDeDados());
		
		Integer posicaoXJogador1 = Integer.valueOf(600);
		Integer posicaoYJogador1 = Integer.valueOf(300);

		Integer posicaoXJogador2 = Integer.valueOf(940);
		Integer posicaoYJogador2 = Integer.valueOf(300);

		new JanelaJogoParImpar(posicaoXJogador1, posicaoYJogador1, jogo);
		new JanelaJogoParImpar(posicaoXJogador2, posicaoYJogador2, jogo);
	}

	@Override
	public void avisa(ResultadosDoJogoParImpar parOuImpar, Aposta apostaVencedora) {
		ganhadorLabel.setText("<html>Ganha: " + parOuImpar + "<br/>O vencedor é:" + apostaVencedora.getNome() + " </html>");

	}

}