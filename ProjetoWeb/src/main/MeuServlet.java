package main;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class MeuServlet extends HttpServlet {

	private static final long serialVersionUID = 1L;

	public MeuServlet() {
		super();
	}

	protected void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException {
		System.out.println(req.getParameter("login"));
	}

	protected void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException {
		doGet(req, res);
	}

}
