package main.interfaceImp;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import main.getconnection.GetConnection;
import main.interfaceview.scoreInterf;

public class ScoreImp implements scoreInterf {
	private PreparedStatement stm;
	private ResultSet rs;

	@Override
	public Integer score() throws Exception {
		GetConnection connection = new GetConnection();
		Connection conn = connection.getConnection();
		
		stm = conn.prepareStatement("SELECT maxScore()");
		rs = stm.executeQuery();
		
		Integer valueScore = 0;
		
		while(rs.next()) {
			
		valueScore = rs.getInt("maxscore");
		}
		
		return valueScore;
		}
	}
