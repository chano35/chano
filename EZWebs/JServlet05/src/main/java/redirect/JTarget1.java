package redirect;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/jtarget1")
public class JTarget1 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public JTarget1() {
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html;charset=UTF-8");

		PrintWriter out = response.getWriter();
		
		out.println("<html><body>");
		out.println("<h1>sendRedirect('jtarget1')</h1>");
		out.println("<hr>");
		out.println("<p>jstarter1 -> jtarget1 이동</p>");
		out.println("</body><html>");
		
	}

}