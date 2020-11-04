package view;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Font;
import javax.swing.JDesktopPane;
import javax.swing.text.DefaultStyledDocument;
import javax.swing.text.Style;
import javax.swing.text.StyleConstants;
import javax.swing.text.StyleContext;
import javax.swing.text.StyledDocument;

import main.interfaceImp.MatrixEightImp;
import main.interfaceImp.ScoreImp;
import main.interfaceview.MatrixEightInterf;
import main.interfaceview.ScoreInterf;

import java.awt.Color;
import java.awt.Component;
import java.awt.ComponentOrientation;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JButton;
import java.awt.Point;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.UIManager;
import java.awt.Dimension;
import javax.swing.JTextField;
import javax.swing.JTextPane;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class GameScreen extends PlayInterface {

	private JPanel contentPane;
	private JFrame frmAsas2;
	private JTextField gameDisplay;
	private MatrixEightInterf matrixEight;
	private ScoreInterf score;
	private JTextField displayPosition;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					GameScreen frame = new GameScreen();
					frame.frmAsas2.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public GameScreen() throws Exception {
		frmAsas2 = new JFrame();
		frmAsas2.setResizable(false);
		frmAsas2.setFont(new Font("Liberation Sans", Font.BOLD, 14));
		frmAsas2.setTitle("Game 8 Puzzle");
		frmAsas2.setBounds(100, 100, 585, 387);
		contentPane = new JPanel();
		contentPane.setLocation(new Point(500, 250));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		frmAsas2.setContentPane(contentPane);
		matrixEight = new MatrixEightImp();
		score = new ScoreImp();


		JDesktopPane desktopPane = new JDesktopPane();
		desktopPane.setAlignmentY(Component.TOP_ALIGNMENT);
		desktopPane.setAlignmentX(Component.LEFT_ALIGNMENT);
		desktopPane.setBackground(Color.BLACK);
		contentPane.add(desktopPane, BorderLayout.CENTER);

		gameDisplay = new JTextField();
		gameDisplay.setFont(new Font("Liberation Sans", Font.BOLD, 12));
		gameDisplay.setBounds(439, 12, 117, 19);
		gameDisplay.setColumns(10);
		gameDisplay.setComponentOrientation(ComponentOrientation.RIGHT_TO_LEFT);
		gameDisplay.setText("Current Score: 1");
		desktopPane.add(gameDisplay);

		JTextPane a11 = new JTextPane(stylee());
		setJTextPane(a11, desktopPane, "a11", 12, 12, 130, 101);

		JTextPane a12 = new JTextPane(stylee());
		setJTextPane(a12, desktopPane, "a12", 144, 12, 130, 101);

		JTextPane a13 = new JTextPane(stylee());
		setJTextPane(a13, desktopPane, "a13", 276, 12, 130, 101);

		JTextPane a21 = new JTextPane(stylee());
		setJTextPane(a21, desktopPane, "a21", 12, 115, 130, 101);

		JTextPane a22 = new JTextPane(stylee());
		setJTextPane(a22, desktopPane, "a22", 144, 115, 130, 101);

		JTextPane a23 = new JTextPane(stylee());
		setJTextPane(a23, desktopPane, "a23", 276,115, 130, 101);

		JTextPane a31 = new JTextPane(stylee());
		setJTextPane(a31, desktopPane, "a31", 12, 218, 130, 101);

		JTextPane a32 = new JTextPane(stylee());
		setJTextPane(a32, desktopPane, "a32", 144, 218, 130, 101);

		JTextPane a33 = new JTextPane(stylee());
		setJTextPane(a33, desktopPane, "a33", 276, 218, 130, 101);

		frmAsas2.addKeyListener(new KeyAdapter() {
			public void keyPressed(KeyEvent e) {
				matrixEight = new MatrixEightImp();

				try {
					String position;
					position = matrixEight.getKeyChar(e.getKeyCode());
					setMatrixDisplay(a11, a12, a13, a21, a22, a23, a31, a32, a33);
					setJTextPaneFalse(a11, a12, a13, a21, a22, a23, a31, a32, a33);
					gameDisplay.setText("Current Score: " + score.currentScore().toString());
					e.getKeyChar();
					displayPosition.setText(position);
				} catch (Exception e1) {
					e1.printStackTrace();
				}
			}
		});
		
		JButton btnReturn = new JButton("Return");
		btnReturn.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				contentPane.setVisible(false);
				frmAsas2.setVisible(false);
				open();
			}
		});
		btnReturn.setBounds(439, 307, 115, 25);
		desktopPane.add(btnReturn);

		JButton btnUp = new JButton("up");
		btnUp.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				try {
					matrixEight.up();
					setMatrixDisplay(a11, a12, a13, a21, a22, a23, a31, a32, a33);
					setJTextPaneFalse(a11, a12, a13, a21, a22, a23, a31, a32, a33);
					score = new ScoreImp();
					gameDisplay.setText("Current Score: " + score.currentScore().toString());
				} catch (Exception e1) {
					e1.printStackTrace();
				}
			}
		});

		btnUp.setPreferredSize(new Dimension(50, 25));
		btnUp.setBorder(UIManager.getBorder("ToggleButton.border"));
		btnUp.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		btnUp.setBounds(439, 122, 115, 25);
		desktopPane.add(btnUp);

		JButton btnLeft = new JButton("left");
		btnLeft.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				try {
					matrixEight.left();
					setMatrixDisplay(a11, a12, a13, a21, a22, a23, a31, a32, a33);
					setJTextPaneFalse(a11, a12, a13, a21, a22, a23, a31, a32, a33);
					score = new ScoreImp();
					gameDisplay.setText("Current Score: " + score.currentScore().toString());
				} catch (Exception e1) {
					e1.printStackTrace();
				}
			}
		});
		btnLeft.setBounds(439, 199, 115, 25);
		desktopPane.add(btnLeft);

		JButton btnRight = new JButton("right");
		btnRight.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				try {
					matrixEight.right();
					setMatrixDisplay(a11, a12, a13, a21, a22, a23, a31, a32, a33);
					setJTextPaneFalse(a11, a12, a13, a21, a22, a23, a31, a32, a33);
					gameDisplay.setText("Current Score: " + score.currentScore().toString());
				} catch (Exception e1) {
					e1.printStackTrace();
				}
			}
		});
		btnRight.setBounds(439, 148, 115, 25);
		desktopPane.add(btnRight);

		JButton btnDown = new JButton("down");
		btnDown.setSize(115, 25);
		btnDown.setLocation(439, 150);

		btnDown.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				try {
					matrixEight.down();
					setMatrixDisplay(a11, a12, a13, a21, a22, a23, a31, a32, a33);
					setJTextPaneFalse(a11, a12, a13, a21, a22, a23, a31, a32, a33);
					gameDisplay.setText("Current Score: " + score.currentScore().toString());
					
				} catch (Exception e1) {
					e1.printStackTrace();
				}
			}
		});
		btnDown.setBounds(439, 174, 115, 25);
		desktopPane.add(btnDown);
		
		displayPosition = new JTextField();
		displayPosition.setBorder(null);
		displayPosition.setComponentOrientation(ComponentOrientation.RIGHT_TO_LEFT);
		displayPosition.setForeground(Color.WHITE);
		displayPosition.setCaretColor(Color.BLACK);
		displayPosition.setSelectedTextColor(Color.BLACK);
		displayPosition.setBackground(Color.BLACK);
		displayPosition.setFont(new Font("Liberation Sans", Font.BOLD, 40));
		displayPosition.setColumns(10);
		displayPosition.setBounds(439, 43, 117, 46);
		desktopPane.add(displayPosition);

	}
	private void setMatrixDisplay(JTextPane a11, JTextPane a12, JTextPane a13, JTextPane a21, JTextPane a22, JTextPane a23, JTextPane a31, JTextPane a32, JTextPane a33) throws Exception {
		a11.setText(matrixEight.show("a11"));
		a12.setText(matrixEight.show("a12"));
		a13.setText(matrixEight.show("a13"));
		a21.setText(matrixEight.show("a21"));
		a22.setText(matrixEight.show("a22"));
		a23.setText(matrixEight.show("a23"));
		a31.setText(matrixEight.show("a31"));
		a32.setText(matrixEight.show("a32"));
		a33.setText(matrixEight.show("a33"));
	}

	private StyledDocument stylee() {
		StyleContext context = new StyleContext();
		StyledDocument document = new DefaultStyledDocument(context);
		Style style = context.getStyle(StyleContext.DEFAULT_STYLE);
		StyleConstants.setAlignment(style, StyleConstants.ALIGN_CENTER);
		return document;
	}

	private void setJTextPane(JTextPane aij, JDesktopPane desktopPane, String rowColumn, int x, int y, int width, int height) throws Exception {

		aij.setText(matrixEight.show(rowColumn));
		aij.setFont(new Font("Liberation Sans", Font.BOLD, 50));
		aij.setBounds(x, y, width, height);
		desktopPane.add(aij);
	}
	private void setJTextPaneFalse(JTextPane a11, JTextPane a12, JTextPane a13, JTextPane a21, JTextPane a22, JTextPane a23, JTextPane a31, JTextPane a32, JTextPane a33) throws Exception {
		if(matrixEight.returnWin()) {

			a11.setEnabled(false);
			a12.setEnabled(false);
			a13.setEnabled(false);
			a21.setEnabled(false);
			a22.setEnabled(false);
			a23.setEnabled(false);
			a31.setEnabled(false);
			a32.setEnabled(false);
			a33.setEnabled(false);

			setPopUP();
		}
	}
	private void setPopUP() throws Exception {
		JFrame popUp = new JFrame();
		matrixEight.clear();

		JOptionPane.showInputDialog(popUp, "Your Score: " + score.score(), null);

		contentPane.setVisible(false);
		frmAsas2.setVisible(false);
		popUp.setVisible(false);
		setDisplay("Congratulations!");
		open();
	}
}
