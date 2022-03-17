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
	<p>이동경로: loginform5.do -> loginform5.jsp -> login5.do -> login5.jsp</p>
	<p>Model 클래스를 사용</p>
	<p>result값은 Model.addAttribute("result", ...)</p>
	<p>@ModelAttribute("loginVO") or model.addAttribute("loginVO", loginVO)</p>
	<hr>
	<p>result: ${result}</p>
	<p>userid: ${loginVO.userid}</p>
	<p>username: ${loginVO.username}</p>
	<p>email: ${loginVO.email}</p>
</body>
</html>