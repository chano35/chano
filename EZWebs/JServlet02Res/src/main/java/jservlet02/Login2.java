/*
 * METHOD : POST
 * login2.html에서 전송된 데이터를 POST방식으로 받아 출력
 */

package jservlet02;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/login2")
public class Login2 extends HttpServlet {
	boolean logined;
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
		response.setContentType("text/html;charset=UTF-8");
		
		String userid = request.getParameter("userid");
		String userpw = request.getParameter("userpw");
		logined = true;
		
		System.out.printf("uid(%s), pwd(%s), logined(%b)\n", userid, userpw, logined);
		sendResponseFormat(response.getWriter(), userid);
		
	}
	
	static void sendResponseFormat(PrintWriter out, String userid) {
		String html = String.format("<html><body><h2>로그인 성공</h2><hr><p>(%s)님 환영합니다.</p></body></html>");
		out.print(html);
	}

	
}










