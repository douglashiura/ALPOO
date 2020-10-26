package alpoo.web;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

@SessionScoped
@ManagedBean()
public class Bean {
	private String name;

	public Bean() {
		name = "Teste";
	}
	
	public String getName() {
		return name;
	}

}

