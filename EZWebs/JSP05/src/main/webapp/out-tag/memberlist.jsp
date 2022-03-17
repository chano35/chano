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
<title>멤버 조회</title>
</head>
<body>
	<h1>Taglibs - out 태그</h1>
	<p>이동경로 : memberForm.html -> member.jsp(forward) -> memberlist.jsp </p>
	<p>out 태그</p>
	<hr>
	<table>
		<tr bgcolor="88aacc">
			<td width="10%"><b>아이디</b></td>
			<td width="10%"><b>이름</b></td>
			<td width="10%"><b>비밀번호</b></td>
			<td width="20%"><b>이메일</b></td>
			<td width="20%"><b>등록일자</b></td>
		</tr>
		<c:choose>
			<c:when test="${empty memberList}">
				<tr>
					<td colspan="5">자료가 없습니다.</td>
				</tr>
			</c:when>
			<c:otherwise>
				<c:forEach var="mem" items="${memberList}">
				<tr>
					<td><c:out value="${mem.getMid()}"/></td>
					<td><c:out value="${mem.getMname()}" default="무명씨"/></td>
					<td><c:out value="${mem.getPwd()}" default="비번없음"/></td>
					<td><c:out value="${mem.getEmail()}" default="연락처부재"/></td>
					<td><c:out value="${mem.getRegdate()}"/></td>
				</tr>
				</c:forEach>
			</c:otherwise>
		</c:choose>
	</table>

</body>
</html>