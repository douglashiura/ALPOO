package br.ies.visao.web;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

@SessionScoped
@ManagedBean()
public class Bean {
	private String name;
	
	public Bean() {
		name = "TesteNoJogoDoOito";
	}
	
	public String getName() {
		return name;
	}
}