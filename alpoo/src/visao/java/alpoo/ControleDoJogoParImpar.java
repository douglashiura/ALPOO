package alpoo;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.SQLException;

import javax.swing.JComboBox;
import javax.swing.JTextField;

import jogo.LojaDoJogoParImpar;
import jogo.ResultadosDoJogoImparPar;
import jogo.entidades.Aposta;

public class ControleDoJogoParImpar implements ActionListener {
	private JTextField entradaDoPrimeiroJogador;
	private JComboBox<ResultadosDoJogoImparPar> entradaDaApostaDoPrimeiroJogador;
	private JTextField entradaDoNomeDoJogador;
	private LojaDoJogoParImpar jogo;

	public ControleDoJogoParImpar(JTextField entradaDoPrimeiroJogador,
			JComboBox<ResultadosDoJogoImparPar> entradaDaApostaDoPrimeiroJogador, JTextField entradaDoNomeDoJogador,
			LojaDoJogoParImpar jogo) {
		this.entradaDoPrimeiroJogador = entradaDoPrimeiroJogador;
		this.entradaDaApostaDoPrimeiroJogador = entradaDaApostaDoPrimeiroJogador;
		this.entradaDoNomeDoJogador = entradaDoNomeDoJogador;
		this.jogo = jogo;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		Integer valor = Integer.valueOf(entradaDoPrimeiroJogador.getText());
		ResultadosDoJogoImparPar apostaImparPar = (ResultadosDoJogoImparPar) entradaDaApostaDoPrimeiroJogador
				.getSelectedItem();
		String nome = entradaDoNomeDoJogador.getText();
		Aposta aposta = new Aposta(nome, apostaImparPar, valor);

		try {
			jogo.fixaJogada(aposta);
		} catch (SQLException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}

	}
}