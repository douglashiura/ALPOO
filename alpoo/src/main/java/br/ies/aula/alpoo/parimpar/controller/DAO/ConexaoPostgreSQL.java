package br.ies.aula.alpoo.parimpar.controller.DAO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConexaoPostgreSQL {
	private static final String URL = "jdbc:postgresql://localhost:5432/par_impar";
	private static final String USER = "postgres";
	private static final String PASSWORD = "36036055";

	public static Connection getConnection() throws SQLException {
			return DriverManager.getConnection(URL, USER, PASSWORD);
	}
}
