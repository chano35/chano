<%@ page language="java" contentType="text/html; charset=UTF-8"
	isELIgnored="false"
    pageEncoding="UTF-8"%>
    
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<c:set var="contextPath" value="${pageContext.request.contextPath}"/>
    
<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<title>로그인 창</title>
</head>
<body>
	<form method="post" action="${contextPath}/login/login3.do">
		<table width="300">
			<tr>
				<td width="150">아이디</td>
				<td width="150"><input type="text" name="userid"></td>
			</tr>
			<tr>
				<td>이름</td>
				<td><input type="text" name="username"></td>
			</tr>
			<tr>
				<td>전자메일</td>
				<td><input type="text" name="email"></td>
			</tr>
			<tr>
				<td colspan="2" align="center">
					<input type="submit" value="로그인">
					<input type="reset" value="다시입력">
				</td>
			</tr>
		</table>
	</form>

</body>
</html>