package br.ies.aula.alpoo.jogo.oito.modelo;

import java.sql.Connection;

import javax.swing.table.AbstractTableModel;

import br.ies.alpoo.jogo.oito.database.ConnectDB;
import br.ies.alpoo.jogo.oito.database.ControleDB;
import br.ies.alpoo.jogo.oito.visao.Controles;
import br.ies.aula.alpoo.jogo.oito.JogoOito;

public class ModeloTabuleiro extends AbstractTableModel {
	/**
	 * 
	 */
	ControleDB control = new ControleDB();
	Integer[][] thisRound;
	private static final long serialVersionUID = 1L;
	
	Connection cnn = ConnectDB.connect();

	@Override
	public int getRowCount() {
		return JogoOito.getTabuleiro().length;
	}

	@Override
	public int getColumnCount() {
		return JogoOito.getTabuleiro().length;
	}

	@Override
	public Object getValueAt(int rowIndex, int columnIndex) {
		return data[rowIndex][columnIndex];
	}
	
	private Integer[][] data = JogoOito.getTabuleiro();
	
	public Integer[][] obterTabuleiro(){
		return data;
	}
	
	public void refreshTable() {
		data = JogoOito.getTabuleiro();
	}
	
	public void rejogar(int randomNum) {
		Controles.setJogadas(0);
		JogoOito.setTabuleiroByID(randomNum);
		int x = 0,y = 0;
		
		for(int i=0 ; i<3;i++){
			for(int j=0 ; j<3; j++){
				if (JogoOito.getTabuleiro()[i][j] == 0) {
					x = j;
					y = i;
				}
			}
		}
		
		JogoOito.setColuna(x);
		JogoOito.setLinha(y);
		
		refreshTable();
	}
	
}
