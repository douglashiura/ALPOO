package br.ies.visao.web;

import java.io.Serializable;
import java.net.http.HttpRequest;
import java.sql.SQLException;
import java.util.List;

import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.context.FacesContext;

import br.ies.main.banco.de.dados.BancoDeDadosPessoa;

@SessionScoped
@ManagedBean(name = "bean")
public class Bean extends GerenciamentoDasCelulas implements Serializable {

	private static final long serialVersionUID = 1L;
	
	private String usuario;
	private String senha;

	public Bean() {

	}

	public String autenticar() throws SQLException {
		BancoDeDadosPessoa banco = new BancoDeDadosPessoa();
		List<String> nomesJaExistentes = banco.retornarTodosOsNomeDePessoas();
		Boolean estaLogado = null;
		for (Integer iterator = 0; iterator < nomesJaExistentes.size(); iterator++) {
			if (usuario.equals(nomesJaExistentes.get(iterator))) {
				if (banco.retornarSenha(usuario).equals(senha)) {
					estaLogado = true;
				} else {
					estaLogado = false;
				}
			} else {
				estaLogado = false;
			}
		}

		if (estaLogado) {
			/*
			HttpSession session = SessionUtils.getSession();
			session.setAttribute("username", usuario);
			*/
			return "jogo";
		} else {
			FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_WARN,
					"Incorrect Username and Passowrd", "Please enter correct username and Password"));
			return "index";
		}
	}

	// Movimentos
	public void moverPraCima() {
		controle.moverPraCima();
	}

	public void moverPraBaixo() {
		controle.moverPraBaixo();
	}

	public void moverPraEsquerda() {
		controle.moverPraEsquerda();
	}

	public void moverPraDireita() {
		controle.moverPraDireita();
	}

	// Getters e Setters
	public String getUsuario() {
		return usuario;
	}

	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}

}