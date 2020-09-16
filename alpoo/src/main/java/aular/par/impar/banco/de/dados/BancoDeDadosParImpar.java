package aular.par.impar.banco.de.dados;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.LinkedList;
import java.util.List;

import aula.par.impar.Aposta;
import aula.par.impar.ResultadosDoJogoParImpar;

public class BancoDeDadosParImpar {

	private static final String SQL_INSERT = "INSERT INTO Aposta (nome, aposta, valor) VALUES (?, ?, ?)";
	private static final String SQL_SELECT = "SELECT nome, aposta, valor FROM Aposta";
	
	
	public void inserir(Aposta aposta) throws SQLException {
		Connection connection = obterConexao();
		PreparedStatement statement = connection.prepareStatement(SQL_INSERT);
		statement.setString(1, aposta.getNome());
		statement.setString(2, aposta.getAposta().name());
		statement.setInt(3, aposta.getValor());
		statement.executeUpdate();
		statement.close();
		connection.close();
	}

	public List<Aposta> obterApostas() throws SQLException{
		Connection connection = obterConexao();
		Statement statement = connection.createStatement();
		ResultSet resultSet = statement.executeQuery(SQL_SELECT);
		LinkedList<Aposta> apostas = new LinkedList<Aposta>();
		while(resultSet.next()) {
			String nome = resultSet.getString(1);
			ResultadosDoJogoParImpar apostaRealizada = ResultadosDoJogoParImpar.valueOf(resultSet.getString(2));
			Integer valor = resultSet.getInt(3);
			Aposta aposta = new Aposta(nome, apostaRealizada, valor);
			apostas.add(aposta);
		} 
		resultSet.close();
		statement.close();
		connection.close();
		return apostas;
	}

	private Connection obterConexao() throws SQLException {
		String url = "jdbc:postgresql://localhost:5432/app";
		String user = "postgres";
		String password = "9922";
		Connection connection = DriverManager.getConnection(url, user, password);
		return connection;
	}
	
}
