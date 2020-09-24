package aula.par.impar;

import java.sql.SQLException;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;

import aula.par.impar.banco.de.dados.BancoDeDadosParImparAposta;
import aula.par.impar.banco.de.dados.BancoDeDadosParImparVencedor;
import aula.par.impar.entidade.Aposta;
import aula.par.impar.entidade.ResultadosDoJogoParImpar;
import aula.par.impar.entidade.Vencedor;

public class LojaDoJogoParImpar {
	private List<OuvinteDeResultado> ouvintes;
	private EstadoDeJogada estadoDoJogo;
	private BancoDeDadosParImparAposta bancoDeAposta;
	private BancoDeDadosParImparVencedor bancoDeVencedor;
	
	private static HashMap<ResultadosDoJogoParImpar, String> listaNomesApostas = new HashMap<ResultadosDoJogoParImpar, String>();

	public LojaDoJogoParImpar() {
		this.bancoDeAposta = new BancoDeDadosParImparAposta();
		this.bancoDeVencedor = new BancoDeDadosParImparVencedor();
		ouvintes = new LinkedList<OuvinteDeResultado>();
		iniciarPartida();
	}

	public void fixaJogada(String nome, ResultadosDoJogoParImpar aposta, Integer valor) {
		listaNomesApostas.put(aposta, nome);
		estadoDoJogo.jogar(new Aposta(nome, aposta, valor));
	}

	public void usarBancoDeAposta(Aposta aposta) {
		try {
			bancoDeAposta.inserir(aposta);
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	public void usarBancoDeVencedor(Vencedor vencedor) {
		try {
			bancoDeVencedor.inserir(vencedor);
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	public void adicionarUmOuvinteDeResultado(OuvinteDeResultado ouvinteDeTeste) {
		this.ouvintes.add(ouvinteDeTeste);
	}

//	public void adicionarUmOuvinteDeVencedor(OuvinteDeVencedor ouvinte) {
//		this.ouvintesDeVencedor.add(ouvinte);
//	}
	
	public void iniciarPartida() {
		estadoDoJogo = new PrimeiraJogada(this);
	}

	public void fixarMaquinaDeEstadoDasJogadas(EstadoDeJogada estado) {
		estadoDoJogo = estado;
	}

	public List<OuvinteDeResultado> obterOuvintesDeResultado() {
		return ouvintes;
	}

//	public List<OuvinteDeVencedor> obterOuvintesDeVencedor() {
//		return ouvintesDeVencedor;
//	}
	
	public HashMap<ResultadosDoJogoParImpar, String> obterListaNomesApostas() {
		return listaNomesApostas;
	}
}
