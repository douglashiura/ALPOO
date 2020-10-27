package main.interfaceImp;

import java.sql.Array;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;


import main.entity.matrixEightEntity;
import main.getconnection.GetConnection;
import main.interfaceview.matrixEightInterf;

public class MatrixEightImp implements matrixEightInterf {

	private PreparedStatement stm;
	private ResultSet rs;
	private GetConnection connection;
	private Connection conn;

	@Override
	public void play() throws Exception {
		connection = new GetConnection();
		conn = connection.getConnection();

		matrixEightEntity getPlays = new matrixEightEntity();

		List<Integer> numbers = new ArrayList<Integer>();
		numbers = getPlays.getNumbers();

		stm = conn.prepareStatement("INSERT INTO matrixEight VALUES (nextval('idMatrixseq'), ?,?,?,?,?,?,?,?,?)");
		stm.setInt(1, numbers.get(0));
		stm.setInt(2, numbers.get(1));
		stm.setInt(3, numbers.get(2));
		stm.setInt(4, numbers.get(3));
		stm.setInt(5, numbers.get(4));
		stm.setInt(6, numbers.get(5));
		stm.setInt(7, numbers.get(6));
		stm.setInt(8, numbers.get(7));
		stm.setInt(9, numbers.get(8));

		stm.executeUpdate();

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
		}
	}

	@Override
	public void up() throws Exception {

		connection = new GetConnection ();
		conn = connection.getConnection();

		stm = conn.prepareStatement("SELECT * FROM matrixEight ORDER BY idmatrix DESC LIMIT 1");
		rs = stm.executeQuery();

		//copy matrix database
		Integer newMatrix[] = new Integer[9]; 

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

		//looking for position
		int position = 0;

		for (int i = 0; i<9; i++) {
			if(newMatrix[i] == 0) {
				position = i;
			}
		}

		//modify matrix
		for (int i = 0; i<9; i++) {
			if(position == i) {
				if(i>=0 && i<=2) {
					System.out.println("Movement do not allowed");
				}
				else {
					newMatrix[i] = newMatrix[i-3];
					newMatrix[i-3] = 0;
				}
			}
		}

		//set database new matrix
		Array arrayNewMatrix = conn.createArrayOf("INTEGER", newMatrix);
		stm = conn.prepareStatement("SELECT insertmatrix(?)");
		stm.setArray(1, arrayNewMatrix);
		stm.executeQuery();

		show();
	}

	@Override
	public void down() throws Exception {
		connection = new GetConnection ();
		conn = connection.getConnection();

		stm = conn.prepareStatement("SELECT * FROM matrixEight ORDER BY idmatrix DESC LIMIT 1");
		rs = stm.executeQuery();

		//copy matrix database
		Integer newMatrix[] = new Integer[9]; 

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

		//looking for position
		int position = 0;

		for (int i = 0; i<9; i++) {
			if(newMatrix[i] == 0) {
				position = i;
			}
		}

		//modify matrix
		for (int i = 0; i<9; i++) {
			if(position == i) {
				if(i>=6 && i<=8) {
					System.out.println("Movement do not allowed");
				}
				else {
					newMatrix[i] = newMatrix[i+3];
					newMatrix[i+3] = 0;
				}
			}
		}

		//set database new matrix
		Array arrayNewMatrix = conn.createArrayOf("INTEGER", newMatrix);
		stm = conn.prepareStatement("SELECT insertmatrix(?)");
		stm.setArray(1, arrayNewMatrix);
		stm.executeQuery();

		show();
	}

	@Override
	public void left() throws Exception {
		connection = new GetConnection ();
		conn = connection.getConnection();

		stm = conn.prepareStatement("SELECT * FROM matrixEight ORDER BY idmatrix DESC LIMIT 1");
		rs = stm.executeQuery();

		//copy matrix database
		Integer newMatrix[] = new Integer[9]; 

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

		//looking for position
		int position = 0;

		for (int i = 0; i<9; i++) {
			if(newMatrix[i] == 0) {
				position = i;
			}
		}

		//modify matrix
		for (int i = 0; i<9; i++) {
			if(position == i) {
				if(i == 0 || i == 3 || i == 6) {
					System.out.println("Movement do not allowed");

				}
				else {
					newMatrix[i] = newMatrix[i-1];
					newMatrix[i-1] = 0;
				}
			}
		}

		//set database new matrix
		Array arrayNewMatrix = conn.createArrayOf("INTEGER", newMatrix);
		stm = conn.prepareStatement("SELECT insertmatrix(?)");
		stm.setArray(1, arrayNewMatrix);
		stm.executeQuery();

		show();
	}

	@Override
	public void right() throws Exception {
		connection = new GetConnection ();
		conn = connection.getConnection();

		stm = conn.prepareStatement("SELECT * FROM matrixEight ORDER BY idmatrix DESC LIMIT 1");
		rs = stm.executeQuery();

		//copy matrix database
		Integer newMatrix[] = new Integer[9]; 

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

		//looking for position
		int position = 0;

		for (int i = 0; i<9; i++) {
			if(newMatrix[i] == 0) {
				position = i;
			}
		}

		//modify matrix
		for (int i = 0; i<9; i++) {
			if(position == i) {
				if(i == 2 || i == 5 || i == 8) {
					System.out.println("Movement do not allowed");

				}
				else {
					newMatrix[i] = newMatrix[i+1];
					newMatrix[i+1] = 0;
				}
			}
		}

		//set database new matrix
		Array arrayNewMatrix = conn.createArrayOf("INTEGER", newMatrix);
		stm = conn.prepareStatement("SELECT insertmatrix(?)");
		stm.setArray(1, arrayNewMatrix);
		stm.executeQuery();

		show();
	}

	@Override
	public void clear() throws Exception {
		connection = new GetConnection();
		conn = connection.getConnection();

		stm = conn.prepareStatement("TRUNCATE TABLE matrixEight");
		stm.executeUpdate();
	}

}
