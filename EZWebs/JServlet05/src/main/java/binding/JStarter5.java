/*
 * [포워드] 
 * - 웹 브라우저를 거쳐서 요청
 * - Dispatch & request.setAttribute(...)
 * - 웹 브라우저의 주소창의 URL이 변경되지 않음
 * - 웹 브라우저에서 포워드가 진행되었는지 알 수 없음
 * - 스프링에서 사용하는 포워딩 방법
 * - request.setAttribute(...) 자바 객체를 전달
 */
package binding;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/jstarter5")
public class JStarter5 extends HttpServlet {
    public JStarter5() {
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
		response.setContentType("text/html;charset=UTF-8");
		
		request.setAttribute("msgx", "환영합니다");
		
		RequestDispatcher dispatcher = request.getRequestDispatcher("jtarget5");
		dispatcher.forward(request, response);
	}

}