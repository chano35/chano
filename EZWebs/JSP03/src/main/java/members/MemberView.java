package members;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/memberview")
public class MemberView extends HttpServlet {
	public MemberView() {
        super();
        // TODO Auto-generated constructor stub
    }

	public void init(ServletConfig config) throws ServletException {
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("[memberview] GET : ***********************************");
		doProcess(request, response);	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("[memberview] POST: ***********************************");
		doProcess(request, response);
	}
	
	protected void doProcess(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
		response.setContentType("text/html;charset=UTF-8");
		
//		List<MemberVO> members = (List<MemberVO>)request.getAttribute("members");
		
		PrintWriter out = response.getWriter();
		htmlHeader(out);
		htmlMembers(out);
		htmlFooter(out);
	}
	
	static void htmlHeader(PrintWriter out) {
		out.print("<html><body>");
		out.print("<h2>멤버 뷰</h2>");
		out.print("<hr>");
		out.print("<table border=1");
		out.print("<tr align='center' bgcolor='lightgreen'>");
		out.print("<td>아이디</td>");
		out.print("<td>이름</td>");
		out.print("<td>비밀번호</td>");
		out.print("<td>이메일</td>");
		out.print("<td>등록일자</td>");
		out.print("<td>삭제</td>");
		out.print("<td>수정</td>");
		out.print("</tr>");
	}
	
	static void htmlMembers(PrintWriter out) {
		MemberDAO memberDAO = new MemberDAO();
		List<MemberVO> members = memberDAO.getMembers();

		
		if(members == null) {
			return;
		}
		
		for(int cnt=0; cnt < members.size(); cnt++) {
			MemberVO member = members.get(cnt);
			out.print("<tr>");
			out.printf("<td><a href='/JServlet06/memberdetail?mid=%s'>%s</a></td>", member.getMid(), member.getMid());
			out.printf("<td>%s</td>", member.getMname());
			out.printf("<td>%s</td>", member.getPwd());
			out.printf("<td>%s</td>", member.getEmail());
			out.printf("<td>%s</td>", member.getRegdate());
			out.printf("<td><a href='/JServlet06/memberinsert?command=deleteMember&mid=%s'>삭제</a></td>", member.getMid());
			out.printf("<td><a href='/JServlet06/memberedit?mid=%s'>수정</a></td>", member.getMid());
			out.print("</tr>");
		}
	}
	
	static void htmlFooter(PrintWriter out) {
		out.print("<tr><td colspan=7><a href='/JServlet06/memberinsert.html'>멤버등록</a></td></tr>");
		out.print("</table>");
		out.print("</body></html>");
	}
}