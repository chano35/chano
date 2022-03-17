package jservlet03;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/login2")
public class Login2 extends HttpServlet {
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		System.out.println("[login2] METGOD:GET");
		requestProcess(request, response);
	}
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		System.out.println("[login2] METGOD:POST");
		requestProcess(request, response);
	}

	protected void requestProcess(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		System.out.println("[login2] requestProcess");
		
		request.setCharacterEncoding("UTF-8");
		response.setContentType("text/html;charset=UTF-8");

		String uid = request.getParameter("userid");
		String pwd = request.getParameter("userpw");
		String adr = request.getParameter("useraddress");	
		sendResponseFormat(response.getWriter(), uid, adr);
	}
	
	static void sendResponseFormat(PrintWriter out, String uid, String adr) {
		String str1 = String.format("<h2><로그인성공></h2><hr><p>(%s)님 환영합니다.</p>",uid);
		String str2 = String.format("<p>주소:%s</p>", adr);
		String body = String.format("<body>%s<hr>%s</body>", str1, str2);
		String html = String.format("<html>%s</html>",body);
		
		out.print(html);
		
	}

}






