package web;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

@SessionScoped
@ManagedBean()
public class AutenticaLogin {
	private String name;

	public AutenticaLogin() {
		name = "Teste";
	}

	public String getName() {
		return name;
	}

}
