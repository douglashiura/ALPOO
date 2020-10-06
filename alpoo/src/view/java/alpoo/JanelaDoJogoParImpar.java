package alpoo;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Component;
import java.util.List;

import javax.swing.DefaultListModel;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.LineBorder;

import bancodedados.BancoDeDadosDoParImpar;
import entidade.Aposta;
import entidade.ResultadoDoJogoParImpar;
import jogoparimpar.LojaDoJogoParImpar;
import jogoparimpar.OuvinteDeResultado;

public class JanelaDoJogoParImpar extends JFrame implements OuvinteDeResultado {

	private static final long serialVersionUID = 1L;
	private JTextField entradaDoJogador;
	private JComboBox<ResultadoDoJogoParImpar> entradaDaApostaDoJogador;
	private JTextField entradaDoNomeDoJogador;
	private JLabel tituloVencedoresResultado;
	private LojaDoJogoParImpar jogo;
	private JList<Aposta> listaDeVencedores;
	private JLabel resuldadoDoJogo;

	public JanelaDoJogoParImpar(LojaDoJogoParImpar jogo) {
		this.jogo = jogo;
		setSize(683, 312);
		setTitle("Tela do jogo de Par e Impar - 100% IES");
		getContentPane().add(criarPainelPanelDoPrimeiroJogador(), BorderLayout.NORTH);
		adicionaResultado();
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		jogo.adicionarUmOuvinteDeResultado(this);
	}

	private void adicionaResultado() {

		JPanel panel = new JPanel();
		getContentPane().add(panel, BorderLayout.CENTER);
		
		this.adicionaBotaoJogar(panel);
		JPanel panel_1 = new JPanel();
		panel_1.setBorder(new LineBorder(new Color(0, 0, 0), 1, true));
		panel.add(panel_1);
		tituloVencedoresResultado = new JLabel("Vencedores");
		panel_1.add(tituloVencedoresResultado);
		tituloVencedoresResultado.setLocation(230, 100);
		tituloVencedoresResultado.setSize(160, 30);

		listaDeVencedores = new JList<Aposta>();
		panel_1.add(listaDeVencedores);

		resuldadoDoJogo = new JLabel("Aguarde...");
		panel.add(resuldadoDoJogo);
	}

	private void adicionaBotaoJogar( JPanel panel) {
		JButton botaoJogar = new JButton("Jogar");
		panel.add(botaoJogar);
		botaoJogar.addActionListener(
				new ControleDoJogoParImpar(entradaDoJogador, entradaDaApostaDoJogador, entradaDoNomeDoJogador, jogo));
		botaoJogar.setLocation(100, 100);
		botaoJogar.setSize(80, 25);
	}

	private JPanel criarPainelPanelDoPrimeiroJogador() {
		JPanel painel = new JPanel();
		JLabel campoDoPrimeiroJogador = new JLabel("Jogada jogador");
		entradaDoJogador = new JTextField(4);
		JLabel apostaDoPrimeiroJogador = new JLabel("Aposta do jogador");
		entradaDaApostaDoJogador = new JComboBox<ResultadoDoJogoParImpar>();
		entradaDaApostaDoJogador.addItem(ResultadoDoJogoParImpar.IMPAR);
		entradaDaApostaDoJogador.addItem(ResultadoDoJogoParImpar.PAR);
		Component nomeDoPrimeiroJogador = new JLabel("Nome do jogador");
		entradaDoNomeDoJogador = new JTextField(8);
		painel.add(nomeDoPrimeiroJogador);
		painel.add(entradaDoNomeDoJogador);
		painel.add(campoDoPrimeiroJogador);
		painel.add(entradaDoJogador);
		painel.add(apostaDoPrimeiroJogador);
		painel.add(entradaDaApostaDoJogador);
		painel.setSize(800, 30);
		painel.setLocation(6, 6);
		painel.setBackground(Color.LIGHT_GRAY);
		return painel;
	}

	public static void main(String[] args) {
		LojaDoJogoParImpar jogo = new LojaDoJogoParImpar(new BancoDeDadosDoParImpar());
		new JanelaDoJogoParImpar(jogo);
		new JanelaDoJogoParImpar(jogo);
		jogo.adicionarUmOuvinteDeResultado(new ConsoleOuvinteDeJogoParImpar());
	}

	@Override
	public void avisa(ResultadoDoJogoParImpar resultado, List<Aposta> apostas) {
		DefaultListModel<Aposta> vencedores = new DefaultListModel<Aposta>();
		for (Aposta aposta : apostas) {
			vencedores.addElement(aposta);
		}
		listaDeVencedores.setModel(vencedores);
		resuldadoDoJogo.setText(resultado.name());
	}

}
