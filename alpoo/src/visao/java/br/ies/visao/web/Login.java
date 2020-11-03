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

	private Boolean primeiraInteracao;
	private Boolean estaLogado;
	private Boolean senhaErrada;
	private String nome;
	private String senha;

	private Pessoa usuario;

	public Login() {
		usuario = new Pessoa("", "");
		estaLogado = false;
		senhaErrada = false;
		primeiraInteracao = true;
	}

	public String autenticar() throws SQLException {
		usuario.setNome(nome);
		usuario.setSenha(senha);
		BancoDeDadosPessoa banco = new BancoDeDadosPessoa();
		List<String> nomesJaExistentes = banco.retornarTodosOsNomeDePessoas();
		primeiraInteracao = false;
		
		for (String iterator : nomesJaExistentes) {
			if (nome.equals(iterator)) {
				if (banco.retornarSenha(nome).equals(senha)) {
					estaLogado = true;
					senhaErrada = false;
					
					return "jogo.xhtml";
				} else {
					estaLogado = false;
					senhaErrada = true;
					return "index.xhtml";
				}
			} else {
				estaLogado = false;
				senhaErrada = false;
				return "index.xhtml";
			}
		}
		return "index.xhtml";
		
	}

	public String loginStatus() {
		if(!primeiraInteracao) {
			if (estaLogado) {
				return "Sucesso!";
			} else {
				if(senhaErrada) {;
					return "Senha Incorreta.";
				}else {
					return "Usuario não existe.";
				}
			}
		}else {
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