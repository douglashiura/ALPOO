package br.ies.main.banco.de.dados;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class GerenciadorBancoDeDados {

	private final String apagarBanco = "DELETE FROM pessoa";

	public Connection obterConexao() throws SQLException {
		try {
			Class.forName("org.postgresql.Driver");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		String url = "jdbc:postgresql://localhost:5432/JogoDoOito";
		String user = "UserJogoDoOito";
		String password = "114L";
		return DriverManager.getConnection(url, user, password);
	}

	public void limparBanco() throws SQLException {
		Connection connection = obterConexao();
		PreparedStatement statement = connection.prepareStatement(apagarBanco);
		statement.execute();
		statement.close();
		connection.close();
	}
}
