package br.ies.alpoo.jogo.oito.visao;

import javax.swing.JLabel;
import javax.swing.JTable;

import br.ies.alpoo.jogo.oito.database.ControleDB;
import br.ies.aula.alpoo.jogo.oito.JogoOito;

public class Controles {
	private static String name;
	JogoOito jogoOito = new JogoOito();
	ControleDB controlSQL = new ControleDB();
	String id = String.valueOf(JogoOito.getTabuId());
	private static int jogadas = 0;
	
	public void setName(String newName){
		Controles.name = newName;
	}
	
	public String getName() {
		return Controles.name;
	}
	
	public String getNameSQL() {
		String nameInsert = "'" + getName() + "'";
		return nameInsert;
	}
	
	public String getJogadasString() {
		String jogadasString = "'" + String.valueOf(jogadas) + "'";
		return jogadasString;
	}
	
	public void refreshID() {
		id = String.valueOf(JogoOito.getTabuId());
	}
	
	public void insertToDBNamePlays() {
		refreshID();
		controlSQL.executarUpdate("INSERT INTO jogooitotable(nome, tabuleiro_id , nm_jogadas) VALUES (" + getNameSQL() + "," + id + "," + getJogadasString() + ")");
	}
	
	public void MoveUp(JTable table) {
		JogoOito.mover("UP");
		table.repaint();
		Controles.jogadas += 1;
	}
	
	public void MoveLeft(JTable table) {
		JogoOito.mover("LEFT");
		table.repaint();
		Controles.jogadas += 1;
	}
	
	public void MoveRight(JTable table) {
		JogoOito.mover("RIGHT");
		table.repaint();
		Controles.jogadas += 1;
	}
	
	public void MoveDown(JTable table) {
		JogoOito.mover("DOWN");
		table.repaint();
		Controles.jogadas += 1;
	}
	
	public int getJogadas() {
		return jogadas;
	}
	
	public static void setJogadas(int jogada) {
		jogadas = jogada;
	}
	
	public void refreshLabel(JLabel label) {
		label.setText("Jogadas = " + jogadas);
	}
	
}
