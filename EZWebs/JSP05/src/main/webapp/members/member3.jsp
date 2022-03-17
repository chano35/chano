<%@ page language="java" contentType="text/html; charset=UTF-8"
	import="members.*, java.util.*"
	isELIgnored="false"
    pageEncoding="UTF-8"%>

<%
	request.setCharacterEncoding("UTF-8");
%>
    
<jsp:useBean id="member" class="members.MemberVO" scope="page"/>
<jsp:setProperty name="member" property="*" />

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>멤버 등록 및 조회</title>
</head>
<body>
	<h1>멤버 등록 및 조회</h1>
	<p>액션태그의 유즈빈(useBean)을 사용하면 표현식과 표현언어에서 사용할 수 있다.</p>
	<hr>
	<table>
		<tr bgcolor="88aacc">
			<td>아이디</td>
			<td>이름</td>
			<td>비밀번호</td>
			<td>이메일</td>
			<td>등록일자</td>
		</tr>
		<tr>
			<td><%=member.getMid()%></td>
			<td><%=member.getMname()%></td>
			<td><%=member.getPwd()%></td>
			<td><%=member.getEmail()%></td>
			<td><%=member.getRegdate()%></td>
		</tr>
		<tr>
			<td>${member.getMid()}</td>
			<td>${member.getMname()}</td>
			<td>${member.getPwd()}</td>
			<td>${member.getEmail()}</td>
			<td>${member.getRegdate()}</td>
		</tr>
	</table>

</body>
</html>