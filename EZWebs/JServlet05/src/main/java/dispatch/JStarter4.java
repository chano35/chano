/*
 * [포워드] 
 * - 웹 브라우저를 거쳐서 요청
 * - Dispatch
 * - 웹 브라우저의 주소창의 URL이 변경되지 않음
 * - 웹 브라우저에서 포워드가 진행되었는지 알 수 없음
 * - 스프링에서 사용하는 포워딩 방법 
 */
package dispatch;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/jstarter4")
public class JStarter4 extends HttpServlet {
    public JStarter4() {
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html;charset=UTF-8");
		RequestDispatcher dispatcher = request.getRequestDispatcher("jtarget4?msg=Hi!!!");
		dispatcher.forward(request, response);
	}

}