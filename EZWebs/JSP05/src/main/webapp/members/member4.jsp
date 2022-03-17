<%@ page language="java" contentType="text/html; charset=UTF-8"
	import="members.*, java.util.*"
	isELIgnored="false"
    pageEncoding="UTF-8"%>
    
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
    
<%
	request.setCharacterEncoding("UTF-8");
%>
    
<jsp:useBean id="member" class="members.MemberVO" scope="page"/>
<jsp:setProperty name="member" property="*" />
<jsp:useBean id="memberList" class="java.util.ArrayList" />

<%
	memberList.add(member);

	MemberVO mem2 = new MemberVO("5454", "오사오사", "4545", "5454@abc.com");
	memberList.add(mem2);
%>


<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>멤버 등록 및 조회</title>
</head>
<body>
	<h1>멤버 등록 및 조회</h1>
	<hr>
	<table>
		<tr bgcolor="88aacc">
			<td>아이디</td>
			<td>이름</td>
			<td>비밀번호</td>
			<td>이메일</td>
			<td>등록일자</td>
		</tr>
		<tr bgcolor="#abc">
			<td>${memberList[0].getMid()}</td>
			<td>${memberList[0].getMname()}</td>
			<td>${memberList[0].getPwd()}</td>
			<td>${memberList[0].getEmail()}</td>
			<td>${memberList[0].getRegdate()}</td>
		</tr>
		<c:forEach var="mem" items="${memberList}">
		<tr>
			<td>${mem.getMid()}</td>
			<td>${mem.getMname()}</td>
			<td>${mem.getPwd()}</td>
			<td>${mem.getEmail()}</td>
			<td>${mem.getRegdate()}</td>
		</tr>
		</c:forEach>
	</table>

</body>
</html>