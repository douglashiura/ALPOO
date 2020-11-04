package view.swing;

import java.awt.Font;
import java.awt.GridLayout;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;

import controllers.LeaderboardController;
import model.LeaderboardEntry;

import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class WinView {
	private JFrame frame = new JFrame();	

	public WinView(LeaderboardEntry entry) {
		frame.setSize(500, 150);
		frame.getContentPane().setLayout(new GridLayout(4, 0, 0, 0));
		
		JLabel congratsLbl = new JLabel("Congratulations you finished the puzzle!");
		congratsLbl.setHorizontalAlignment(SwingConstants.CENTER);
		congratsLbl.setFont(new Font("FreeMono", Font.BOLD, 15));
		frame.getContentPane().add(congratsLbl);
		
		JLabel enterNameLbl = new JLabel("Enter you name to submit your score!");
		enterNameLbl.setHorizontalAlignment(SwingConstants.CENTER);
		enterNameLbl.setFont(new Font("FreeMono", Font.BOLD, 15));
		frame.getContentPane().add(enterNameLbl);
		
		JTextField playerName = new JTextField();
		playerName.setHorizontalAlignment(SwingConstants.CENTER);
		playerName.setFont(new Font("FreeMono", Font.BOLD, 15));
		playerName.setColumns(10);
		frame.getContentPane().add(playerName);
		
		JButton btnSubmit = new JButton("Submit");
		btnSubmit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				entry.setPlayerName(playerName.getText());
				new LeaderboardController().insert(entry);
				frame.dispose();
			}
		});
		btnSubmit.setFont(new Font("FreeMono", Font.BOLD, 15));
		btnSubmit.setBackground(Color.LIGHT_GRAY);
		frame.getContentPane().add(btnSubmit);
		
		
		
		
		frame.setLocationRelativeTo(null);

		
		frame.setTitle("You Win!");
		frame.setVisible(true);

	}
}
