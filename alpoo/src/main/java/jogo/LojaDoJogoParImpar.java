package jogo;

import java.sql.SQLException;
import java.util.LinkedList;
import java.util.List;

import jogo.banco.de.dados.BancoDeDadosParImpar;
import jogo.entidades.Aposta;

public class LojaDoJogoParImpar {

	private List<OuvinteDeResultado> ouvintes;
	private EstadoDeJogada estadoDoJogo;

	public LojaDoJogoParImpar() {
		ouvintes = new LinkedList<OuvinteDeResultado>();
		iniciarPartida();
	}

	public void fixaJogada(Aposta aposta) throws SQLException {
		new BancoDeDadosParImpar().inserir(aposta);
		estadoDoJogo.jogar(aposta);
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