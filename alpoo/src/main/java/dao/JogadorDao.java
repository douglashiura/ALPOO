package dao;

import entities.Jogador;

public interface JogadorDao {
	
	public void salvaJogador (Jogador tabuleiro) throws Exception ;
		
	public void removeJogador () throws Exception ;
	
	public String pegaNomeJogador () throws Exception ;

	
}

