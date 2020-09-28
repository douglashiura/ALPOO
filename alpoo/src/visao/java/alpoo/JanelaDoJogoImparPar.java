package alpoo;

import java.awt.Color;
import java.awt.Component;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

import jogo.LojaDoJogoParImpar;
import jogo.OuvinteDeResultado;
import jogo.ResultadosDoJogoImparPar;
import jogo.entidades.Aposta;

public class JanelaDoJogoImparPar extends JFrame implements OuvinteDeResultado {

	private static final long serialVersionUID = 1L;
	private JTextField entradaDoJogador;
	private JComboBox<ResultadosDoJogoImparPar> entradaDaApostaDoJogador;
	private JTextField entradaDoNomeDoJogador;
	private JLabel resultado;
	private LojaDoJogoParImpar jogo;

	public JanelaDoJogoImparPar(LojaDoJogoParImpar jogo) {
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
		resultado.setSize(400, 25);
		add(resultado);
	}

	private void adicionaBotaoJogar() {
		JButton botaoJogar = new JButton("Jogar");
		botaoJogar.addActionListener(
				new ControleDoJogoParImpar(entradaDoJogador, entradaDaApostaDoJogador, entradaDoNomeDoJogador, jogo));
		botaoJogar.setLocation(100, 100);
		botaoJogar.setSize(80, 25);
		add(botaoJogar);
	}

	private JPanel criarPainelPanelDoPrimeiroJogador() {
		JPanel painel = new JPanel();
		JLabel campoDoPrimeiroJogador = new JLabel("Jogada jogador");
		entradaDoJogador = new JTextField(4);
		JLabel apostaDoPrimeiroJogador = new JLabel("Aposta do jogador");
		entradaDaApostaDoJogador = new JComboBox<ResultadosDoJogoImparPar>();
		entradaDaApostaDoJogador.addItem(ResultadosDoJogoImparPar.IMPAR);
		entradaDaApostaDoJogador.addItem(ResultadosDoJogoImparPar.PAR);
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
		new JanelaDoJogoImparPar(jogo);
		new JanelaDoJogoImparPar(jogo);
	}

	@Override
	public void avisa(List<Aposta> aposta) {
		List<String> nomes = new ArrayList<String>();
		for (Aposta x : aposta) {
			nomes.add(x.getNome());
		}
		resultado.setText(String.format("Ganha %s", nomes));
	}

}