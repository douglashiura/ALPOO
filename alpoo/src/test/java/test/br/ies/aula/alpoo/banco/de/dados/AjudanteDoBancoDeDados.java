package test.br.ies.aula.alpoo.banco.de.dados;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class AjudanteDoBancoDeDados {

	private static final String APAGAR_DADOS = "DELETE FROM Aposta;";
	

	public static void limparTudo() throws SQLException {
		String url = "jdbc:postgresql://localhost:5432/app";
		String user = "comexchain";
		String password = "comexchain";
		Connection connection = DriverManager.getConnection(url, user, password);
		Statement statement = connection.createStatement();
		statement.execute(APAGAR_DADOS);
		statement.close();
		connection.close();

	}

}
