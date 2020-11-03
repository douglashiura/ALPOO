package br.ies.visao.web;

import java.io.Serializable;
import java.sql.SQLException;
import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

import br.ies.main.banco.de.dados.BancoDeDadosPessoa;
import br.ies.main.entidades.Pessoa;

@SessionScoped
@ManagedBean(name = "login")
public class Login implements Serializable {
	private static final long serialVersionUID = 1L;

	private Boolean estaLogado;
	private String nome;
	private String senha;

	private Pessoa usuario;

	public Login() {
		usuario = new Pessoa("", "");
		estaLogado = false;
	}

	public void autenticar() throws SQLException {
		usuario.setNome(nome);
		usuario.setSenha(senha);
		BancoDeDadosPessoa banco = new BancoDeDadosPessoa();
		List<String> nomesJaExistentes = banco.retornarTodosOsNomeDePessoas();

		for (Integer iterator = 0; iterator < nomesJaExistentes.size(); iterator++) {
			if (usuario.getNome().equals(nomesJaExistentes.get(iterator))) {
				if (banco.retornarSenha(usuario.getNome()).equals(usuario.getSenha())) {
					estaLogado = true;
				} else {
					estaLogado = false;
				}
			} else {
				estaLogado = false;
			}
		}
	}

	public String podeLogar() {
		if (estaLogado) {
			return "Entrar";
		} else {
			return "";
		}
	}

	public String autorizado() {
		if (estaLogado) {
			return "jogo.xhtml";
		} else {
			return "";
		}
	}

	// Getters e Setters
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}

}