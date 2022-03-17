package binding;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/jtarget5")
public class JTarget5 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public JTarget5() {
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
		response.setContentType("text/html;charset=UTF-8");

		PrintWriter out = response.getWriter();
		
		String msgx = (String)request.getAttribute("msgx");
		
		out.println("<html><body>");
		out.println("<h1>dispatch</h1>");
		out.println("<hr>");
		out.println("<p>jstarter5 -> jtarget5 이동</p>");
		out.println("<p>메시지 : " + msgx + "</p>");
		out.println("</body><html>");
	}

}