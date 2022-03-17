<%@ page language="java" contentType="text/html; charset=UTF-8"
	import="members.*, java.util.*"
	isELIgnored="false"
    pageEncoding="UTF-8"%>
    
<%
	request.setCharacterEncoding("UTF-8");

	String mid = request.getParameter("mid");
	String mname = request.getParameter("mname");
	String pwd = request.getParameter("pwd");
	String email = request.getParameter("email");
%>    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>멤버 등록 및 조회</title>
</head>
<body>
	<h1>Expression Language - param</h1>
	<p>param.name은 request.getParameter(name)을 대체할 수 있다.</p>
	<hr>
	<table>
		<tr bgcolor="88aacc">
			<td>아이디</td>
			<td>이름</td>
			<td>비밀번호</td>
			<td>이메일</td>
		</tr>
		<tr>
			<td><%=mid%></td>
			<td><%=mname%></td>
			<td><%=pwd%></td>
			<td><%=email%></td>
		</tr>
		<tr>
			<td>${param.mid}</td>
			<td>${param.mname}</td>
			<td>${param.pwd}</td>
			<td>${param.email}</td>
		</tr>
	</table>
</body>
</html>