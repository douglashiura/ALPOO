package test.eightpuzzle;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import board.Board;
import board.BoardController;

public class TestGame {
	private Board board;
	private BoardController control;
	
	@Before
	public void setup() {
		board = new Board();
		control = new BoardController(board);
	}
	
	@Test
	public void shuffleTest() throws Exception {
		assertNotEquals(board.getGoal(), board.getCurrentBoard());
	}
	
	@Test
	public void moveUpTest() throws Exception {
		// 1 2 3
		// 4 5 6
		// 7 8 0
		Integer[][] startBoard = {{1, 2, 3}, {4, 5, 6}, {7, 8, 0}};
		Integer[][] movedBoard = {{1, 2, 3}, {4, 5, 0}, {7, 8, 6}};
		board.setBoard(startBoard);
		control.moveUp();
		assertArrayEquals(movedBoard, board.getCurrentBoard());
	}
	
	@Test
	public void moveDownTest() throws Exception {
		// 1 2 3
		// 4 5 0
		// 7 8 6
		Integer[][] startBoard = {{1, 2, 3}, {4, 5, 0}, {7, 8, 6}};
		Integer[][] movedBoard = {{1, 2, 3}, {4, 5, 6}, {7, 8, 0}};
		board.setBoard(startBoard);
		control.moveDown();
		assertArrayEquals(movedBoard, board.getCurrentBoard());
	}
	
	@Test
	public void moveLeftTest() throws Exception {
		// 1 2 3
		// 4 5 6
		// 7 8 0
		Integer[][] startBoard = {{1, 2, 3}, {4, 5, 6}, {7, 8, 0}};
		Integer[][] movedBoard = {{1, 2, 3}, {4, 5, 6}, {7, 0, 8}};
		board.setBoard(startBoard);
		control.moveLeft();
		assertArrayEquals(movedBoard, board.getCurrentBoard());
	}
	
	@Test
	public void moveRightTest() throws Exception {
		// 1 2 3
		// 4 5 6
		// 7 0 8
		Integer[][] startBoard = {{1, 2, 3}, {4, 5, 6}, {7, 0, 8}};
		Integer[][] movedBoard = {{1, 2, 3}, {4, 5, 6}, {7, 8, 0}};
		board.setBoard(startBoard);
		control.moveRight();
		assertArrayEquals(movedBoard, board.getCurrentBoard());
	}
	
	@Test
	public void getBlankPositionTest() throws Exception {
		Integer[][] startBoard = {{1, 2, 3}, {4, 5, 6}, {7, 8, 0}};
		Integer[] blankPosition = {2, 2};
		board.setBoard(startBoard);
		assertArrayEquals(blankPosition, board.getBlankPosition());
	}
	
	@Test
	public void gameWinTest() throws Exception {
		Integer[][] startBoard = {{1, 2, 3}, {4, 5, 0}, {7, 8, 6}};
		board.setBoard(startBoard);
		assertEquals(Boolean.FALSE, control.checkGoal());
		control.moveDown();
		assertEquals(Boolean.TRUE, control.checkGoal());
	}
}
