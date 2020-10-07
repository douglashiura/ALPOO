package test.br.ies.aula.alpoo.banco;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import br.ies.aula.alpoo.jogo.banco.ConexaoPostgreSQL;

public class ResetBanco {
	public static void limparBanco() throws SQLException {
		try(Connection con = ConexaoPostgreSQL.getConnection()){
			String sql = "DELETE FROM ganhador; DELETE FROM aposta";
			PreparedStatement stmt = con.prepareStatement(sql);
			stmt.execute(sql);
			stmt.close();
		}catch (Exception e) {
			throw e;
		}
	}
}
