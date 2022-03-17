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
<jsp:useBean id="memberMap" class="java.util.HashMap" />

<%
	memberList.add(member);

	memberList.add(new MemberVO("5454", "오사오사", "4545", "5454@abc.com"));
	memberList.add(new MemberVO("6464", "육사육사", "6464", "6464@abc.com"));
	
	memberMap.put("title", "멤버 리스트");
	memberMap.put("memberList", memberList);
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
		<th colspan="6" align="center">${memberMap.title}</th>
		<tr bgcolor="66aacc">
			<td>구분</td>
			<td>아이디</td>
			<td>이름</td>
			<td>비밀번호</td>
			<td>이메일</td>
			<td>등록일자</td>
		</tr>
		<tr bgcolor="#abc">
			<td>파라미터로 받은 내용</td>
			<td>${memberMap.memberList[0].getMid()}</td>
			<td>${memberMap.memberList[0].getMname()}</td>
			<td>${memberMap.memberList[0].getPwd()}</td>
			<td>${memberMap.memberList[0].getEmail()}</td>
			<td>${memberMap.memberList[0].getRegdate()}</td>
		</tr>
		<c:forEach var="mem" items="${memberMap.memberList}" varStatus="loop">
		<tr bgcolor="#cba">
			<c:if test="${loop.first}">
				<td>파라미터로 받은 내용</td>
			</c:if>
			<c:if test="${not loop.first}">
				<td>동적으로 생성된 내용</td>
			</c:if>
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