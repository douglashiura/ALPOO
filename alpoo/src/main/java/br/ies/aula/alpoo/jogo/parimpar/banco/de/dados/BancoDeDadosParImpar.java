package br.ies.aula.alpoo.jogo.parimpar.banco.de.dados;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class BancoDeDadosParImpar {

	private static Connection connection;
	
	private static final String URL = "jdbc:postgresql://localhost:5432/ALPOO";
	private static final String USER = "AdminAPS";
	private static final String PASSWORD = "123456";
	
	public static Connection obterConnection() throws SQLException {
		if (connection != null) {
			return connection;
		} else {
			Connection connection = DriverManager.getConnection(URL, USER, PASSWORD);
			return connection;
		}
	}
}
	
