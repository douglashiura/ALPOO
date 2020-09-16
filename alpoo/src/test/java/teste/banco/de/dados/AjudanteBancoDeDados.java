package teste.banco.de.dados;

import java.sql.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class AjudanteBancoDeDados {

	private static final String DELETE_DATA = "DELETE FROM Aposta;";

	public static void limparTudo() throws SQLException {
		String url = "jdbc:postgresql://localhost:5432/app";
		String user = "postgres";
		String password = "9922";
		Connection connection = DriverManager.getConnection(url, user, password);
		Statement statement = connection.createStatement();
		statement.execute(DELETE_DATA);
		statement.close();
		connection.close();
	}

}
