package aula.par.impar;

import java.sql.SQLException;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;

import aula.par.impar.banco.de.dados.BancoDeDadosParImparAposta;
import aula.par.impar.entidade.Aposta;
import aula.par.impar.entidade.ResultadosDoJogoParImpar;

public class LojaDoJogoParImpar {
	private List<OuvinteDeResultado> ouvintes;
	private EstadoDeJogada estadoDoJogo;
	private BancoDeDadosParImparAposta banco;
	private static HashMap<ResultadosDoJogoParImpar, String> listaNomesApostas = new HashMap<ResultadosDoJogoParImpar, String>();

	public LojaDoJogoParImpar() {
		this.banco = new BancoDeDadosParImparAposta();
		ouvintes = new LinkedList<OuvinteDeResultado>();
		iniciarPartida();
	}

	public void fixaJogada(String nome, ResultadosDoJogoParImpar aposta, Integer valor) {
		Aposta apostaJogador = new Aposta(nome, aposta, valor);
		
		listaNomesApostas.put(aposta, nome);
		try {banco.inserir(apostaJogador);} catch (SQLException e) {
			e.printStackTrace();
		}
		estadoDoJogo.jogar(apostaJogador);
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

	public HashMap<ResultadosDoJogoParImpar, String> obterListaNomesApostas() {
		return listaNomesApostas;
	}
}
