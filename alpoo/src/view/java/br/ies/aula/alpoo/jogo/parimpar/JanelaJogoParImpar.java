package br.ies.aula.alpoo.jogo.parimpar;

import java.util.List;

import javax.swing.DefaultComboBoxModel;
import javax.swing.DefaultListModel;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JTextField;

import br.ies.aula.alpoo.jogo.parimpar.entidade.Aposta;
import br.ies.aula.alpoo.jogo.parimpar.entidade.ResultadosParImpar;


public class JanelaJogoParImpar extends JFrame implements OuvinteDeResultado{
	
	private static final long serialVersionUID = 1L;
	
	private LojaJogoParImpar jogo;

	private JLabel labelNomeDoJogador;
	private JLabel labelJogadaDoJogador;
	private JLabel labelApostaDoJogador;
	private JLabel labelVencedores;
	private JLabel labelResultado;
	private JTextField textFieldNomeDoJogador;
	private JTextField textFieldJogadaDoJogador;
	private JComboBox<ResultadosParImpar> comboBoxApostaDoJogador;
	private JButton botaoJogar;
	private JList<Aposta> listaDeVencedores;

	public JanelaJogoParImpar(LojaJogoParImpar jogo) {
		this.jogo = jogo;
		configurarJanela();
		montarTela();
		setLocationRelativeTo(null);
		setVisible(true);
		this.jogo.adicionarOuvinte(this);
	}

	private void configurarJanela() {
		setTitle("JOGO PAR OU IMPAR - MURIEL");		
		setSize(300, 250);
		setLayout(null);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
	private void montarTela() {
		montarLabels();
		montarTextFields();
		montarComboBox();
		montarBotaoJogar();
		montarResultado();
	}

	private void montarLabels() {
		labelNomeDoJogador = new JLabel("Nome: ");
		labelNomeDoJogador.setSize(40, 20);
		labelNomeDoJogador.setLocation(1, 10);
		
		labelJogadaDoJogador = new JLabel("Jogada: ");
		labelJogadaDoJogador.setSize(50, 20);
		labelJogadaDoJogador.setLocation(1, 50);
		
		labelApostaDoJogador = new JLabel("Aposta: ");
		labelApostaDoJogador.setSize(50, 20);
		labelApostaDoJogador.setLocation(1, 90);
		
		labelVencedores = new JLabel("Vencedores");
		labelVencedores.setSize(120, 20);
		labelVencedores.setLocation(185, 40);
		
		labelResultado = new JLabel();
		labelResultado.setSize(120, 20);
		labelResultado.setLocation(190, 10);
		
		add(labelNomeDoJogador);
		add(labelJogadaDoJogador);
		add(labelApostaDoJogador);
		add(labelVencedores);
	}
	
	private void montarTextFields() {
		textFieldNomeDoJogador = new JTextField();
		textFieldNomeDoJogador.setSize(100, 25);
		textFieldNomeDoJogador.setLocation(50, 10);
		
		textFieldJogadaDoJogador = new JTextField();
		textFieldJogadaDoJogador.setSize(100, 25);
		textFieldJogadaDoJogador.setLocation(50, 50);
		
		add(textFieldNomeDoJogador);
		add(textFieldJogadaDoJogador);
	}
	
	private void montarComboBox() {
		comboBoxApostaDoJogador = new JComboBox<ResultadosParImpar>();
		comboBoxApostaDoJogador.setModel(new DefaultComboBoxModel<ResultadosParImpar>(ResultadosParImpar.values()));
		comboBoxApostaDoJogador.setSize(100, 25);
		comboBoxApostaDoJogador.setLocation(50, 90);
		
		add(comboBoxApostaDoJogador);
	}
	
	private void montarBotaoJogar() {
		botaoJogar = new JButton("Jogar");
		botaoJogar.setSize(80, 25);
		botaoJogar.setLocation(60, 130);
		botaoJogar.addActionListener(new ControleJogoParImpar(textFieldNomeDoJogador, textFieldJogadaDoJogador, comboBoxApostaDoJogador, jogo));
		
		add(botaoJogar);
	}
	
	private void montarResultado() {
		listaDeVencedores = new JList<Aposta>();
		listaDeVencedores.setBounds(170, 65, 100, 90);
		add(listaDeVencedores);
	}

	@Override
	public void avisa(ResultadosParImpar resultado, List<Aposta> apostasVencedoras) {
		DefaultListModel<Aposta> vencedores = new DefaultListModel<Aposta>();
		
		for (Aposta aposta : apostasVencedoras) {
			vencedores.addElement(aposta);
		}
		
		listaDeVencedores.setModel(vencedores);
		labelResultado.setText(resultado.name());
	}
}



