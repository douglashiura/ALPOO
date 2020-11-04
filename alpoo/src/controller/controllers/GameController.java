package controllers;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import db.Conn;
import model.Game;

public class GameController {
	public void insert(Game game) {
		Connection conn = Conn.connect();

		String sql = String.format("INSERT INTO Game (start_sequence) VALUES ('%s')", game.getStartSequence());
		try {
			Statement stat = conn.createStatement();
			stat.executeUpdate(sql, Statement.RETURN_GENERATED_KEYS);
			ResultSet rs = stat.getGeneratedKeys();
			rs.next();
			game.setGameID(rs.getInt("game_id"));
			Conn.close(conn, stat);
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	public Game getById(Integer id) {
		Connection conn = Conn.connect();
		String sql = String.format("SELECT * FROM Game WHERE game_id = %d", id);
		try {
			Statement stat = conn.createStatement();
			ResultSet rs = stat.executeQuery(sql);
			rs.next();
			Game game = new Game(rs.getInt("game_id"), rs.getString("start_sequence"));
			Conn.close(conn, stat, rs);
			return game;
		} catch (SQLException e) {
			System.out.println("");
		}
		return null;
	}
	
}
