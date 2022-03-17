/*
 * [포워드] 
 * - response.sendRedirect(...)
 * - 웹 브라우저를 거쳐서 요청
 */
package redirect;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/jstarter1a")
public class JStarter1A extends HttpServlet {
    public JStarter1A() {
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html;charset=UTF-8");
		response.sendRedirect("jtarget1a?msg=Hi!");
	}

}