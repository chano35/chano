package members;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/memberedit")
public class MemberEdit extends HttpServlet {

	public MemberEdit() {
    }

	public void init(ServletConfig config) throws ServletException {
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("[MemberEdit] /memberedit: GET ");
		doProcess(request, response);
	}
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("[MemberEdit] /memberedit: POST ");
		doProcess(request, response);
	}
	
	protected void doProcess(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
		response.setContentType("text/html;charset=UTF-8");
		
		String mid = request.getParameter("mid");
		
		MemberDAO memberDAO = new MemberDAO();
		MemberVO member = memberDAO.getMember(mid);
		
		PrintWriter out = response.getWriter();
		htmlHeader(out);
		htmlMember(out, member);
		htmlFooter(out);
	}

	
	static void htmlHeader(PrintWriter out) {
		out.print("<html><body>");
		out.print("<h1>멤버 수정</h1>");
		out.print("<hr>");
		
	}
	
	static void htmlMember(PrintWriter out, MemberVO member) {
		if(member == null) {
			return;
		}

		out.print("<form name='memberedit' method='post' action='memberinsert'>");
		out.print("<table border=1");
		out.printf("<tr><td>아이디</td><td><input type='text' name='mid' value='%s' readonly/></td></tr>", member.getMid());
		out.printf("<tr><td>이름</td><td><input type='text' name='mname' value='%s'/></td></tr>", member.getMname());
		out.printf("<tr><td>비밀번호</td><td><input type='password' name='pwd' value='%s'/></td></tr>", member.getPwd());
		out.printf("<tr><td>전자메일</td><td><input type='text' name='email' value='%s'/></td></tr>", member.getEmail());
		out.print("<tr>");
		out.print("<td><input type='submit' value='멤버수정'/></td>");
		out.print("<td><input type='resett' value='다시입력'/></td>");
		out.print("</tr>");
		out.print("</table>");
		out.print("<input type='hidden' name='command' value='editMember'/>");
		out.print("</form>");
	}
	
	static void htmlFooter(PrintWriter out) {
		out.print("</body></html>");
	}
}