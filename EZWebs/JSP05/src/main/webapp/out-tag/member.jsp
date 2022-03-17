<%@ page language="java" contentType="text/html; charset=UTF-8"
	import="members.*, java.util.*"
	isELIgnored="false"
    pageEncoding="UTF-8"%>

<%
	request.setCharacterEncoding("UTF-8");
%>
    
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<jsp:useBean id="memberVO" class="members.MemberVO"/>
<jsp:setProperty name="memberVO" property="*"/>    
    
<%
	MemberDAO dao = new MemberDAO();
	dao.insertMember(memberVO);
	
	List<MemberVO> memberList = dao.getMembers();
	request.setAttribute("memberList", memberList);
%>    

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>out tags</title>
</head>
<body>
	<h1>멤버등록</h1>
	<p>이동경로: memberForm.html -> member.jsp -> memberlist.jsp</p>
	<p>forward로 memberlist.jsp에 멤버목록 전달</p>
	<hr>
	<jsp:forward page="memberlist.jsp"/>
</body>
</html>