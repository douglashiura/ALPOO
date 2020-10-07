package br.ies.aula.alpoo.jogo.banco;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.LinkedList;
import java.util.List;

import br.ies.aula.alpoo.jogo.entidade.Aposta;
import br.ies.aula.alpoo.jogo.entidade.ResultadosDoJogoParImpar;

public class ApostaDB {

	public List<Aposta> obterApostas() throws SQLException {
		try (Connection con = ConexaoPostgreSQL.getConnection()) {
			String sql = "SELECT id, nome, aposta, valor FROM Aposta";
			PreparedStatement stmt = con.prepareStatement(sql);
			ResultSet rs = stmt.executeQuery();
			LinkedList<Aposta> apostas = new LinkedList<Aposta>();
			while (rs.next()) {
				Integer id = rs.getInt(1);
				String nome = rs.getString(2);
				ResultadosDoJogoParImpar apostaRealizada = ResultadosDoJogoParImpar.valueOf(rs.getString(3));
				Integer valor = rs.getInt(4);
				Aposta aposta = new Aposta(nome, apostaRealizada, valor);
				aposta.setId(id);
				apostas.add(aposta);
			}
			rs.close();
			stmt.close();
			return apostas;
		}
	}

	public void inserirApostas(Aposta aposta) throws SQLException {
		try (Connection con = ConexaoPostgreSQL.getConnection()) {
			String sql = "INSERT INTO Aposta (nome, aposta, valor) VALUES(?, ?, ?)";
			PreparedStatement stmt = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
			stmt.setString(1, aposta.getNome());
			stmt.setString(2, aposta.getAposta().name());
			stmt.setInt(3, aposta.getValor());
			stmt.execute();
			ResultSet rs = stmt.getGeneratedKeys();
			if (rs.next()) {
				aposta.setId(rs.getInt(1));
			}
			rs.close();
			stmt.close();
		}
	}
}
