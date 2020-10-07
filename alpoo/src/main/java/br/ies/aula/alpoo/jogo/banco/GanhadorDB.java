package br.ies.aula.alpoo.jogo.banco;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.Timestamp;

import br.ies.aula.alpoo.jogo.entidade.Ganhador;

public class GanhadorDB {
	
	public void inserirGanhador(Ganhador ganhador) throws SQLException {
		try(Connection con = ConexaoPostgreSQL.getConnection()){
			String sql = "INSERT INTO ganhador (horario, aposta_id) VALUES(?, ?)";
			PreparedStatement stmt = con.prepareStatement(sql,Statement.RETURN_GENERATED_KEYS);
			stmt.setTimestamp(1, new Timestamp(ganhador.getDate().getTime()));
			stmt.setLong(2, ganhador.getAposta().getId());
			stmt.execute();
			ResultSet rs = stmt.getGeneratedKeys();
			if(rs.next()) {
				ganhador.setId(rs.getInt(1));
			}
			rs.close();
			stmt.close();
		}
	}
}
