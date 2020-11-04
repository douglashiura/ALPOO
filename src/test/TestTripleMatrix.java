package test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.Test;
import main.entity.MatrixEightEntity;

public class TestTripleMatrix {
	MatrixEightEntity matrix = new MatrixEightEntity();
	
	@Test
	public void compareMatrixReturn() {
	int compareMatrix = 9;

		
		assertEquals(compareMatrix, matrix.getNumbers().size());
	}
	
	
	
}
