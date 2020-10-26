package br.ies.aula.alpoo.jogo.parimpar.dao.implementacao;

import java.sql.PreparedStatement;
import java.sql.SQLException;

import br.ies.aula.alpoo.jogo.parimpar.banco.de.dados.BancoDeDadosParImpar;
import br.ies.aula.alpoo.jogo.parimpar.dao.VencedorDao;
import br.ies.aula.alpoo.jogo.parimpar.entidade.Vencedor;

public class VencedorDaoJdbc implements VencedorDao {
	
	private static final String SQL_INSERT = "INSERT INTO vencedor (jogador_id, horario) VALUES(?, ?);";

	
	public void inserir(Vencedor vencedor) {
		try {
			PreparedStatement statement = BancoDeDadosParImpar.obterConnection().prepareStatement(SQL_INSERT);
			statement.setLong(1, vencedor.getAposta().getId());
			statement.setTimestamp(2, vencedor.getHorario());
			
			statement.executeUpdate();
			
			statement.close();
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}
