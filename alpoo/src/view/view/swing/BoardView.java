package view.swing;

import java.awt.Color;
import java.awt.Font;

import javax.swing.BorderFactory;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;

import board.Board;

public class BoardView extends JFrame{

	private static final long serialVersionUID = 1L;
	private JFrame frame;
	private Board board;
	
	public BoardView(JFrame frame, Board board) {
		this.frame = frame;
		this.board = board;
	}

	public void paint() {
		for (Integer[] i : board.getCurrentBoard()) {
			for (int j : i) {
				JLabel block = new JLabel(Integer.toString(j));
				if (j == 0) block.setBorder(BorderFactory.createLineBorder(Color.GRAY, 999));
				block.setHorizontalAlignment(SwingConstants.CENTER);
				block.setFont(new Font("FreeMono", Font.BOLD, 24));
				frame.getContentPane().add(block);
			}
		}
		
	}
}
