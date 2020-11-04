package view.swing;

import javax.swing.BorderFactory;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;
import javax.swing.Timer;

import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;

import board.Board;
import board.BoardController;
import controllers.GameController;
import controllers.MovementController;
import model.Game;
import model.LeaderboardEntry;
import model.Movement;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.ArrayList;


public class SwingView {

	private JFrame frame = new JFrame();
	private Board board = new Board();
	private BoardController control = new BoardController(board);
	BoardView boardView = new BoardView(frame, board);
	InformationView infoView = new InformationView(frame);
	Game game = new Game();
	GameController gameService = new GameController();
	MovementController movementService = new MovementController();
	Boolean playing = false;
	
	public static void main(String[] args) {
		new SwingView();
	}

	public SwingView() {
		frame.addKeyListener(new KeyAdapter() {
			@Override
			public void keyReleased(KeyEvent e) {
//				37 Left
//				39 Right
//				38 Up
//				40 Down
				if (!playing) return;
				control.move(e.getKeyText(e.getKeyCode()).toUpperCase(), playing, game.getGameID());
				repaint();
				if (control.checkGoal()) {
					new WinView(new LeaderboardEntry(game.getGameID(), infoView.getMoveCount()));
				}
			}
		});
		frame.setSize(500, 300);
		frame.getContentPane().setLayout(new GridLayout(0, 3, 0, 0));	
		
		repaint();
		JLabel playBtn = new JLabel("New game");
		playBtn.setHorizontalAlignment(SwingConstants.CENTER);
		playBtn.setFont(new Font("FreeMono", Font.BOLD, 15));
		playBtn.setBorder(BorderFactory.createLineBorder(Color.BLACK, 2));
		playBtn.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				game.setStartSequence(board.getSequence());
				gameService.insert(game);
				infoView.setGameId(game.getGameID());
				playing = true;
				repaint();
			}
		});
		frame.getContentPane().add(playBtn);
		frame.getContentPane().add(new JLabel());
		JLabel replayBtn = new JLabel("Replay game");
		replayBtn.setHorizontalAlignment(SwingConstants.CENTER);
		replayBtn.setFont(new Font("FreeMono", Font.BOLD, 15));
		replayBtn.setBorder(BorderFactory.createLineBorder(Color.BLACK, 2));
		replayBtn.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				try {
					Integer gameId = Integer.valueOf(JOptionPane.showInputDialog("Enter game id"));
					replayGame(gameId);
					
				} catch (NumberFormatException e) {
					JOptionPane.showMessageDialog(frame, "Please enter a valid game id");
				}
			}
		});
		frame.getContentPane().add(replayBtn);

		frame.setLocationRelativeTo(null);
		frame.setTitle("Eight Puzzle - APS");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}
	private void repaint() {
		frame.getContentPane().removeAll();				
		boardView.paint();
		infoView.paint();
		
		frame.setVisible(true);

	}
	
	private void replayGame(Integer gameId) {
		Game replayGame = gameService.getById(gameId);
		game.setGameID(replayGame.getGameID());
		game.setStartSequence(replayGame.getStartSequence());
		infoView.setGameId(game.getGameID());
		ArrayList<Movement> moves = movementService.getAllByGameId(gameId);
		board.setBoardBySequence(game.getStartSequence());
		board.showBoard();
		repaint();
		final Timer t = new Timer(500,null);
		t.addActionListener(new ActionListener(){
		     int aux = 0;
		     public void actionPerformed(ActionEvent e){
		    	 Movement m = moves.get(aux);
		    	 System.out.println(m.getMovement());
					control.move(m.getMovement(), playing, game.getGameID());
					board.showBoard();
					repaint();
		         if(aux >= moves.size() - 1){t.stop();}
		         aux++;
		     }
		});
		t.setRepeats(true);
		t.start();

	}

}
