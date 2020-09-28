package jogo.banco.de.dados;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Timestamp;

import jogo.entidades.Vencedor;

public class BancoDeDadosParImparVencedor extends BancoDeDados {

	private static final String INSERT_VENCEDOR = "INSERT INTO vencedor(aposta_id, horario) VALUES(?, ?);";

	public void inserir(Vencedor vencedor) throws SQLException {
		Connection connection = obterConexao();
		PreparedStatement statement = connection.prepareStatement(INSERT_VENCEDOR);
		statement.setInt(1, vencedor.getAposta().getId());
		statement.setTimestamp(2, new Timestamp(vencedor.getDate().getTime()));
		statement.execute();
		statement.close();
		connection.close();
	}

}
