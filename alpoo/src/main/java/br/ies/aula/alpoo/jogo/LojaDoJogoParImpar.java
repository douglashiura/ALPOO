package br.ies.aula.alpoo.jogo;

import java.util.LinkedList;
import java.util.List;

public class LojaDoJogoParImpar {

	private static LojaDoJogoParImpar instancia;

	private List<OuvinteDeResultado> ouvintes;
	private EstadoDeJogada estadoDoJogo;

	public LojaDoJogoParImpar() {
		ouvintes = new LinkedList<OuvinteDeResultado>();
		iniciarPartida();
	}

	public static LojaDoJogoParImpar obterInstancia() {
		if (instancia == null) {
			instancia = new LojaDoJogoParImpar();
		}
		return instancia;
	}

	public void fixaJogada(String nome, ResultadosDoJogoParImpar aposta, Integer valor) {
		estadoDoJogo.jogar(new Aposta(nome, aposta, valor));
	}

	public void adicionarUmOuvinteDeResultado(OuvinteDeResultado ouvinteDeTeste) {
		this.ouvintes.add(ouvinteDeTeste);
	}

	public void iniciarPartida() {
		estadoDoJogo = new PrimeiraJogada(this);

	}

	public void fixarMaquinaDeEstadoDasJogadas(EstadoDeJogada estado) {
		estadoDoJogo = estado;
	}

	public List<OuvinteDeResultado> obterOuvintes() {
		return ouvintes;
	}
}
