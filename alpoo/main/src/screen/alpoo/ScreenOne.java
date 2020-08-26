package alpoo;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class ScreenOne {
	public static void main(String[] args) {
		JFrame screen = new JFrame();
		JLabel  labelFirst = new JLabel("Initial label");
		JTextField firstPlayerEntry = new JTextField();
				
		screen.setVisible(true);
		screen.setSize(400, 500);
		screen.setLayout(null);
		screen.setTitle("Class IES about Jframe");
		
		labelFirst.setSize(200, 20);
		labelFirst.setLocation(200, 3);
		
		firstPlayerEntry.setSize(200, 20);
		firstPlayerEntry.setLocation(210, 30);
		
		screen.add();
	}
}
