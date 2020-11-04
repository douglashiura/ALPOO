package br.ies.alpoo.jogo.oito.database;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class ControleDB {
	Connection cnn = ConnectDB.connect();
	TabuleiroConversion tabu = new TabuleiroConversion();
	
	public int executarUpdate(String sql) {
		try {
			Statement stm = cnn.createStatement();
			int res = stm.executeUpdate(sql);
			cnn.close();
			return res;
		} catch (Exception e) {
			e.printStackTrace();
			return 0;
		}
	}
	
	public ResultSet executarSelect(String sql) {
		try {
			Statement stm = cnn.createStatement();
			ResultSet rs = stm.executeQuery(sql);
			cnn.close();
			return rs;
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}

	public Integer[][] getTabuleiro(int id) {
        Connection conn = ConnectDB.connect();
        String sql = "SELECT * FROM tabuleiros WHERE id_tabu = "+ id;
        try {
            Statement stat = conn.createStatement();
            ResultSet rs = stat.executeQuery(sql);
            rs.next();
            String s = rs.getString("tabuleiro");
            String[][] sa = tabu.stringToArray(s);
            Integer[][] sas = TabuleiroConversion.convertString2DToInt(sa);
            return sas;
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }
}
