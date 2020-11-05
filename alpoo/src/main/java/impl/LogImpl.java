package impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

import dao.LogDao;
import db.GetConnection;

public class LogImpl implements LogDao {
	GetConnection conexao = new GetConnection();

	@Override
	public Integer contaLogs() throws Exception {
		Integer numeroLogs = 0;
		try {
			GetConnection conexao = new GetConnection();
			Connection con = conexao.getConnection();
			PreparedStatement statement = con.prepareStatement("SELECT COUNT(*) AS total FROM log_jogadas");
			ResultSet result = statement.executeQuery();
			while (result.next()) {
				numeroLogs = result.getInt("total");
			}
			return numeroLogs;
		} catch (Exception e) {
			System.out.println(e);
		}
		return null;
	}

	@Override
	public void removeLogs() throws Exception {
		Connection con = conexao.getConnection();
		try {
			Statement stmt = con.createStatement();
			String sql = "TRUNCATE log_jogadas RESTART IDENTITY CASCADE";
			stmt.executeUpdate(sql);
			con.close();
		}

		catch (Exception e) {
			System.out.println(e);
			con.close();
		}
	}
}
