package jogo;

import static org.junit.Assert.*;

import org.junit.Test;

import tabuleiro.Tabuleiro;
import tabuleiro.TabuleiroController;

public class MovimentosUnitarios {
	@Test
	public void testName() throws Exception {
		TabuleiroController tab = new TabuleiroController(new Tabuleiro());
		tab.moveDireita();
		System.out.println(tab.getTabuleiro().toString());
	}

}
