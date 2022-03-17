<%@ page language="java" contentType="text/html; charset=UTF-8"
	import="members.*"
	import="java.util.List"
    pageEncoding="UTF-8"%>
<%
	String uid = (String)session.getAttribute("userid");
	if(uid == null) {
		response.sendRedirect("memberlogin.html");
		return;
	}
	request.setCharacterEncoding("UTF-8");
	MemberDAO dao = new MemberDAO();
	List<MemberVO> members = dao.getMembers();
%>    
<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<title>멤버 리스트</title>
	<style>
	table {
		width : 100%;
		border : 1px solid #444444;
		border-colleapse: collapse;
	}
	td {
	border : 1px solid #444444;
	padding : 10px;
	}
	tr{
	text-align: center;
	}
	</style>
</head>
<body>
	<h1 style="text-align:center" >멤버 리스트</h1>
	<hr>
	<table>
		<tr bgcolor='skyblue'>
			<td>아이디</td>
			<td>이름</td>
			<td>비밀번호</td>
			<td>이메일</td>
			<td>등록일자</td>
			<td>수정</td>
			<td>삭제</td>
		</tr>
		
<%
for(int cnt=0; cnt < members.size(); cnt++) {
	MemberVO mem = (MemberVO)members.get(cnt);
%>
		<tr>
			<td><a href="membersvc.jsp?svcid=memberdetail&mid=<%=mem.getMid()%>"><%=mem.getMid()%></a></td>
			<td><%=mem.getMname()%></td>
			<td><%=mem.getPwd()%></td>
			<td><%=mem.getEmail()%></td>
			<td><%=mem.getRegdate()%></td>
			<td><a href="membersvc.jsp?svcid=memberedit&mid=<%=mem.getMid()%>">수정</a></td>
			<td><a href="membersvc.jsp?svcid=memberdel&mid=<%=mem.getMid()%>">삭제</a></td>
		</tr>
<%}%>		
	</table>
	<form><input style="margin-top: 10px; width:150px; height:50px; background-color : skyblue; font-size:20px;" 
	type="submit" value="맴버등록" formaction="memberreg.html">
	</form>
</body>
</html>