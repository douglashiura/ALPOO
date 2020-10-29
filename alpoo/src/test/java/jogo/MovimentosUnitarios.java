package jogo;

import static org.junit.Assert.*;

import javax.swing.JFrame;

import org.junit.Test;

import tabuleiro.Tabuleiro;
import tabuleiro.TabuleiroController;
import view.TabuleiroInterface;

public class MovimentosUnitarios {
	@Test
	public void testName() throws Exception {
		TabuleiroController tab = new TabuleiroController(new Tabuleiro());
		tab.moveDireita();
		System.out.println(tab.getTabuleiro().toString());
	}
	
	@Test
	public void testeInterface() throws Exception {
    	TabuleiroInterface game = new TabuleiroInterface();
        game.setTitle("THE FIFTEEN PUZZLE");
        game.setVisible(true);
        game.setSize(400,400);
        game.scramble();
        game.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}
