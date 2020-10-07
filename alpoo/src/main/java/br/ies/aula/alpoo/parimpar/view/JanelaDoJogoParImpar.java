package br.ies.aula.alpoo.parimpar.view;

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
import br.ies.aula.alpoo.parimpar.controller.LojaDoJogoParImpar;
import br.ies.aula.alpoo.parimpar.controller.ouvinte.Ouvinte;
import br.ies.aula.alpoo.parimpar.model.Aposta;
import br.ies.aula.alpoo.parimpar.model.Pessoa;
import br.ies.aula.alpoo.parimpar.model.ResultadosDoJogoParImpar;

	
public class JanelaDoJogoParImpar extends JFrame implements Ouvinte {

	private static final long serialVersionUID = 1L;
	private JTextField entradaDoJogador;
	private JComboBox<ResultadosDoJogoParImpar> entradaDaApostaDoJogador;
	private JLabel tituloVencedoresResultado;
	private LojaDoJogoParImpar jogo;
	private JList<String> listaDeVencedores;
	private JLabel resuldadoDoJogo;
	private Pessoa pessoa;

	public JanelaDoJogoParImpar(LojaDoJogoParImpar jogo, Pessoa pessoa) {
		this.jogo = jogo;
		this.pessoa = pessoa;
		setSize(683, 312);
		setTitle("Tela do jogo de Par e Impar - 100% IES");
		getContentPane().add(criarPainelPanelDoPrimeiroJogador(), BorderLayout.NORTH);
		adicionaBotaoJogar();
		adicionaResultado();
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		jogo.adicionarUmOuvinteDeResultado(this);
	}

	private void adicionaResultado() {

		JPanel panel = new JPanel();
		getContentPane().add(panel, BorderLayout.CENTER);
		JButton botaoJogar = new JButton("Jogar");
		panel.add(botaoJogar);
		botaoJogar.addActionListener(
				new ControleDoJogoParImpar(entradaDoJogador, entradaDaApostaDoJogador, jogo, pessoa));
		botaoJogar.setLocation(100, 100);
		botaoJogar.setSize(80, 25);

		JPanel panel_1 = new JPanel();
		panel_1.setBorder(new LineBorder(new Color(0, 0, 0), 1, true));
		panel.add(panel_1);
		tituloVencedoresResultado = new JLabel("Vencedores");
		panel_1.add(tituloVencedoresResultado);
		tituloVencedoresResultado.setLocation(230, 100);
		tituloVencedoresResultado.setSize(160, 30);

		listaDeVencedores = new JList<String>();
		panel_1.add(listaDeVencedores);

		resuldadoDoJogo = new JLabel("Aguarde...");
		panel.add(resuldadoDoJogo);
	}

	private void adicionaBotaoJogar() {
	}

	private JPanel criarPainelPanelDoPrimeiroJogador() {
		JPanel painel = new JPanel();
		JLabel campoDoPrimeiroJogador = new JLabel("Jogada jogador");
		entradaDoJogador = new JTextField(4);
		JLabel apostaDoPrimeiroJogador = new JLabel("Aposta do jogador");
		entradaDaApostaDoJogador = new JComboBox<ResultadosDoJogoParImpar>();
		entradaDaApostaDoJogador.addItem(ResultadosDoJogoParImpar.IMPAR);
		entradaDaApostaDoJogador.addItem(ResultadosDoJogoParImpar.PAR);
		Component labelNomeJogador = new JLabel("Nome do jogador");
		Component nomeJogador = new JLabel(pessoa.getNome());
		painel.add(labelNomeJogador);
		painel.add(nomeJogador);
		painel.add(campoDoPrimeiroJogador);
		painel.add(entradaDoJogador);
		painel.add(apostaDoPrimeiroJogador);
		painel.add(entradaDaApostaDoJogador);
		painel.setSize(800, 30);
		painel.setLocation(6, 6);
		painel.setBackground(Color.LIGHT_GRAY);
		return painel;
	}
	
	@Override
	public void avisa(ResultadosDoJogoParImpar resultado, List<Aposta> apostas) {
		DefaultListModel<String> vencedores = new DefaultListModel<String>();
		for (Aposta aposta : apostas) {
			vencedores.addElement(aposta.getPessoa().getNome());
		}
		listaDeVencedores.setModel(vencedores);
		resuldadoDoJogo.setText(resultado.name());
	}
}