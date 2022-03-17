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
	/*
	if(userid == null || userid.length() == 0 || userpw == null || userpw.length() == 0) {
		System.out.println("userid & userpw가 없음");
		RequestDispatcher dispatcher = request.getRequestDispatcher("loginform.jsp");
		dispatcher.forward(request, response);
		return;
	}
	*/
	if(userid == null || userid.length() == 0 || userpw == null || userpw.length() == 0) {
		System.out.println("userid & userpw가 없음");
%>	
	<jsp:forward page="loginform2.jsp"/>
<%
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