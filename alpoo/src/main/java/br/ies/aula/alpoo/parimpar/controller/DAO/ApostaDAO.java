package br.ies.aula.alpoo.parimpar.controller.DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.LinkedList;
import java.util.List;

import br.ies.aula.alpoo.parimpar.model.Aposta;
import br.ies.aula.alpoo.parimpar.model.Pessoa;
import br.ies.aula.alpoo.parimpar.model.ResultadosDoJogoParImpar;


public class ApostaDAO {

	public List<Aposta> obterApostas() throws SQLException {
		try (Connection con = ConexaoPostgreSQL.getConnection()) {
			String sql = "SELECT a.id, a.aposta, a.valor, p.id, p.nome, p.data_nascimento FROM aposta a JOIN pessoa p ON p.id = a.id_pessoa;";
			PreparedStatement stmt = con.prepareStatement(sql);
			ResultSet rs = stmt.executeQuery();
			LinkedList<Aposta> apostas = new LinkedList<Aposta>();
			while (rs.next()) {
				Integer id = rs.getInt(1);
				ResultadosDoJogoParImpar apostaRealizada = ResultadosDoJogoParImpar.valueOf(rs.getString(2));
				Integer valor = rs.getInt(3);
				Pessoa pessoa = new Pessoa(rs.getInt(4), rs.getString(5), rs.getDate(6));
				Aposta aposta = new Aposta(id, pessoa, apostaRealizada, valor);
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
			String sql = "INSERT INTO public.aposta(aposta, valor, id_pessoa) VALUES (?, ?, ?)";
			PreparedStatement stmt = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
			stmt.setString(1, aposta.getAposta().name());
			stmt.setInt(2, aposta.getValor());
			stmt.setInt(3, aposta.getPessoa().getId());
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
