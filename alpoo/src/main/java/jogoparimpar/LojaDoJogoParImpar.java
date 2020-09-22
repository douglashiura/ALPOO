package jogoparimpar;

import java.sql.SQLException;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;

import bancodedados.BancoDeDadosDoParImpar;
import entidade.Aposta;
import entidade.ResultadoDoJogoParImpar;

public class LojaDoJogoParImpar {
	private List<OuvinteDeResultado> ouvintes;
	private EstadoDeJogada estadoDoJogo;
	private LinkedList<Aposta> apostas;
	private BancoDeDadosDoParImpar banco;

	public LojaDoJogoParImpar(BancoDeDadosDoParImpar banco) {
		ouvintes = new LinkedList<OuvinteDeResultado>();
		this.banco = banco;
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

	public void avisaOuvintes(ResultadoDoJogoParImpar vencedor) {
		List<Aposta> vencedores = obterApostas(vencedor);
		ouvintes.forEach(ouvinte -> {
			ouvinte.avisa(vencedor,vencedores);
		});
	}

	private List<Aposta> obterApostas(ResultadoDoJogoParImpar vencedor) {
		HashMap<ResultadoDoJogoParImpar, List<Aposta>> apostasIndexadas = new HashMap<ResultadoDoJogoParImpar, List<Aposta>>();
		apostasIndexadas.put(ResultadoDoJogoParImpar.IMPAR, new LinkedList<Aposta>());
		apostasIndexadas.put(ResultadoDoJogoParImpar.PAR, new LinkedList<Aposta>());
		for (Aposta aposta : apostas) {
			apostasIndexadas.get(aposta.getAposta()).add(aposta);
		}
		return apostasIndexadas.get(vencedor);
	}
}
