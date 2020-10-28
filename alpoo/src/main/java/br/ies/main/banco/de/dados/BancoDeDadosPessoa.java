package br.ies.main.banco.de.dados;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import br.ies.main.entidades.Pessoa;

public class BancoDeDadosPessoa extends GerenciadorBancoDeDados {

	private final String INSERT = "INSERT INTO pessoa(nome, senha) VALUES(?, ?) RETURNING id;";
	private final String INSERT_TIME = "UPDATE pessoa SET tempo = ? WHERE id = ?";

	public void inserirPessoa(Pessoa pessoa) throws SQLException {
		Connection connection = obterConexao();
		PreparedStatement statement = connection.prepareStatement(INSERT);
		statement.setString(1, pessoa.getNome());
		statement.setString(2, pessoa.getSenha());
		statement.execute();
		ResultSet resultSet = statement.getResultSet();
		resultSet.next();
		pessoa.setId(resultSet.getInt(1));
		statement.close();
		connection.close();
	}

	public void inserirMelhorTempo(Pessoa pessoa) throws SQLException {
		Connection connection = obterConexao();
		PreparedStatement statement = connection.prepareStatement(INSERT_TIME);
		statement.setLong(1, pessoa.getTempo());
		statement.setInt(2, pessoa.getId());
		statement.execute();
		statement.close();
		connection.close();
	}
}
