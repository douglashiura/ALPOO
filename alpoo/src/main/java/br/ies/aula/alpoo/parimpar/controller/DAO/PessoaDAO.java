package br.ies.aula.alpoo.parimpar.controller.DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import br.ies.aula.alpoo.parimpar.model.Pessoa;

public class PessoaDAO {
	public void inserirPessoa(Pessoa pessoa) throws SQLException {
		try (Connection con = ConexaoPostgreSQL.getConnection()) {
			String sql = "INSERT INTO public.pessoa(nome, data_nascimento) VALUES (?, ?)";
			PreparedStatement stmt = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
			stmt.setString(1, pessoa.getNome());
			stmt.setDate(2, new java.sql.Date(pessoa.getDataNascimento().getTime()));
			stmt.execute();
			ResultSet rs = stmt.getGeneratedKeys();
			if (rs.next()) {
				pessoa.setId(rs.getInt(1));
			}
			rs.close();
			stmt.close();
		}
	}
}
