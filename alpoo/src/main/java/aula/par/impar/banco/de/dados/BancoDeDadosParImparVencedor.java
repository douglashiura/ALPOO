package aula.par.impar.banco.de.dados;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Timestamp;

import aula.par.impar.entidade.Vencedor;

public class BancoDeDadosParImparVencedor extends BancoDeDadosConnection {

	private static final String SQL_INSERT = "INSERT INTO vencedor(aposta_id, data) VALUES (?, ?);";

	public void inserir(Vencedor vencedor) throws SQLException {
		Connection connection = obterConexao();
		PreparedStatement statement = connection.prepareStatement(SQL_INSERT);
		statement.setInt(1, vencedor.getAposta().getId());
		statement.setTimestamp(2, new Timestamp(vencedor.getDate().getTime()));
		statement.execute();
		statement.close();
		connection.close();
	}
}
