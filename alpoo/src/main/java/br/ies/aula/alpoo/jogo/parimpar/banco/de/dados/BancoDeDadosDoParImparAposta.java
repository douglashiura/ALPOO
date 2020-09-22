package br.ies.aula.alpoo.jogo.parimpar.banco.de.dados;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.LinkedList;
import java.util.List;

import br.ies.aula.alpoo.jogo.parimpar.entidade.Aposta;
import br.ies.aula.alpoo.jogo.parimpar.entidade.ResultadosDoJogoParImpar;

public class BancoDeDadosDoParImparAposta {

	private static final String SQL_INSERT = "INSERT INTO Aposta (nome, aposta, valor) VALUES(?, ?, ?) RETURNING id;";
	private static final String SQL_SELECT = "SELECT id, nome, aposta, valor FROM Aposta;";

	public List<Aposta> obterApostas() throws SQLException {
		Connection connection = obterConexao();
		Statement statement = connection.createStatement();
		ResultSet resultSet = statement.executeQuery(SQL_SELECT);
		LinkedList<Aposta> apostas = new LinkedList<Aposta>();
		while (resultSet.next()) {
			Integer id = resultSet.getInt(1);
			String nome = resultSet.getString(2);
			ResultadosDoJogoParImpar apostaRealizada = ResultadosDoJogoParImpar.valueOf(resultSet.getString(3));
			Integer valor = resultSet.getInt(4);
			Aposta aposta = new Aposta(nome, apostaRealizada, valor);
			aposta.setId(id);
			apostas.add(aposta);
		}
		resultSet.close();
		statement.close();
		connection.close();
		return apostas;
	}

	public void inserir(Aposta aposta) throws SQLException {
		Connection connection = obterConexao();
		PreparedStatement statement = connection.prepareStatement(SQL_INSERT);
		statement.setString(1, aposta.getNome());
		statement.setString(2, aposta.getAposta().name());
		statement.setInt(3, aposta.getValor());
		statement.execute();
		ResultSet resultSet = statement.getResultSet();
		resultSet.next();
		aposta.setId(resultSet.getInt(1));
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
