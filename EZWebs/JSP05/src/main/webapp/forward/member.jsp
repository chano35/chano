<%@ page language="java" contentType="text/html; charset=UTF-8"
	import="members.*, java.util.*"
	isELIgnored="false"
    pageEncoding="UTF-8"%>
    
<%
	request.setCharacterEncoding("UTF-8");
%>    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>멤버 등록 및 조회</title>
</head>
<body>
	<h1>Expression Language</h1>
	<p>memberForm2.html -> forward2.jsp -> member2.jsp</p>
	<p>forward에서 request.setAttribute()로 저장한 값을 requestScope로 읽음</p>
	<ul>
		<li>param.name: request.getParameter(name)을 대체</li>
		<li>requestScope: JSP의 request 객체에 해당</li>
	</ul>
	<hr>
	<table>
		<tr bgcolor="88aacc">
			<td>아이디</td>
			<td>이름</td>
			<td>비밀번호</td>
			<td>이메일</td>
			<td>주소</td>
		</tr>
		<tr>
			<td>${param.mid}</td>
			<td>${param.mname}</td>
			<td>${param.pwd}</td>
			<td>${param.email}</td>
			<td>${requestScope.address}
		</tr>
	</table>
</body>
</html>