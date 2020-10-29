import javax.swing.JFrame;

import tabuleiro.TabuleiroInterface;

public class Main {

	public static void main(String[] args) {
		TabuleiroInterface game = new TabuleiroInterface();
        game.setTitle("THE FIFTEEN PUZZLE");
        game.setVisible(true);
        game.setSize(400,400);
        game.scramble();
        game.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

}
