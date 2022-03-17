<%@ page language="java" contentType="text/html; charset=UTF-8"
	import="members.*, java.util.*"
	isELIgnored="false"
    pageEncoding="UTF-8"%>
    
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>    
    
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
	<h1>Expression Language - param</h1>
	<p>param.name은 request.getParameter(name)을 대체할 수 있다.</p>
	<hr>
	<table>
		<tr bgcolor="#88aacc">
			<td>아이디</td>
			<td>이름</td>
			<td>비밀번호</td>
			<td>이메일</td>
		</tr>
		<c:choose>
		<c:when test="${empty param.mid}">
			<tr align="center">
				<td colspan="4">아이디가 없습니다.</td>
			</tr>
		</c:when>
		<c:otherwise>
			<tr bgcolor="#66aacc">
				<td>${param.mid}</td>
				<td>${param.mname}</td>
				<td>${param.pwd}</td>
				<td>${param.email}</td>
			</tr>
		</c:otherwise>
		</c:choose>
	</table>
</body>
</html>