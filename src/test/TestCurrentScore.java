package test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.Before;
import org.junit.Test;

import main.entity.MatrixEightEntity;
import main.getconnection.GetConnection;
import main.interfaceImp.MatrixEightImp;
import main.interfaceImp.ScoreImp;
import main.interfaceview.MatrixEightInterf;
import main.interfaceview.ScoreInterf;

public class TestCurrentScore {
	MatrixEightInterf matrix = new MatrixEightImp();
	MatrixEightEntity generatsMatrix = new MatrixEightEntity();
	ScoreInterf score = new ScoreImp();

	@Before
	public void setUp() throws Exception {
		GetConnection getconnection = new GetConnection();
		getconnection.getConnection();
		matrix.play();
	}
	
	@Test
	public void matrixReturns() throws Exception{
		Integer currentScore = 1;
		
		assertEquals(currentScore, score.currentScore());
		
	}
}
