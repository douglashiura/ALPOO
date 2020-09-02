package alpoo;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class Tela {
	private JFrame tela;
	private static final String[] imparPar = { "Impar", "Par" };
	private String jogador;

	Tela(String nome) {
		jogador = nome;
		tela = new JFrame();
		tela.setSize(500, 500);
		tela.setLayout(null);
		tela.setTitle("Jogo do Par e Impar");
	}

	public void criarCampo() {
		JLabel campo = new JLabel("Entrada do " + jogador + ": ");
		campo.setSize(200, 20);
		campo.setLocation(10, 3);
		tela.add(campo);
	}

	public void criarBotao() {
		JButton jogarBotao = new JButton("Jogar");
		jogarBotao.setSize(80, 40);
		jogarBotao.setLocation(150, 83);
		tela.add(jogarBotao);
	}

	public void entrada() {
		JTextField entradaJogador = new JTextField(null);
		entradaJogador.setSize(30, 20);
		entradaJogador.setLocation(190, 3);
		entradaJogador.setHorizontalAlignment(JTextField.CENTER);
		tela.add(entradaJogador);
	}

	public void aposta() {
		JComboBox<Object> caixa = new JComboBox<Object>(imparPar);
		caixa.setSize(200, 20);
		caixa.setLocation(250, 3);
		tela.add(caixa);
	}

	public void resultado() {
		JLabel resultado = new JLabel();
		resultado.setSize(200, 20);
		resultado.setLocation(150, 200);
		tela.add(resultado);
	}

	public void desenhar() {
		this.criarCampo();
		this.criarBotao();
		this.entrada();
		this.aposta();
		this.resultado();
		tela.setVisible(true);
		tela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}