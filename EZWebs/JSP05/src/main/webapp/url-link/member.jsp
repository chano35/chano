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
<title>Tablibs & param</title>
</head>
<body>
	<h1>멤버등록</h1>
	<p>이동경로: url-link.jsp -> member.jsp</p>
	<p>url 태그를 사용하여 전달한 파라미터를 받음</p>
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