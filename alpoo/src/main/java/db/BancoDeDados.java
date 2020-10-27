package db;

import tabuleiro.Tabuleiro;
import tabuleiro.TabuleiroController;

public interface BancoDeDados {
	
	public void insereNoBanco(Tabuleiro tab);
	
	public void atualizaOBanco(TabuleiroController tab);

}
