package view;

import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.BorderLayout;
import javax.swing.SwingConstants;

import main.interfaceImp.MatrixEightImp;
import main.interfaceImp.ScoreImp;
import main.interfaceview.MatrixEightInterf;
import main.interfaceview.ScoreInterf;

import java.awt.Window.Type;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JTextField;
import java.awt.Font;

import javax.swing.JButton;
import java.awt.Color;
import javax.swing.JDesktopPane;

public class PlayInterface {
	private JFrame frmAsas;
	private JTextField display;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					PlayInterface window = new PlayInterface();
					window.frmAsas.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */

	public PlayInterface() {
		initialize();
	}

	//	setVisible
	public void open() {
		frmAsas.setVisible(true);
	}
	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmAsas = new JFrame();
		frmAsas.getContentPane().setBackground(Color.RED);
		frmAsas.setFont(new Font("Liberation Sans", Font.PLAIN, 20));
		frmAsas.setForeground(Color.WHITE);
		frmAsas.setBackground(Color.LIGHT_GRAY);
		frmAsas.setType(Type.UTILITY);
		frmAsas.setTitle("Game 8 Puzzle");
		frmAsas.setBounds(200, 200, 369, 247);

		//		desktop
		JDesktopPane desktopPane = new JDesktopPane();
		desktopPane.addMouseListener(new MouseAdapter() {
		});
		desktopPane.setBackground(Color.BLACK);
		desktopPane.setFont(new Font("Liberation Sans", Font.BOLD, 14));
		frmAsas.getContentPane().add(desktopPane, BorderLayout.CENTER);

		//		JTextField	
		display = new JTextField();
		display.setText("Welcome!");
		display.setHorizontalAlignment(SwingConstants.CENTER);
		display.setFont(new Font("Liberation Sans", Font.PLAIN, 19));
		display.setBounds(27, 12, 300, 47);
		desktopPane.add(display);
		display.setColumns(10);

		//		JbuttonPlay
		JButton btnPlay = new JButton("Play");
		btnPlay.addMouseListener(new MouseAdapter() {
			private MatrixEightInterf matrix = new MatrixEightImp();
			@Override
			public void mouseClicked(MouseEvent e) {
				GameScreen.main(null);
				frmAsas.setVisible(false);
				try {
					matrix.play();
				} catch (Exception e1) {
					e1.printStackTrace();
				}
			}
		});
		btnPlay.setBounds(27, 103, 300, 25);
		desktopPane.add(btnPlay);


		//		JbuttonScore
		JButton btnScore = new JButton("Score");
		btnScore.addMouseListener(new MouseAdapter() {
			private ScoreInterf score = new ScoreImp();
			private Integer getScore = 0;
			@Override
			public void mouseClicked(MouseEvent e) {
				try {
					getScore = score.score();
					display.setText("Best Score: " + getScore.toString());
				} catch (Exception e2) {
					System.out.println(e2.getMessage());
				}
			}
		});
		btnScore.setBounds(27, 133, 300, 25);
		desktopPane.add(btnScore);

//		button exit
		JButton btnExit = new JButton("Exit");
		btnExit.addMouseListener(new MouseAdapter() {
			MatrixEightInterf matrixEight = new MatrixEightImp();
			@Override
			public void mouseClicked(MouseEvent e) {
				try {
					matrixEight.clear();
					System.exit(0);
				} catch (Exception e1) {
					e1.printStackTrace();
				}
			}
		});
		btnExit.setBounds(27, 163, 300, 25);
		desktopPane.add(btnExit);
	}
	protected void setDisplay(String string) {
		display.setText(string);
	}
}
