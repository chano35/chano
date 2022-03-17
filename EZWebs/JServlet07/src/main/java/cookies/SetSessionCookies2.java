package cookies;

import java.io.IOException;
import java.io.PrintWriter;
import java.net.URLEncoder;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/setsessioncookies")
public class SetSessionCookies2 extends HttpServlet {
       
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html; charset=UTF-8");
		
		Cookie hellocookie = new Cookie("hellosessioncookie", URLEncoder.encode("Hello Cooki('세션쿠키')", "utf-8"));
		hellocookie.setMaxAge(-1);	//세션쿠키

		response.addCookie(hellocookie);
		
		resHTML(response.getWriter());
		
	}
	static void resHTML(PrintWriter out) {
		out.print("<html><body>");
		out.print("<h1>세션쿠키처리</h1>");
		out.print("<hr>");
		out.printf("<p>쿠키처리시간: %s</p>", new Date());
		out.print("</body></html>");
		
	}
}
