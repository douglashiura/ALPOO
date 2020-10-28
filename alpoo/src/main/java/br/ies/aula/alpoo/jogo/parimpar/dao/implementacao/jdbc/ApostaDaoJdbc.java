package br.ies.aula.alpoo.jogo.parimpar.dao.implementacao.jdbc;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.LinkedList;
import java.util.List;

import br.ies.aula.alpoo.jogo.parimpar.banco.de.dados.BancoDeDadosParImpar;
import br.ies.aula.alpoo.jogo.parimpar.dao.ApostaDao;
import br.ies.aula.alpoo.jogo.parimpar.entidade.Aposta;
import br.ies.aula.alpoo.jogo.parimpar.entidade.Pessoa;
import br.ies.aula.alpoo.jogo.parimpar.entidade.ResultadosParImpar;

public class ApostaDaoJdbc implements ApostaDao{
	
	private static final String SQL_INSERT = "INSERT INTO aposta (nome, jogada, aposta) VALUES(?, ?, ?);";
	
	public ApostaDaoJdbc() {
	}
	
	public void inserir(Aposta aposta) {
		try {
			PreparedStatement statement = BancoDeDadosParImpar.obterConnection().prepareStatement(SQL_INSERT, Statement.RETURN_GENERATED_KEYS);
			statement.setString(1, aposta.getPessoa().getNome());
			statement.setInt(2, aposta.getJogada());
			statement.setString(3, aposta.getAposta().name());
			
			int linhasAfetadas = statement.executeUpdate();
			if(linhasAfetadas > 0) {
				ResultSet resultSet = statement.getGeneratedKeys();				
				if (resultSet.next()) {
					Integer id = resultSet.getInt(1);
					aposta.setId(id);
				}
				resultSet.close();
			}
			else {
				throw new SQLException("Nenhuma linha afetada!");
			}
			
			statement.close();
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	public List<Aposta> obterApostas() throws SQLException {
		try {
			PreparedStatement statement = BancoDeDadosParImpar.obterConnection().prepareStatement("SELECT * FROM aposta;");
			ResultSet resultSet = statement.executeQuery();
			LinkedList<Aposta> apostas = new LinkedList<Aposta>();
			
			while(resultSet.next()) {
				String nome = resultSet.getString("nome");
				Integer jogada = resultSet.getInt("jogada");
				ResultadosParImpar apostaEscolhida = ResultadosParImpar.valueOf(resultSet.getString("aposta"));
						
				Pessoa pessoa = new Pessoa(null, nome, null, null, null);
				Aposta aposta = new Aposta(jogada, apostaEscolhida, pessoa);
				apostas.add(aposta);
			}
			
			statement.close();
			resultSet.close();
			return apostas;
			
		} catch (SQLException e) {
			throw e;
		} 	
	}	
}
