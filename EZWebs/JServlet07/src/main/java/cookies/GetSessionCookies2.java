package cookies;

import java.io.IOException;
import java.io.PrintWriter;
import java.net.URLDecoder;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/getsessioncookies")
public class GetSessionCookies2 extends HttpServlet {
       
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.printf("service() : /getcookies : METHOD(%S)\n", request.getMethod());
		response.setContentType("text/html; charset=UTF-8");
		
	
		String hellocookie = "none";
		
		Cookie[] cookies = request.getCookies();
		
		for(int cnt = 0; cookies != null && cnt < cookies.length; cnt++) {
			String cookiename = cookies[cnt].getName();
			String cookieval = cookies[cnt].getValue();
			System.out.printf("cnt[%d], name(%s), value(%s)\n" , cnt, cookiename, cookieval);
			if(cookiename.equals("hellosessioncookie")) {
				hellocookie = URLDecoder.decode(cookieval, "UTF-8");
//				break;
			}
		}
		
		resHTML(response.getWriter(), hellocookie);
		
	}
	static void resHTML(PrintWriter out, String hellocookie) {
		out.print("<html><body>");
		out.print("<h1>세션쿠키처리</h1>");
		out.print("<hr>");
		out.printf("<p>현재시간 : %s</p>", new Date());
		out.printf("<p>쿠키값 : %s</p>", hellocookie);
		out.print("</body></html>");
		
	}
}
