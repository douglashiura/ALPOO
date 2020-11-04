package controllers;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import db.Conn;
import model.Movement;

public class MovementController {
	public void insert(Movement movement) {
		Connection conn = Conn.connect();

		String sql = String.format("INSERT INTO Movement (game_id, movement) VALUES (%d, '%s')", movement.getGameID(), movement.getMovement());
		try {
			Statement stat = conn.createStatement();
			stat.executeUpdate(sql, Statement.RETURN_GENERATED_KEYS);
			ResultSet rs = stat.getGeneratedKeys();
			rs.next();
			movement.setGameID(rs.getInt("game_id"));
			Conn.close(conn, stat);
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	public ArrayList<Movement> getAllByGameId(Integer gameId){
		Connection conn = Conn.connect();
		String sql = String.format("SELECT * FROM Movement WHERE game_id = %d ORDER BY move_id ", gameId);
		ArrayList<Movement> moves = new ArrayList<Movement>();
		try {
			Statement stat = conn.createStatement();
			ResultSet rs = stat.executeQuery(sql);
			while (rs.next()){
				moves.add(new Movement(rs.getInt("move_id"), rs.getInt("game_id"), rs.getString("movement")));
			}
			Conn.close(conn, stat, rs);
			return moves;
		} catch (SQLException e) {
			System.out.println("");
		}
		return null;

	}
}
