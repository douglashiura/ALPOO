package main;

import main.getconnection.GetConnection;
import main.interfaceImp.MatrixEightImp;
import main.interfaceImp.ScoreImp;
import main.interfaceview.matrixEightInterf;
import main.interfaceview.scoreInterf;

public class Main {
	public static void main(String[] args) throws Exception {
		try {
			GetConnection getconnection = new GetConnection();
			getconnection.getConnection();
			
//			scoreInterf score = new ScoreImp();
//			System.out.println(score.score());
			
			matrixEightInterf matrixEight = new MatrixEightImp();
			matrixEight.down();
			
		}
		catch(Exception e) {
			System.out.println(e.getMessage());
		}
	}
}
