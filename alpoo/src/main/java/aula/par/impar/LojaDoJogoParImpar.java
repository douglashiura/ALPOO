package aula.par.impar;

import java.util.LinkedList;
import java.util.List;

public class LojaDoJogoParImpar {

	private List<OuvinteDeResultado> ouvintes;
	private EstadoDeJogada estadoDoJogo;

	public LojaDoJogoParImpar() {
		ouvintes = new LinkedList<OuvinteDeResultado>();
		iniciarPartida();
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
