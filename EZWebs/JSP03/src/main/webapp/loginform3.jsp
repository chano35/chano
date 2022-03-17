<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
	request.setCharacterEncoding("UTF-8");
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>로그인</title>
</head>
<body>
	<h1>로그인 처리</h1>
	<p>액션태그 - 포워드</p>
	<p>서버에서 아이디나 패스워드를 입력하지 않으면 다시 현재 폼으로 포워드 처리,
	 	서버에서 메시지를 다시 form으로 전달
	</p>
	<hr>
<%
	String msg = request.getParameter("msg");
	if(msg != null) {
%>
	<p><%=msg%></p>	
	<hr>
<%		
}
%>
	<form name="login" method="post" action="login3.jsp">
		<table>
			<th>로그인</th>
			<tr>
				<td>아이디</td>
				<td><input type="text" name="userid"/></td>
			</tr>
			<tr>
				<td>비밀번호</td>
				<td><input type="password" name="userpw"/></td>
			</tr>
			<tr>
				<td><input type="submit" value="로그인"/></td>
				<td><input type="reset" value="다시입력"/></td>
		</table>
	</form>

</body>
</html>