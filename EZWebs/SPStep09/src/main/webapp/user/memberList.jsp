<%@ page language="java" contentType="text/html; charset=UTF-8"
	isELIgnored="false"
    pageEncoding="UTF-8"%>
    
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<c:set var="contextPath" value="${pageContext.request.contextPath}" />    

<%
	request.setCharacterEncoding("UTF-8");
%>    

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>멤버 리스트</title>
</head>
<body>
	<h3>멤버 리스트</h3>
	<hr>
	<table>
		<tr bgcolor="66aacc">
			<td>아이디</td>
			<td>이름</td>
			<td>비밀번호</td>
			<td>이메일</td>
			<td>등록일자</td>
			<td>수정</td>
			<td>삭제</td>
		</tr>
		<c:forEach var="mem" items="${memberlist}" varStatus="loop">
		<tr bgcolor="#cba">
			<td><a href="${contextPath}/user/memberview.do?mid=${mem.mid}">${mem.mid}</a></td>
			<td>${mem.mname}</td>
			<td>${mem.pwd}</td>
			<td>${mem.email}</td>
			<td>${mem.regdate}</td>
			<td><a href="${contextPath}/user/memberedit.do?mid=${mem.mid}">수정</a></td>
			<td><a href="${contextPath}/user/memberdelete.do?mid=${mem.mid}">삭제</a></td>
		</tr>
		</c:forEach>
	</table>

</body>
</html>