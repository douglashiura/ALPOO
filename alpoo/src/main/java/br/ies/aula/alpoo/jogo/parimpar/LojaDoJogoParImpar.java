package br.ies.aula.alpoo.jogo.parimpar;

import java.sql.SQLException;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;

import br.ies.aula.alpoo.jogo.parimpar.banco.de.dados.BancoDeDadosDoParImparAposta;
import br.ies.aula.alpoo.jogo.parimpar.entidade.Aposta;
import br.ies.aula.alpoo.jogo.parimpar.entidade.ResultadosDoJogoParImpar;

public class LojaDoJogoParImpar {

	private List<OuvinteDeResultado> ouvintes;
	private EstadoDeJogada estadoDoJogo;
	private LinkedList<Aposta> apostas;
	private BancoDeDadosDoParImparAposta banco;

	public LojaDoJogoParImpar() {
		this.banco = new BancoDeDadosDoParImparAposta();
		ouvintes = new LinkedList<OuvinteDeResultado>();
		iniciarPartida();
	}

	public void fixaJogada(Aposta aposta) throws SQLException {
		banco.inserir(aposta);
		apostas.add(aposta);
		estadoDoJogo.jogar(aposta);
	}

	public void adicionarUmOuvinteDeResultado(OuvinteDeResultado ouvinteDeTeste) {
		this.ouvintes.add(ouvinteDeTeste);
	}

	public void iniciarPartida() {
		estadoDoJogo = new PrimeiraJogada(this);
		apostas = new LinkedList<Aposta>();
	}

	public void fixarMaquinaDeEstadoDasJogadas(EstadoDeJogada estado) {
		estadoDoJogo = estado;
	}

	public void avisaOuvintes(ResultadosDoJogoParImpar vencedor) {
		List<Aposta> vencedores = obterApostas(vencedor);
		ouvintes.forEach(ouvinte -> {
			ouvinte.avisa(vencedor,vencedores);
		});
	}

	private List<Aposta> obterApostas(ResultadosDoJogoParImpar vencedor) {
		HashMap<ResultadosDoJogoParImpar, List<Aposta>> apostasIndexadas = new HashMap<ResultadosDoJogoParImpar, List<Aposta>>();
		apostasIndexadas.put(ResultadosDoJogoParImpar.IMPAR, new LinkedList<Aposta>());
		apostasIndexadas.put(ResultadosDoJogoParImpar.PAR, new LinkedList<Aposta>());
		for (Aposta aposta : apostas) {
			apostasIndexadas.get(aposta.getAposta()).add(aposta);
		}
		return apostasIndexadas.get(vencedor);
	}
}
