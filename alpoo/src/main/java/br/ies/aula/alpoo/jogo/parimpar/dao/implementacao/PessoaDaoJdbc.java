package br.ies.aula.alpoo.jogo.parimpar.dao.implementacao;

import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import br.ies.aula.alpoo.jogo.parimpar.banco.de.dados.BancoDeDadosParImpar;
import br.ies.aula.alpoo.jogo.parimpar.dao.PessoaDao;
import br.ies.aula.alpoo.jogo.parimpar.entidade.Pessoa;

public class PessoaDaoJdbc implements PessoaDao {

	private static final String SQL_INSERT = "INSERT INTO pessoa (nome, dataNascimento, loguin, senha) VALUES(?, ?, ?, ?);";

	public PessoaDaoJdbc() {
	}
	
	@Override
	public void inserir(Pessoa pessoa) {
		try {
			PreparedStatement statement = BancoDeDadosParImpar.obterConnection().prepareStatement(SQL_INSERT, Statement.RETURN_GENERATED_KEYS);
			statement.setString(1, pessoa.getNome());
			statement.setDate(2, Date.valueOf(pessoa.getDataDeNascimento()));
			statement.setString(3, pessoa.getLoguin());
			statement.setString(4, pessoa.getSenha());
			
			int linhasAfetadas = statement.executeUpdate();
			if(linhasAfetadas > 0) {
				ResultSet resultSet = statement.getGeneratedKeys();				
				if (resultSet.next()) {
					Long id = resultSet.getLong(1);
					pessoa.setId(id);
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

	@Override
	public Pessoa pesquisarPorLoguin(String loguin) throws SQLException {
		try {
			PreparedStatement statement = BancoDeDadosParImpar.obterConnection().prepareStatement("SELECT * FROM pessoa WHERE UPPER(loguin) = UPPER(?);");
			statement.setString(1, loguin);
			
			ResultSet resultSet = statement.executeQuery();
			
			if(resultSet.next()) {
				Pessoa pessoa = instanciarPessoa(resultSet);
				return pessoa;
			}
			
			return null;
		} catch (SQLException e) {
			throw e;
		}
	}

	private Pessoa instanciarPessoa(ResultSet resultSet) throws SQLException {
		Pessoa pessoa = new Pessoa();
		
		pessoa.setId(resultSet.getLong("id"));
		pessoa.setNome(resultSet.getString("nome"));
		pessoa.setDataDeNascimento(resultSet.getDate("dataNascimento").toLocalDate());
		pessoa.setLoguin(resultSet.getString("loguin"));
		pessoa.setSenha(resultSet.getString("senha"));
		
		return pessoa;
	}

}
