package board;

import java.util.Arrays;

import board.Board;
import controllers.MovementController;
import model.Movement;

public class BoardController implements Movements {
	private Board board;
	private Integer[][] currentBoard;
	private Integer[] blankPosition;
	private MovementController movementService = new MovementController();
	
	public BoardController(Board board) {
		this.board = board;
		this.currentBoard = board.getCurrentBoard();
		this.blankPosition = board.getBlankPosition();
	}
	
	
	public void move(String movement, Boolean playing, Integer gameId) {
		switch (movement) {
		case "A":
		case "LEFT":
			moveLeft();
			break;
		case "W":
		case "UP":
			moveUp();
			break;
		case "D":
		case "RIGHT":
			moveRight();
			break;
		case "S":
		case "DOWN":
			moveDown();
			break;
		default:
			break;
		}
		if (playing) movementService.insert(new Movement(gameId, movement));
	}
	
	@Override
	public void moveUp() {
		this.currentBoard = board.getCurrentBoard();
		this.blankPosition = board.getBlankPosition();
		if (blankPosition[0] > 0) {
			int temp = currentBoard[blankPosition[0] - 1][blankPosition[1]];
			currentBoard[blankPosition[0]][blankPosition[1]] = temp;
			currentBoard[blankPosition[0] - 1][blankPosition[1]] = 0;
			blankPosition[0]--;
			board.setBlankPosition(blankPosition);
		}
		
	}
	
	@Override
	public void moveDown() {
		this.currentBoard = board.getCurrentBoard();
		this.blankPosition = board.getBlankPosition();
		if (blankPosition[0] < 2) {
			int temp = currentBoard[blankPosition[0] + 1][blankPosition[1]];
			currentBoard[blankPosition[0]][blankPosition[1]] = temp;
			currentBoard[blankPosition[0] + 1][blankPosition[1]] = 0;
			blankPosition[0]++;
			board.setBlankPosition(blankPosition);
		}
	}

	@Override
	public void moveLeft() {
		this.currentBoard = board.getCurrentBoard();
		this.blankPosition = board.getBlankPosition();
		if (blankPosition[1] > 0) {
			int temp = currentBoard[blankPosition[0]][blankPosition[1] - 1];
			currentBoard[blankPosition[0]][blankPosition[1]] = temp;
			currentBoard[blankPosition[0]][blankPosition[1] - 1] = 0;
			blankPosition[1]--;
			board.setBlankPosition(blankPosition);
		}
	}
	
	@Override
	public void moveRight() {
		this.currentBoard = board.getCurrentBoard();
		this.blankPosition = board.getBlankPosition();
		if (blankPosition[1] < 2) {
			int temp = currentBoard[blankPosition[0]][blankPosition[1]+1];
			currentBoard[blankPosition[0]][blankPosition[1]] = temp;
			currentBoard[blankPosition[0]][blankPosition[1]+1] = 0;
			blankPosition[1]++;
			board.setBlankPosition(blankPosition);
		}
	}
	
	public boolean checkGoal() {
		return Arrays.deepEquals(board.getGoal(), board.getCurrentBoard());
	}

}
