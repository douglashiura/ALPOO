package alpoo;

import java.awt.Color;
import java.awt.Component;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

import br.ies.aula.alpoo.jogo.JogoParImpar;
import br.ies.aula.alpoo.jogo.ResultadosDoJogoParImpar;

public class JanelaDoJogoParImpar extends JFrame {

	private static final long serialVersionUID = 1L;
	private JTextField entradaDoJogador;
	private JComboBox<ResultadosDoJogoParImpar> entradaDaApostaDoJogador;
	private Component entradaDoNomeDoJogador;

	public JanelaDoJogoParImpar(JogoParImpar jogo) {
		setSize(800, 400);
		setLayout(null);
		setTitle("Tela do jogo de Par e Impar - 100% IES");
		add(criarPainelPanelDoPrimeiroJogador());
		adicionaBotaoJogar();
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

	private void adicionaBotaoJogar() {
		JButton botaoJogar = new JButton("Jogar");
		botaoJogar.addActionListener(new ControleDoJogoParImpar(entradaDoJogador, entradaDaApostaDoJogador));
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
		JogoParImpar jogo = new JogoParImpar();
		new JanelaDoJogoParImpar(jogo);
		new JanelaDoJogoParImpar(jogo);
	}

}
