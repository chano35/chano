/*
 * METHOD : GET, POST
 * login2.html에서 전송된 데이터를 GET 또는 POST방식으로 받아 출력
 */

package jservlet02;

import java.io.IOException;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/login3")
public class Login3 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public Login3() {
    	System.out.println("[Login3] init...");

    }

	public void init(ServletConfig config) throws ServletException {
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		System.out.println("[Login3] doPost()");
		
		request.setCharacterEncoding("UTF-8");
		
		String userid = request.getParameter("userid");
		String userpw = request.getParameter("userpw");
		System.out.println("userid : " + userid);
		System.out.println("userpw : " + userpw);
	}
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("[Login3] doGet");
		
		request.setCharacterEncoding("UTF-8");
		
		String userid = request.getParameter("userid");
		String userpw = request.getParameter("userpw");
		System.out.println("userid : " + userid);
		System.out.println("userpw : " + userpw);
	}

}
