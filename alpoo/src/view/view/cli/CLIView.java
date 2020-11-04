package view.cli;

import java.util.ArrayList;
import java.util.Scanner;

import board.Board;
import board.BoardController;
import controllers.GameController;
import controllers.LeaderboardController;
import controllers.MovementController;
import model.Game;
import model.LeaderboardEntry;
import model.Movement;

public class CLIView {
	private Board board = new Board();
	private BoardController control = new BoardController(board);
	private Integer moveCount = 0;
	Game game = new Game();
	GameController gameService = new GameController();
	MovementController movementService = new MovementController();
	private LeaderboardController lbService = new LeaderboardController(); 
	Scanner scan = new Scanner(System.in);	
	private Boolean playing = false;
	
	public static void main(String[] args) {

		new CLIView();
	}
	
	public CLIView() {
		
		System.out.println("Eight Puzzle\nHow to play:");
		System.out.println("Use the following inputs to move the white block:\nW - UP\nS - DOWN\nA - LEFT\nD - RIGHT\n");
		board.showBoard();
		System.out.println(String.format("New game (N)\tGame ID: #%d\tMove count: %d\tLeaderboard (L)\tReplay (R)", game.getGameID(), moveCount));
		getInput();
		while(!control.checkGoal() && playing) {
			getInput();
			System.out.println(String.format("Game ID: #%d\tMove count: %d\tLeaderboard (L)", game.getGameID(), moveCount));
		}
		if (playing) {
			System.out.println("VICTORY!\nEnter your name to submit your score:");
			String userInput = scan.next();
			lbService.insert((new LeaderboardEntry(game.getGameID(), moveCount, userInput)));			
		}
		
	}
	
	public void getInput() {
		String userInput = scan.next().toUpperCase();
		switch (userInput) {
		case "L":
			System.out.println("Top 10 games:");
			
			ArrayList<LeaderboardEntry> lbEntries = lbService.getBest10();
			for (int i = 0; i < lbEntries.size(); i++) {
				LeaderboardEntry entry = lbEntries.get(i);
				System.out.println("Place: " + (i + 1) + ", "  + entry.toString());
			}
			break;
		case "R":
			System.out.println("Enter game id to view the replay:");
			Integer gameId = scan.nextInt();
			replay(gameId);
			break;
		case "N":
			game.setStartSequence(board.getSequence());
			gameService.insert(game);
			playing = true;
			break;

		default:
			control.move(userInput, playing, game.getGameID());
			break;
		}
		if (!userInput.contentEquals("L") && !userInput.contentEquals("R")) {
			moveCount++; 
			board.showBoard();
		}
	}
	public void replay(Integer gameId) {
		Game replayGame = gameService.getById(gameId);
		game.setGameID(replayGame.getGameID());
		game.setStartSequence(replayGame.getStartSequence());
		ArrayList<Movement> moves = movementService.getAllByGameId(gameId);
		board.setBoardBySequence(game.getStartSequence());
		System.out.println("Replay board:");
		board.showBoard();
		for (Movement m: moves) {
			control.move(m.getMovement(), playing, game.getGameID());
			System.out.println(m.getMovement());
			board.showBoard();
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		System.out.println(String.format("Game ID: #%d\tMove count: %d", game.getGameID(), moves.size()));
		System.out.println("Replay finished!");

	}
}
