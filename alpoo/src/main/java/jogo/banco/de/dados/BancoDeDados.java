package jogo.banco.de.dados;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class BancoDeDados {
	public Connection obterConexao() throws SQLException {
		String url = "jdbc:postgresql://localhost:5432/JogoImparPar";
		String user = "postgres";
		String password = "Aloka@01";
		Connection connection = DriverManager.getConnection(url, user, password);
		return connection;
	}
}
