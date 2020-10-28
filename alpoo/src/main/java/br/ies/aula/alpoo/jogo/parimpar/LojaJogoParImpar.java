package br.ies.aula.alpoo.jogo.parimpar;

import java.sql.SQLException;
import java.sql.Timestamp;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

import br.ies.aula.alpoo.jogo.parimpar.dao.ApostaDao;
import br.ies.aula.alpoo.jogo.parimpar.dao.VencedorDao;
import br.ies.aula.alpoo.jogo.parimpar.dao.implementacao.jdbc.ApostaDaoJdbc;
import br.ies.aula.alpoo.jogo.parimpar.dao.implementacao.jdbc.VencedorDaoJdbc;
import br.ies.aula.alpoo.jogo.parimpar.entidade.Aposta;
import br.ies.aula.alpoo.jogo.parimpar.entidade.ResultadosParImpar;
import br.ies.aula.alpoo.jogo.parimpar.entidade.Vencedor;

public class LojaJogoParImpar {
	
	private EstadoDoJogo estado;
	private List<OuvinteDeResultado> ouvintes;
	private List<Aposta> apostas;
	
	private ApostaDao apostaDao;
	private VencedorDao vencedorDao;

	public LojaJogoParImpar() {
		ouvintes = new LinkedList<OuvinteDeResultado>();
		apostaDao = new ApostaDaoJdbc();
		vencedorDao = new VencedorDaoJdbc();
	}

	public void fixarJogada(Aposta aposta) throws SQLException {
		apostaDao.inserir(aposta);
		apostas.add(aposta);
		estado.jogar(aposta);
	}	
	
	public void iniciarPartida() {
		estado = new PrimeiraJogada(this);
		apostas = new LinkedList<Aposta>();
	}
	
	public void alterarEstado(EstadoDoJogo estado) {
		this.estado = estado;
	}
	
	public void adicionarOuvinte(OuvinteDeResultado ouvinte) {
		ouvintes.add(ouvinte);
	}
	
	public List<OuvinteDeResultado> obterOuvintes() {
		return ouvintes;
	}
	
	public void avisarOuvintes(ResultadosParImpar resultado) {
		List<Aposta> vencedores = gerarVencedores(resultado);
		salvarVencedores(vencedores);
		ouvintes.forEach(ouvinte -> ouvinte.avisa(resultado, vencedores));
	}
	
	private void salvarVencedores(List<Aposta> vencedores) {
		for (Aposta aposta : vencedores) {
			Vencedor vencedor = new Vencedor(aposta, new Timestamp(System.currentTimeMillis()));
			vencedorDao.inserir(vencedor);
		}
	}

	private List<Aposta> gerarVencedores(ResultadosParImpar resultado) {
		Map<ResultadosParImpar, List<Aposta>> apostasIndexadas = new HashMap<ResultadosParImpar, List<Aposta>>();
		
		apostasIndexadas.put(ResultadosParImpar.IMPAR, new LinkedList<Aposta>());
		apostasIndexadas.put(ResultadosParImpar.PAR, new LinkedList<Aposta>());
		
		for (Aposta aposta : apostas) {
			apostasIndexadas.get(aposta.getAposta()).add(aposta);
		}
		
		return apostasIndexadas.get(resultado);
	}

}
