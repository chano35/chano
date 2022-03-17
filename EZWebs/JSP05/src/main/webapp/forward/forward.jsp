<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
	request.setCharacterEncoding("UTF-8");
	request.setAttribute("address", "경기도 성남시 분당구");
%>    
<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<title>jsp forward to member2.jsp</title>
</head>
<body>
	<jsp:forward page="member.jsp"></jsp:forward>
</body>
</html>