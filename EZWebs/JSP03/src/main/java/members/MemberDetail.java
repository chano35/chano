package members;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/memberdetail")
public class MemberDetail extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public MemberDetail() {
        super();
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("[memberview] GET : ***********************************");
		doProcess(request, response);
	}
    
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("[memberview] POST: ***********************************");
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
		out.print("<h1>멤버 상세정보</h1>");
		out.print("<hr>");
		
	}
	
	static void htmlMember(PrintWriter out, MemberVO member) {
		if(member == null) {
			return;
		}

		out.print("<table border=1");
		out.printf("<tr><td>아이디</td>	<td>%s</td></tr>", member.getMid());
		out.printf("<tr><td>이름</td>		<td>%s</td></tr>", member.getMname());
		out.printf("<tr><td>비밀번호</td>	<td>%s</td></tr>", member.getPwd());
		out.printf("<tr><td>전자메일</td>	<td>%s</td></tr>", member.getEmail());
		out.print("</table>");
		out.print("<a href='/JServlet06/memberview'>맴버 목록</a>");
	}
	
	static void htmlFooter(PrintWriter out) {
		out.print("</body></html>");
	}

}
