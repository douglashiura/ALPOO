package alpoo;

import java.awt.Color;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

import br.ies.aula.alpoo.jogo.ResultadosDoJogoParImpar;

public class JanelaDoJogoParImpar extends JFrame {

	private static final long serialVersionUID = 1L;
	private JTextField entradaDoSegundoJogador;
	private JTextField entradaDoPrimeiroJogador;
	private JComboBox<ResultadosDoJogoParImpar> entradaDaApostaDoPrimeiroJogador;
	private JComboBox<ResultadosDoJogoParImpar> entradaDaApostaDoSegundoJogador;

	public JanelaDoJogoParImpar() {
		setSize(800, 400);
		setLayout(null);
		setTitle("Tela do jogo de Par e Impar - 100% IES");
		add(criarPainelPanelDoPrimeiroJogador());
		add(criarPanelDoSegundoJogador());
		adicionaBotaoJogar();
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

	private void adicionaBotaoJogar() {
		JButton botaoJogar = new JButton("Jogar");
		botaoJogar.addActionListener(new ControleDoJogoParImpar(entradaDoPrimeiroJogador, entradaDoSegundoJogador,
				entradaDaApostaDoPrimeiroJogador));
		botaoJogar.setLocation(100, 100);
		botaoJogar.setSize(80, 25);
		add(botaoJogar);
	}

	private JPanel criarPanelDoSegundoJogador() {
		JPanel painel = new JPanel();
		JLabel campoDoSegundoJogador = new JLabel("Jogada do segundo jogador");
		entradaDoSegundoJogador = new JTextField(4);
		JLabel apostaDoSegundoJogador = new JLabel("Aposta do segundo jogador");
		entradaDaApostaDoSegundoJogador = new JComboBox<ResultadosDoJogoParImpar>();
		entradaDaApostaDoSegundoJogador.addItem(ResultadosDoJogoParImpar.IMPAR);
		entradaDaApostaDoSegundoJogador.addItem(ResultadosDoJogoParImpar.PAR);
		painel.add(campoDoSegundoJogador);
		painel.add(entradaDoSegundoJogador);
		painel.add(apostaDoSegundoJogador);
		painel.add(entradaDaApostaDoSegundoJogador);
		painel.setSize(800, 30);
		painel.setLocation(0, 30);
		painel.setBackground(Color.LIGHT_GRAY);
		return painel;
	}

	private JPanel criarPainelPanelDoPrimeiroJogador() {
		JPanel painel = new JPanel();
		JLabel campoDoPrimeiroJogador = new JLabel("Jogada do primeiro jogador");
		entradaDoPrimeiroJogador = new JTextField(4);
		JLabel apostaDoPrimeiroJogador = new JLabel("Aposta do primeiro jogador");
		entradaDaApostaDoPrimeiroJogador = new JComboBox<ResultadosDoJogoParImpar>();
		entradaDaApostaDoPrimeiroJogador.addItem(ResultadosDoJogoParImpar.IMPAR);
		entradaDaApostaDoPrimeiroJogador.addItem(ResultadosDoJogoParImpar.PAR);

		painel.add(campoDoPrimeiroJogador);
		painel.add(entradaDoPrimeiroJogador);
		painel.add(apostaDoPrimeiroJogador);
		painel.add(entradaDaApostaDoPrimeiroJogador);
		painel.setSize(800, 30);
		painel.setLocation(0, 0);
		painel.setBackground(Color.DARK_GRAY);
		return painel;
	}

	public static void main(String[] args) {
		new JanelaDoJogoParImpar();
	}

}
