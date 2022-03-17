/*
 * METHOD : POST
 * login2.html에서 전송된 데이터를 POST방식으로 받아 출력
 */

package jservlet02;

import java.io.IOException;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/login2")
public class Login2 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public Login2() {
    	System.out.println("[Login2] init...");

    }

	public void init(ServletConfig config) throws ServletException {
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		System.out.println("[Login2] doPost()");
		
		request.setCharacterEncoding("UTF-8");
		
		String userid = request.getParameter("userid");
		String userpw = request.getParameter("userpw");
		System.out.println("userid : " + userid);
		System.out.println("userpw : " + userpw);
	}

}
