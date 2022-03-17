<%@ page language="java" contentType="text/html; charset=UTF-8"
	isELIgnored="false"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<title>로그인 결과</title>
</head>
<body>
	<h1>로그인 결과</h1>
	<p>이동경로: loginform4.do -> loginform4.jsp -> login4.do -> login4.jsp</p>
	<p>@ModelAttribute("loginVO")를 통해서 파라미터 송.수신</p>
	<hr>
	<p>${result}</p>
	<p>userid: ${loginVO.userid}</p>
	<p>username: ${loginVO.username}</p>
	<p>email: ${loginVO.email}</p>
</body>
</html>