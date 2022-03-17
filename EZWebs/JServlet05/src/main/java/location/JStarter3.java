/*
 * [포워드] 
 * - 웹 브라우저를 거쳐서 요청
 * - location
 */
package location;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/jstarter3")
public class JStarter3 extends HttpServlet {
    public JStarter3() {
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html;charset=UTF-8");
		
		PrintWriter out = response.getWriter();
		
		out.print("<script type='text/javascript'>");
		out.print("location.href='jtarget3';");
		out.print("</script>");
	}

}