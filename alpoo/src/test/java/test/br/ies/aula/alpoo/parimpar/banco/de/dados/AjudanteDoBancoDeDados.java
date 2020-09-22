package test.br.ies.aula.alpoo.parimpar.banco.de.dados;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class AjudanteDoBancoDeDados {

	private static final String APAGAR_DADOS = "DELETE FROM ganhador; DELETE FROM aposta;";
	

	public static void limparTudo() throws SQLException {
		String url = "jdbc:postgresql://localhost:5432/app";
		String user = "postgres";
		String password = "guidev87";
		Connection connection = DriverManager.getConnection(url, user, password);
		Statement statement = connection.createStatement();
		statement.execute(APAGAR_DADOS);
		statement.close();
		connection.close();

	}

}
