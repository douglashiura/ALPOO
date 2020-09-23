package alpoo;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JComboBox;
import javax.swing.JTextField;

import aula.par.impar.LojaDoJogoParImpar;
import aula.par.impar.entidade.ResultadosDoJogoParImpar;

public class ControleDoJogoParImpar implements ActionListener {
	private JTextField jogada;
	private JComboBox<ResultadosDoJogoParImpar> entradaDaAposta;
	private JTextField entradaDoNome;

	private LojaDoJogoParImpar jogo;
	
	public ControleDoJogoParImpar(JTextField jogada,
			JComboBox<ResultadosDoJogoParImpar> entradaDaAposta, JTextField entradaDoNome, LojaDoJogoParImpar jogo) {
		this.jogada = jogada;
		this.entradaDaAposta = entradaDaAposta;
		this.entradaDoNome = entradaDoNome;
		this.jogo = jogo;
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		Integer valor = Integer.valueOf(jogada.getText());
		ResultadosDoJogoParImpar aposta = (ResultadosDoJogoParImpar) entradaDaAposta.getSelectedItem();
		String nome = entradaDoNome.getText();
		jogo.fixaJogada(nome, aposta, valor);
	}
	
}
