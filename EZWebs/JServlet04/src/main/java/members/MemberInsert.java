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

@WebServlet("/memberinsert")
public class MemberInsert extends HttpServlet {
	public MemberInsert() {
		super();
		// TODO Auto-generated constructor stub
	}

	public void init(ServletConfig config) throws ServletException {
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doProcess(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doProcess(request, response);
	}

	protected void doProcess(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
		response.setContentType("text/html;charset=UTF-8");

		MemberDAO memberDAO = new MemberDAO();

		String command = request.getParameter("command");
		if (command != null) {
			if (command.equals("insertMember")) {
				String mid = request.getParameter("mid");
				String mname = request.getParameter("mname");
				String pwd = request.getParameter("pwd");
				String email = request.getParameter("email");
				System.out.printf("[insertMember] (%s)(%s)(%s)(%s)%n", mid, mname, pwd, email);

				if (mid != null && mid.isEmpty() != true) {
					MemberVO member = new MemberVO(mid, mname, pwd, email);
					memberDAO.insertMember(member);
				}
			} else if (command.equals("deleteMember")) {
				String mid = request.getParameter("mid");
				System.out.printf("[deleteMember] mid(%s)%n", mid);
				if (mid != null && mid.isEmpty() != true) {
					memberDAO.deleteMember(mid);
				}
			}
		}

		List<MemberVO> members = memberDAO.getMembers();
		request.setAttribute("members", members);

	}

}