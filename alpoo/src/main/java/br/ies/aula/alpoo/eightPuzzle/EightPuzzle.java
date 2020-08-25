package br.ies.aula.alpoo.eightPuzzle;

public class EightPuzzle {

	private int[][] currentBoard = new int[][] {{0, 5, 6}, {2, 8, 4}, {1, 7, 3}};
	private int[][] goal = new int[][] {{0, 1, 2}, {3, 4, 5}, {6, 7, 8}};
	private int currentLine = 0;
	private int currentCol = 0;

	
	public int[][] getCurrentBoard(){
		return currentBoard;
	}
	
	public int[][] getGoal(){
		return goal;
	}
	
	public void showBoard() {
		for (int[] i: getCurrentBoard()) {
			for (int j: i) {
				System.out.print(j + " ");
			}
			System.out.println();
		}
		System.out.println();

	}
	public void moveUp() {
		if (currentLine > 0) {
			int temp = currentBoard[currentLine-1][currentCol];
			currentBoard[currentLine][currentCol] = temp;
			currentBoard[currentLine-1][currentCol] = 0;
			currentLine--;
			showBoard();
		}
		
	}
	
	public void moveDown() {
		if (currentLine < 2) {
			int temp = currentBoard[currentLine+1][currentCol];
			currentBoard[currentLine][currentCol] = temp;
			currentBoard[currentLine+1][currentCol] = 0;
			currentLine++;
			showBoard();
		}
	}
	
	public void moveLeft() {
		if (currentCol > 0) {
			int temp = currentBoard[currentLine][currentCol-1];
			currentBoard[currentLine][currentCol] = temp;
			currentBoard[currentLine][currentCol-1] = 0;
			currentCol--;
			showBoard();
		}
	}
	
	public void moveRight() {
		if (currentCol < 2) {
			int temp = currentBoard[currentLine][currentCol+1];
			currentBoard[currentLine][currentCol] = temp;
			currentBoard[currentLine][currentCol+1] = 0;
			currentCol++;
			showBoard();
		}
	}
	
}
