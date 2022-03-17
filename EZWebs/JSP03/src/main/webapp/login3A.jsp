<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
	request.setCharacterEncoding("UTF-8");
%>
    
<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<title>로그인</title>
<%
	String userid = request.getParameter("userid");
	String userpw = request.getParameter("userpw");
	System.out.printf("[login.jsp] userid(%s), userpw(%s)%n", userid, userpw);
	if(userid == null || userid.length() == 0 || userpw == null || userpw.length() == 0) {
		String msg = "?msg='아이디 또는 비밀번호가 비어 있습니다.'";
		System.out.println(msg);
		RequestDispatcher dispatcher = request.getRequestDispatcher("loginform3A.jsp" + msg);
		dispatcher.forward(request, response);
		return;
	}
%>
</head>
<body>


	<h1>로그인</h1>
	<hr>
	<h2>로그인 성공</h2>
	<h3><%=userid%>님 환영합니다.</h3>
</body>
</html>