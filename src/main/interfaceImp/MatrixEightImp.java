package main.interfaceImp;

import java.awt.event.KeyEvent;
import java.sql.Array;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;


import main.entity.MatrixEightEntity;
import main.getconnection.GetConnection;
import main.interfaceview.MatrixEightInterf;
import main.interfaceview.ScoreInterf;

public class MatrixEightImp implements MatrixEightInterf {

	private PreparedStatement stm;
	private ResultSet rs;
	private GetConnection connection;
	private Connection conn;
	private Boolean isWin = false;
	private MatrixEightEntity matrixEight;

	@Override
	public void play() throws Exception {
		connection = new GetConnection();
		conn = connection.getConnection();

		MatrixEightEntity getPlays = new MatrixEightEntity();

		List<Integer> numbers = new ArrayList<Integer>();
		numbers = getPlays.getNumbers();

		stm = conn.prepareStatement("INSERT INTO matrixEight VALUES (nextval('idMatrixseq'), ?,?,?,?,?,?,?,?,?)");
		stm.setInt(1, getPlays.getNumbers().get(0));
		stm.setInt(2, numbers.get(1));
		stm.setInt(3, numbers.get(2));
		stm.setInt(4, numbers.get(3));
		stm.setInt(5, numbers.get(4));
		stm.setInt(6, numbers.get(5));
		stm.setInt(7, numbers.get(6));
		stm.setInt(8, numbers.get(7));
		stm.setInt(9, numbers.get(8));
		stm.executeUpdate();

		conn.close();
	}

	@Override
	public String show(String aij) throws Exception {
		connection = new GetConnection ();
		conn = connection.getConnection();

		stm = conn.prepareStatement("SELECT * FROM matrixEight ORDER BY idmatrix DESC LIMIT 1");
		rs = stm.executeQuery();

		String rowColumn = null;

		while(rs.next()) {
			rowColumn = rs.getString(aij);
		}

		conn.close();
		return rowColumn;

	}
	@Override
	public void show() throws Exception {
		connection = new GetConnection ();
		conn = connection.getConnection();

		stm = conn.prepareStatement("SELECT * FROM matrixEight ORDER BY idmatrix DESC LIMIT 1");
		rs = stm.executeQuery();

		while(rs.next()) {
			System.out.printf("%s %s %s\n",rs.getString(2), rs.getString(3), rs.getString(4));
			System.out.printf("%s %s %s\n",rs.getString(5), rs.getString(6), rs.getString(7));
			System.out.printf("%s %s %s\n",rs.getString(8), rs.getString(9), rs.getString(10));
			System.out.println();
		}
		conn.close();

	}
	@Override
	public void up() throws Exception {
		connection = new GetConnection ();
		conn = connection.getConnection();

		matrixEight = new MatrixEightEntity();

		Integer newMatrix[] = new Integer[9]; 

		newMatrix = returnMatrix(stm, rs);
		newMatrix = matrixEight.definition(newMatrix, 8);
		matrixDataBase(newMatrix, stm, conn);;

		conn.close();
		show();
	}

	@Override
	public void down() throws Exception {
		connection = new GetConnection ();
		conn = connection.getConnection();
		matrixEight = new MatrixEightEntity();
		Integer newMatrix[] = new Integer[9];

		newMatrix = returnMatrix(stm, rs);
		newMatrix = matrixEight.definition(newMatrix, 2);
		matrixDataBase(newMatrix, stm, conn);;;

		conn.close();
		show();
	}

	@Override
	public void left() throws Exception {
		connection = new GetConnection ();
		conn = connection.getConnection();
		matrixEight = new MatrixEightEntity();
		Integer newMatrix[] = new Integer[9]; 

		newMatrix = returnMatrix(stm, rs);
		newMatrix = matrixEight.definition(newMatrix, 4);
		matrixDataBase(newMatrix, stm, conn);;;

		conn.close();
		show();
	}

	@Override
	public void right() throws Exception {
		connection = new GetConnection ();
		conn = connection.getConnection();
		matrixEight = new MatrixEightEntity();
		Integer newMatrix[] = new Integer[9];

		newMatrix = returnMatrix(stm, rs);
		newMatrix = matrixEight.definition(newMatrix, 6);
		matrixDataBase(newMatrix, stm, conn);

		conn.close();
		show();
	}

	@Override
	public void clear() throws Exception {
		connection = new GetConnection();
		conn = connection.getConnection();

		stm = conn.prepareStatement("TRUNCATE TABLE matrixEight");
		stm.executeUpdate();
		conn.close();
	}
	@Override
	public Boolean returnWin() {
		return this.isWin;
	}
	@Override
	public String getKeyChar(Integer code) throws Exception {
		MatrixEightImp matrixEight = new MatrixEightImp();
		ScoreInterf score = new ScoreImp();
		String position = "";
		switch (code) {
		case KeyEvent.VK_UP:
			matrixEight.up();
			position = "↑";
			score.score().toString();
			
			break;
		case KeyEvent.VK_DOWN:
			matrixEight.down();
			score.score().toString();
			position = "↓";
			break;
			
		case KeyEvent.VK_LEFT:
			matrixEight.left();
			score.score().toString();
			position = "←";
			break;
			
		case KeyEvent.VK_RIGHT:
			matrixEight.right();
			score.score().toString();
			position = "→";
			break;
		}
		return position;
	}
	public void setWin() {
		this.isWin = true;
	}
	private Integer[] returnMatrix(PreparedStatement stm, ResultSet rs) throws SQLException {
		stm = conn.prepareStatement("SELECT * FROM matrixEight ORDER BY idmatrix DESC LIMIT 1");
		rs = stm.executeQuery();

		//copy matrix database
		final Integer newMatrix[] = new Integer[9]; 

		while(rs.next()) {
			newMatrix[0] = (rs.getInt(2));
			newMatrix[1] = (rs.getInt(3));
			newMatrix[2] = (rs.getInt(4));
			newMatrix[3] = (rs.getInt(5));
			newMatrix[4] = (rs.getInt(6));
			newMatrix[5] = (rs.getInt(7));
			newMatrix[6] = (rs.getInt(8));
			newMatrix[7] = (rs.getInt(9));
			newMatrix[8] = (rs.getInt(10));
		}
		return newMatrix;

	}
	private void matrixDataBase(Integer[] newMatrix, PreparedStatement stm, Connection conn) throws SQLException {
		//set database new matrix
		final Array arrayNewMatrix = conn.createArrayOf("INTEGER", newMatrix);
		stm = conn.prepareStatement("SELECT insertmatrix(?)");
		stm.setArray(1, arrayNewMatrix);
		stm.executeQuery();
	}

}
