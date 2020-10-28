package br.ies.main.banco.de.dados;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class GerenciadorBancoDeDados {

	public Connection obterConexao() throws SQLException {
		String url = "jdbc:postgresql://localhost:5432/JogoDoOito";
		String user = "postgres";
		String password = "Aloka@01";
		return DriverManager.getConnection(url, user, password);
	}
}
