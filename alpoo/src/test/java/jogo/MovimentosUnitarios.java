package jogo;

import static org.junit.Assert.*;

import javax.swing.JFrame;

import org.junit.Test;

import entities.Tabuleiro;
import controller.TabuleiroController;
import view.TabuleiroView;

public class MovimentosUnitarios {
	@Test
	public void testName() throws Exception {
		TabuleiroController tab = new TabuleiroController(new Tabuleiro());
		tab.moveDireita();
		System.out.println(tab.getTabuleiro().toString());
	}
	
	@Test
	public void testaMovimentoCima() throws Exception {
		
		
	}
	
}
