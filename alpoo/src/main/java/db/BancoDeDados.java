package db;

import entities.Tabuleiro;
import controller.TabuleiroController;

public interface BancoDeDados {
	
	public void insereNoBanco(Tabuleiro tab);
	
	public void atualizaOBanco(TabuleiroController tab);

}
