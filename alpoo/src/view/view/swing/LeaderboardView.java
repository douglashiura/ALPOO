package view.swing;

import java.awt.BorderLayout;
import java.util.ArrayList;

import javax.swing.JFrame;

import javax.swing.JTable;

import controllers.LeaderboardController;
import model.LeaderboardEntry;

public class LeaderboardView {
	private JFrame frame = new JFrame();
	private LeaderboardController lbService = new LeaderboardController(); 
	
	public static void main(String[] args) {
		new LeaderboardView();
	}
	
	public LeaderboardView() {
		frame.setSize(900, 250);
		frame.setLocationRelativeTo(null);
		frame.setLayout(new BorderLayout());
		header();
		frame.setTitle("Leaderboard");
		frame.setVisible(true);
	}
	
	private void header() {
	
		String[] headers = {"#", "Moves", "Player Name", "Game ID"};
		
		ArrayList<LeaderboardEntry> lbEntries = lbService.getBest10();
		
		Object[][] data = new Object[10][4];
		
		for (int i = 0; i < lbEntries.size(); i++) {
			LeaderboardEntry entry = lbEntries.get(i);
			data[i][0] = i + 1;
			data[i][1] = entry.getMoves();
			data[i][2] = entry.getPlayerName();
			data[i][3] = entry.getGameID();
		}

		JTable table = new JTable(data, headers);
		
		table.setEnabled(false);
		frame.getContentPane().add(table.getTableHeader(), BorderLayout.PAGE_START);
		frame.getContentPane().add(table, BorderLayout.CENTER);
	}
		
}
