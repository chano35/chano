package jservlet01.s01;

import java.io.IOException;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class step01  extends HttpServlet {

	private int count;
	
	
	@Override
	public void destroy() {
		System.out.println("[step01] destory...");
	}


	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.printf("[step01] deGet() : count(%d)\n", this.count++);
	}


	@Override
	public void init(ServletConfig config) throws ServletException {
		System.out.println("[step01] init...");
	}


}
