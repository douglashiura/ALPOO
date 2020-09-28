package jogo.banco.de.dados;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class AjudanteDoBancoDeDados {
	
	private static final String DELETE_APOSTA = "DELETE FROM vencedor;DELETE FROM aposta;";
	
	public static void limparTudo() throws SQLException {
		String url = "jdbc:postgresql://localhost:5432/JogoImparPar";
		String user = "postgres";
		String password = "Aloka@01";
		Connection connection = DriverManager.getConnection(url, user, password);
		Statement statement = connection.createStatement();
		statement.execute(DELETE_APOSTA);
		statement.close();
		connection.close();
	}
}
