<%@ page language="java" contentType="text/html; charset=UTF-8"
	import="members.*"
    pageEncoding="UTF-8"%>
<%
	String uid = (String)session.getAttribute("userid");
	if(uid == null) {
		response.sendRedirect("memberlogin.html");
		return;
	}
	request.setCharacterEncoding("UTF-8");
	String mid = (String)request.getParameter("mid");
	
	MemberDAO dao = new MemberDAO();
	MemberVO member = dao.getMember(mid);
%>    
<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<title>멤버 수정</title>
	<style>
		table {
		width : 30%;
		border : 1px solid #444444;
		margin : auto;
	}
	td {
	border : 1px solid #444444;
	padding : 10px;
	}
	tr{
	text-align: center;
	background-color : skyblue;
	}
	</style>
</head>
<body>
	<h1 style="text-align:center">맴버 수정</h1>
	<form name="memberedit" method="post" >
	<table>
		<tr>
			<td>아이디</td>
			<td><input type="text" name="mid" value="<%=member.getMid()%>" readonly></td>
		</tr>
		<tr>
			<td>이름</td>
			<td><input type="text" name="mname" value="<%=member.getMname()%>"></td>
		</tr>
		<tr>
			<td>비밀번호</td>
			<td><input type="text" name="pwd" value="<%=member.getPwd()%>"></td>
		</tr>
		<tr>
			<td>전자메일</td>
			<td><input type="text" name="email" value="<%=member.getEmail()%>"></td>
		</tr>
		<tr>
			<td><input type="submit" value="멤버수정" formaction="membersvc.jsp"></td>
			<td><input type="reset" value="초기값"></td>

		</tr>
	</table>
	<input type="hidden" name="svcid" value="memberupdate">
	<div style="text-align:center; margin-top:10px;"><input type="submit" name="membersvc" value="맴버 서비스" formaction="membersvc.jsp"> </div>
	</form>
</body>
</html>