package aula.web;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

@SessionScoped
@ManagedBean()
public class Bean {
	private String name;
	
	public Bean() {
		name = "TesteBranchFaculdade";
	}
	
	public String getName() {
		return name;
	}
}