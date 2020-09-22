package br.ies.aula.alpoo.jogo.parimpar.banco.de.dados;

import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Timestamp;

import br.ies.aula.alpoo.jogo.parimpar.entidade.Ganhador;

public class BancoDeDadosDoParImparGanhador {

	private static final String SQL_INSERT = "INSERT INTO ganhador (horario, aposta_id) VALUES(?, ?) RETURNING id;";

	public void inserir(Ganhador ganhador) throws SQLException {
		Connection connection = obterConexao();
		PreparedStatement statement = connection.prepareStatement(SQL_INSERT);
		statement.setTimestamp(1, new Timestamp(ganhador.getDate().getTime()));
		statement.setLong(2, ganhador.getAposta().getId());

		statement.execute();
		ResultSet resultSet = statement.getResultSet();
		resultSet.next();
		ganhador.setId(resultSet.getInt(1));
		resultSet.close();
		statement.close();
		connection.close();
	}

	private Connection obterConexao() throws SQLException {
		String url = "jdbc:postgresql://localhost:5432/app";
		String user = "postgres";
		String password = "guidev87";
		Connection connection = DriverManager.getConnection(url, user, password);
		return connection;
	}
}
