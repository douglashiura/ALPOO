package br.ies.aula.alpoo.jogo.parimpar.dao;

import java.sql.SQLException;

import br.ies.aula.alpoo.jogo.parimpar.entidade.Pessoa;

public interface PessoaDao {
	
	void inserir(Pessoa pessoa);
	Pessoa pesquisarPorLoguin(String loguin) throws SQLException;
}
	
