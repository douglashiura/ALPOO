package alpoo.web;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

@SessionScoped
@ManagedBean()
public class Bean {
	private String name;
	private String password;
	private String autenticado;

	public Bean() {
		// name = "Teste";
		autenticado = "Opa";
	}

	public String getName() {
		return name;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public void autenticar() {
		if (getName().equals(password)) {
			autenticado = "Tudo certo";
		} else {
			autenticado = "Tudo errado";
		}

	}

	public String getAutenticado() {
		return autenticado;
	}

	public void setAutenticado(String autenticado) {
		this.autenticado = autenticado;
	}

	public void setName(String name) {
		this.name = name;
	}

}
