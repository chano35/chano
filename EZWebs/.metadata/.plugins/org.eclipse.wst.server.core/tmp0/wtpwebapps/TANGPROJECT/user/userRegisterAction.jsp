<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ page import="member.MemberDTO"%>
<%@ page import="member.MemberDAO"%>
<%@ page import="java.io.PrintWriter"%>

<%
	request.setCharacterEncoding("UTF-8");
    int m_num = 0;
    String m_id = null; 
    String m_nick = null; 
    String m_pwd = null; 
    String m_email = null; 
    String m_phone = null;
    int m_point = 0;
    String m_date= null;

	if(request.getParameter("userID") != null) {
		m_id = (String) request.getParameter("userID");
	}

	if(request.getParameter("userPassword") != null) {
		m_pwd = (String) request.getParameter("userPassword");
	}
	
	if(request.getParameter("userNick") != null) {
		m_nick = (String) request.getParameter("userNick");
	}

	if(request.getParameter("userEmail") != null) {
		m_email = (String) request.getParameter("userEmail");
	}
	
	if(request.getParameter("userPhone") != null) {
		m_phone = (String) request.getParameter("userPhone");
	}

	if (m_id  == null || m_id.equals("") || m_pwd == null || m_pwd.equals("") || m_email == null || m_email.equals("") ||
			m_nick  == null || m_nick.equals("") || m_phone  == null || m_phone.equals("")) {
		PrintWriter script = response.getWriter();
		script.println("<script>");
		script.println("alert('입력이 안 된 사항이 있습니다.');");
		script.println("history.back();");
		script.println("</script>");
		script.close();

	} else {
		MemberDAO userDAO = new MemberDAO();
		int result = userDAO.join(new MemberDTO(m_num, m_id, m_nick, m_pwd, m_email, m_phone, 0, m_date));
		if (result == -1) {
			PrintWriter script = response.getWriter();
			script.println("<script>");
			script.println("alert('데이터베이스 오류입니다.');");
			script.println("history.back();");
			script.println("</script>");
			script.close();

		} else {
			session.setAttribute("userID", m_id);
			PrintWriter script = response.getWriter();
			script.println("<script>");
			script.println("location.href = '../index.jsp';");
			script.println("</script>");
			script.close();

		}

	}

%>


