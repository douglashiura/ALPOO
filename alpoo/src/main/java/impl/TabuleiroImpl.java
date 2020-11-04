package impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import dao.TabuleiroDao;
import db.GetConnection;

public class TabuleiroImpl implements TabuleiroDao {
	GetConnection conexao = new GetConnection();

	@Override
	public void criaTabuleiro() throws Exception {
		Connection con = conexao.getConnection();

		try {
			PreparedStatement posted = con.prepareStatement(
					"INSERT INTO tabuleiro(casa_cima_esquerda, casa_cima_meio, casa_cima_direita, casa_meio_esquerda, casa_meio, casa_meio_direita, casa_inferior_esquerda, casa_inferior_meio, casa_inferior_direita) VALUES (2,4,6,8,0,1,3,5,7)");
			posted.executeUpdate();
			con.close();
		} catch (Exception e) {
			System.out.println(e);
			con.close();
		}
	}

	@Override
	public ArrayList<String> pegaTabuleiro(int id) throws Exception {
		Connection con = conexao.getConnection();

		try {
			PreparedStatement statement = con.prepareStatement("select * from tabuleiro as t;");
			ResultSet result = statement.executeQuery();
			ArrayList<String> array = new ArrayList<String>();

			while (result.next()) {
				array.add(result.getString("t.casa_cima_esquerda"));
				array.add(result.getString("t.casa_cima_meio"));
				array.add(result.getString("t.casa_cima_direita"));
				array.add(result.getString("t.casa_meio_esquerda"));
				array.add(result.getString("t.casa_meio"));
				array.add(result.getString("t.casa_meio_direita"));
				array.add(result.getString("t.casa_inferior_esquerda"));
				array.add(result.getString("t.casa_inferior_meio"));
				array.add(result.getString("t.casa_inferior_direita"));
			}

			con.close();
			return array;
		}

		catch (Exception e) {
			System.out.println(e);
			con.close();
		}

		return null;
	}

	@Override
	public void removeTabuleiro() throws Exception {
		Connection con = conexao.getConnection();

		try {
			Statement stmt = con.createStatement();
			String sql = "TRUNCATE tabuleiro RESTART IDENTITY";
			stmt.executeUpdate(sql);
			con.close();
		}

		catch (Exception e) {
			System.out.println(e);
			con.close();
		}

	}

	@Override
	public boolean atualizaTabuleiro(String casaOrigem, String casaDestino) throws Exception {
		boolean isTabuleiroAtualizado = false;
		Connection con = conexao.getConnection();			
		String sql = "select move_casas('"+casaOrigem+"','"+casaDestino+"',1);";
		Statement stmt = con.createStatement();		
		ResultSet result = stmt.executeQuery(sql);
		
		while (result.next()) {
			System.out.println(result.getBoolean(1));
			isTabuleiroAtualizado = result.getBoolean(1);
		}
		
		con.close();
		return isTabuleiroAtualizado;
	}
}
