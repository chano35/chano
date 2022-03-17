package dispatch;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/jtarget4")
public class JTarget4 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public JTarget4() {
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html;charset=UTF-8");

		PrintWriter out = response.getWriter();
		
		String msg = request.getParameter("msg");
		
		out.println("<html><body>");
		out.println("<h1>dispatch</h1>");
		out.println("<hr>");
		out.println("<p>jstarter4 -> jtarget4 이동</p>");
		out.println("<p>메시지 : " + msg + "</p>");
		out.println("</body><html>");
	}

}