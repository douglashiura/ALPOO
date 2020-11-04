package view.swing;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.BorderFactory;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;

public class InformationView {
	
	private JFrame frame;
	private Integer moveCount = 0; 
	private Integer gameId = null;
	public InformationView(JFrame frame) {
		this.frame = frame;
	}
	
	public void paint() {
		JLabel movesLbl = new JLabel(String.format("Moves: %d", moveCount));
		movesLbl.setHorizontalAlignment(SwingConstants.CENTER);
		movesLbl.setFont(new Font("FreeMono", Font.BOLD, 15));
		frame.getContentPane().add(movesLbl);
		
		JLabel gameIdLbl = new JLabel(String.format("Game ID: #%d", gameId));
		gameIdLbl.setHorizontalAlignment(SwingConstants.CENTER);
		gameIdLbl.setFont(new Font("FreeMono", Font.BOLD, 15));
		frame.getContentPane().add(gameIdLbl);
		
		JLabel leaderboardBtn = new JLabel("Leaderboard");
		leaderboardBtn.setHorizontalAlignment(SwingConstants.CENTER);
		leaderboardBtn.setFont(new Font("FreeMono", Font.BOLD, 15));
		leaderboardBtn.setBorder(BorderFactory.createLineBorder(Color.BLACK, 2));
		leaderboardBtn.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				new LeaderboardView();
			}
		});
		frame.getContentPane().add(leaderboardBtn);
		
				
		moveCount++;
	}
	
	public Integer getMoveCount() {
		return moveCount;
	}
	
	public void setGameId(Integer id) {
		this.gameId = id;
	}
}
