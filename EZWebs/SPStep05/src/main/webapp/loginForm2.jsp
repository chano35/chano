<%@ page language="java" contentType="text/html; charset=UTF-8"
	isELIgnored="false"
    pageEncoding="UTF-8"%>
    
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<c:set var="contextPath" value="${pageContext.request.contextPath}" />    
    
<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<title>로그인2 창</title>
	<style>
		table, tr, td {
			background-color: #abc;
		}
	</style>
</head>
<body>
	<form name="loginForm2" method="post" action="${contextPath}/user/login2.do">
		<table>
			<tr>
				<td>아이디</td>
				<td><input type="text" name="userid"></td>
			</tr>
			<tr>
				<td>비밀번호</td>
				<td><input type="password" name="passwd"></td>
			</tr>
			<tr>
				<td><input type="submit" value="로그인"></td>
				<td><input type="reset" value="다시입력"></td>
			</tr>
		</table>
	</form>
</body>
</html>