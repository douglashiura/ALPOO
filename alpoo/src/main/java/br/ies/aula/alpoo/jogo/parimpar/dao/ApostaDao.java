package br.ies.aula.alpoo.jogo.parimpar.dao;

import java.sql.SQLException;
import java.util.List;

import br.ies.aula.alpoo.jogo.parimpar.entidade.Aposta;

public interface ApostaDao {
	
	void inserir(Aposta aposta);
	
	List<Aposta> obterApostas() throws SQLException;
}
