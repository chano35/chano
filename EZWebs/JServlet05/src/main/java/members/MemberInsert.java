package members;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
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

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doProcess(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doProcess(request, response);
	}
	
	protected void doProcess(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
		response.setContentType("text/html;charset=UTF-8");
		
		MemberDAO memberDAO = new MemberDAO();
		
		String command = request.getParameter("command");
		if(command != null) {
			if(command.equals("insertMember")) {
				String mid   = request.getParameter("mid");
				String mname = request.getParameter("mname");
				String pwd   = request.getParameter("pwd");
				String email = request.getParameter("email");
				System.out.printf("[insertMember] (%s)(%s)(%s)(%s)%n", mid, mname, pwd, email);

				if(mid != null && mid.isEmpty() != true) {
					MemberVO member = new MemberVO(mid, mname, pwd, email);
					memberDAO.insertMember(member);
				}
			}
			else if(command.equals("deleteMember")) {
				String mid = request.getParameter("mid");
				System.out.printf("[deleteMember] mid(%s)%n", mid);
				if(mid != null && mid.isEmpty() != true) {
					memberDAO.deleteMember(mid);
				}
			}
		}
		
		List<MemberVO> members = memberDAO.getMembers();
		request.setAttribute("members", members);
		
		/*
		 * GET에서 처리하면 dispatcher는 GET로 요청
		 * POST에서 처리하면 dispatcher는 POST로 요청
		 * memberinsert.html  : command=insertMember는 POST 처리
		 * 서블릿(memberview) : command=deleteMember는 GET 처리
		 * 그러므로 서블릿(memberview)는 GET, POST를 모두 처리하도록 해야 한다.
		 */
		RequestDispatcher dispatcher = request.getRequestDispatcher("memberview");
		dispatcher.forward(request, response); 
	}
	
}