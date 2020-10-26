package test.br.ies.aula.alpoo.parimpar.banco.de.dados;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import br.ies.aula.alpoo.jogo.parimpar.banco.de.dados.BancoDeDadosParImpar;

public class AjudanteBancoDeDados {
	
	private static final String SQL_DELETE_JOGADORES = "DELETE FROM aposta;";
	
	public AjudanteBancoDeDados() {
	}

	public static void limparTudo() {
		try (Connection connection = BancoDeDadosParImpar.obterConnection();) {
			PreparedStatement statement = connection.prepareStatement(SQL_DELETE_JOGADORES);
			statement.executeUpdate();
			statement.close();
			
		} catch (SQLException e) {
			e.printStackTrace();
		} 
	}
}
