package main.interfaceImp;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import main.getconnection.GetConnection;
import main.interfaceview.ScoreInterf;

public class ScoreImp implements ScoreInterf {
	private PreparedStatement stm;
	private ResultSet rs;

	@Override
	public Integer score() throws Exception {
		GetConnection connection = new GetConnection();
		Connection conn = connection.getConnection();

		stm = conn.prepareStatement("SELECT maxScore()");
		rs = stm.executeQuery();
		
		int valueScore = 0;
		while(rs.next()) {
			valueScore = rs.getInt("maxscore");
			System.out.println(valueScore);
		}
		conn.close();
		return valueScore;
	}

	@Override
	public Integer currentScore() throws Exception {
		GetConnection connection = new GetConnection();
		Connection conn = connection.getConnection();

		stm = conn.prepareStatement("SELECT currentScore()");
		rs = stm.executeQuery();

		int currentScore = 0;

		while(rs.next()) {
			currentScore = rs.getInt("currentscore");
		}
		conn.close();

		return currentScore;
	}
}
