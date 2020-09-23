package visao.douglas;

import java.awt.Color;
import java.awt.Component;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

import aula.par.impar.LojaDoJogoParImpar;
import aula.par.impar.OuvinteDeResultado;
import aula.par.impar.entidade.ResultadosDoJogoParImpar;

public class JanelaDoJogoParImpar extends JFrame implements OuvinteDeResultado {

	private static final long serialVersionUID = 1L;
	private JTextField entradaDoJogador;
	private JComboBox<ResultadosDoJogoParImpar> entradaDaApostaDoJogador;
	private JTextField entradaDoNomeDoJogador;
	private JLabel resultado;
	LojaDoJogoParImpar jogo;

	public JanelaDoJogoParImpar(LojaDoJogoParImpar jogo) {
		this.jogo = jogo;
		setSize(800, 400);
		setLayout(null);
		setTitle("Tela do jogo de Par e Impar - 100% IES");
		add(criarPainelPanelDoPrimeiroJogador());
		adicionaBotaoJogar();
		adicionaResultado();
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		jogo.adicionarUmOuvinteDeResultado(this);
	}

	private void adicionaResultado() {
		resultado = new JLabel("Aguarde");
		resultado.setLocation(230, 100);
		resultado.setSize(80, 25);
		add(resultado);
	}

	private void adicionaBotaoJogar() {
		JButton botaoJogar = new JButton("Jogar");
		botaoJogar.addActionListener(new ControleDoJogoParImpar(entradaDoJogador, entradaDaApostaDoJogador, entradaDoNomeDoJogador, jogo));
		botaoJogar.setLocation(100, 100);
		botaoJogar.setSize(80, 25);
		add(botaoJogar);
	}

	private JPanel criarPainelPanelDoPrimeiroJogador() {
		JPanel painel = new JPanel();
		JLabel campoDoPrimeiroJogador = new JLabel("Jogada jogador");
		entradaDoJogador = new JTextField(4);
		JLabel apostaDoPrimeiroJogador = new JLabel("Aposta do jogador");
		entradaDaApostaDoJogador = new JComboBox<ResultadosDoJogoParImpar>();
		entradaDaApostaDoJogador.addItem(ResultadosDoJogoParImpar.IMPAR);
		entradaDaApostaDoJogador.addItem(ResultadosDoJogoParImpar.PAR);
		Component nomeDoPrimeiroJogador = new JLabel("Nome do jogador");
		entradaDoNomeDoJogador = new JTextField(8);
		painel.add(nomeDoPrimeiroJogador);
		painel.add(entradaDoNomeDoJogador);
		painel.add(campoDoPrimeiroJogador);
		painel.add(entradaDoJogador);
		painel.add(apostaDoPrimeiroJogador);
		painel.add(entradaDaApostaDoJogador);
		painel.setSize(800, 30);
		painel.setLocation(0, 0);
		painel.setBackground(Color.LIGHT_GRAY);
		return painel;
	}

	public static void main(String[] args) {
		LojaDoJogoParImpar jogo = new LojaDoJogoParImpar();
		new JanelaDoJogoParImpar(jogo);
		new JanelaDoJogoParImpar(jogo);
		jogo.adicionarUmOuvinteDeResultado(new ConsoleOuvinteDeJogoParImpar());

	}

	@Override
	public void avisa(ResultadosDoJogoParImpar parOuImpar, LojaDoJogoParImpar jogo) {
		resultado.setText(String.format("Ganha %s", parOuImpar));
	}

}
