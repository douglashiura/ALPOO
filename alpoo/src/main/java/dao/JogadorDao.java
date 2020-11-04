package dao;

import java.util.ArrayList;

import entities.Jogador;

public interface JogadorDao {
	
	public void salvaJogador (Jogador tabuleiro);
	
	public ArrayList<String> pegaJogador (int id);
	
	public void removeJogador (int id);
	
}

