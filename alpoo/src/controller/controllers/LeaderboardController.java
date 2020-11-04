package controllers;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import db.Conn;
import model.LeaderboardEntry;

public class LeaderboardController {
	public void insert(LeaderboardEntry entry) {
		Connection conn = Conn.connect();

		String sql = String.format("INSERT INTO Leaderboard (game_id, moves, player_name) VALUES (%d, %d, '%s')", entry.getGameID(), entry.getMoves(), entry.getPlayerName());
		try {
			Statement stat = conn.createStatement();
			stat.executeUpdate(sql, Statement.RETURN_GENERATED_KEYS);
			ResultSet rs = stat.getGeneratedKeys();
			rs.next();
			entry.setEntryID(rs.getInt("entry_id"));
			Conn.close(conn, stat);
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	public ArrayList<LeaderboardEntry> getBest10() {
		Connection conn = Conn.connect();
		String sql = "SELECT * FROM Leaderboard ORDER BY moves LIMIT 10";
		ArrayList<LeaderboardEntry> entries = new ArrayList<LeaderboardEntry>();
		try {
			Statement stat = conn.createStatement();
			ResultSet rs = stat.executeQuery(sql);
			while (rs.next()){
				entries.add(new LeaderboardEntry(rs.getInt("entry_id"), rs.getInt("game_id"), rs.getInt("moves"), rs.getString("player_name")));
			}
			Conn.close(conn, stat, rs);
			return entries;
		} catch (SQLException e) {
			System.out.println("");
		}
		return null;
	}

}
