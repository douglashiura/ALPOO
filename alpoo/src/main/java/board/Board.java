package board;

import java.util.Arrays;
import java.util.Random;

public class Board {
	private Integer[][] currentBoard = new Integer[][] {{1, 2, 3}, {4, 5, 6}, {7, 8, 0}};
	private Integer[][] goal = new Integer[][] {{1, 2, 3}, {4, 5, 6}, {7, 8, 0}};
	private Integer[] blankPosition;
	
	public Board() {
		shuffleBoard();
		
	}
	
	
	public Integer[][] getCurrentBoard(){
		return currentBoard;
	}
	
	public Integer[][] getGoal(){
		return goal;
	}
	
	public Integer[] getBlankPosition() {
		for (int i = 0; i < currentBoard.length; i++) {
			int index = Arrays.asList(currentBoard[i]).indexOf(0);
			if (index != -1) return new Integer[] {i, index};
		}
		return blankPosition;
	}
	
	public void setBlankPosition(Integer[] pos) {
		blankPosition = pos;
	}
	
	public void showBoard() {
		for (Integer[] i: getCurrentBoard()) {
			for (int j: i) {
				if (j != 0) {
					System.out.print(j + " ");
				}else {
					System.out.print("  ");
				}
			}
			System.out.println();
		}
		System.out.println();

	}
	
	public String getSequence() {
		String sequence = "";
		for (Integer[] i: currentBoard) {
			for (int j: i) {
				sequence += Integer.toString(j);
			}
		}
		return sequence;
	}
	
	public void setBoard(Integer[][] board) {
		this.currentBoard = board;
	}
	
	public void setBoardBySequence(String sequence) {
		int aux = 0;
		Integer[][] tempBoard = new Integer[3][3];
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				tempBoard[i][j] = Integer.valueOf(sequence.split("")[aux]);
				aux++;
			}
		}

	}
	
	private void shuffleBoard() {
		Random random = new Random();
	    for (int i = currentBoard.length - 1; i > 0; i--) {
	        for (int j = currentBoard[i].length - 1; j > 0; j--) {
	            int randLine = random.nextInt(i + 1);
	            int randCol = random.nextInt(j + 1);

	            int temp = currentBoard[i][j];
	            currentBoard[i][j] = currentBoard[randLine][randCol];
	            currentBoard[randLine][randCol] = temp;
	        }
	    }
	}

}
