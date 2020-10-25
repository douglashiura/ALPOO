package aula.web;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

@SessionScoped
@ManagedBean()
public class Bean {
	String login;
	String senha;
	
	public Bean() {}
	
	public void setLogin(String login) {
		this.login = login;
	}
	
	public String getLogin() {
		return login;
	}
	
	public void setSenha(String senha) {
		this.senha = senha;
	}
	
	public String getSenha() {
		return senha;
	}
	
	public String autenticacao() {
		if(login.equals(senha)) {
			return "Bem vindo " + login + ", autenticado com sucesso!";
		} else {
			return "Falha na autenticação.";
		}
	}
	
}