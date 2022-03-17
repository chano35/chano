/*
 * [포워드] 
 * - 웹 브라우저를 거쳐서 요청
 * - Refresh
 */
package refresh;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/jstarter2")
public class JStarter2 extends HttpServlet {
    public JStarter2() {
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html;charset=UTF-8");
		response.addHeader("Refresh", "5;url=jtarget2"); // 5초후에 jtarget2로 이동
	}

}