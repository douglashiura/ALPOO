package impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

import dao.JogadorDao;
import db.GetConnection;
import entities.Jogador;

public class JogadorImpl implements JogadorDao {
	GetConnection conexao = new GetConnection();

	@Override
	public void salvaJogador(Jogador jogador) throws Exception {
		Connection con = conexao.getConnection();

		try {
			PreparedStatement posted = con.prepareStatement(
					"INSERT INTO jogador (id_tabuleiro, nome) values (1, '" + jogador.getNome() + "')");
			posted.executeUpdate();
			con.close();
		} catch (Exception e) {
			System.out.println(e);
			con.close();
		}
	}

	@Override
	public void removeJogador() throws Exception {
		Connection con = conexao.getConnection();

		try {
			Statement stmt = con.createStatement();
			String sql = "TRUNCATE jogador RESTART IDENTITY CASCADE";
			stmt.executeUpdate(sql);
			con.close();
		}

		catch (Exception e) {
			System.out.println(e);
			con.close();
		}
	}

	@Override
	public String pegaNomeJogador() throws Exception {
		try {
			GetConnection conexao = new GetConnection();
			Connection con = conexao.getConnection();
			PreparedStatement statement = con.prepareStatement("select * from jogador as j;");
			ResultSet result = statement.executeQuery();

			String nomeJogador = "";
			while (result.next()) {
				nomeJogador = result.getString("nome");
			}
			return nomeJogador;
		} catch (Exception e) {
			System.out.println(e);
		}
		return null;
	}

}
