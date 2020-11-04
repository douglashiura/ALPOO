package dao;

import java.util.ArrayList;

import entities.Tabuleiro;

public interface TabuleiroDao {
	
	public void criaTabuleiro () throws Exception;
	
	public ArrayList<String> pegaTabuleiro (int id) throws Exception;
	
	public void removeTabuleiro () throws Exception;
	
	public boolean atualizaTabuleiro (String casaOrigem, String casaDestino) throws Exception;
	
}
