package jogo.banco.de.dados;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import jogo.entidades.Pessoa;

public class BancoDeDadosParImparPessoa extends BancoDeDados{
	
	private final String INSERT_PERSON = "INSERT INTO pessoa(nome, dt_nasc) VALUES(?, ?);";
	
	public void inserir(Pessoa pessoa) throws SQLException {
		Connection conexao = obterConexao();
		PreparedStatement statement = conexao.prepareStatement(INSERT_PERSON);
		statement.setString(1, pessoa.getNome());
		statement.setDate(2, new Date(pessoa.getDataDeNascimento().getTime()));
		statement.execute();
		statement.close();
		conexao.close();
	}
}
