package aula.par.impar.banco.de.dados;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public abstract class BancoDeDadosConnection {
	
	protected Connection obterConexao() throws SQLException {
		String url = "jdbc:postgresql://localhost:5432/app";
		String user = "postgres";
		String password = "9922";
		Connection connection = DriverManager.getConnection(url, user, password);
		return connection;
	}
}
