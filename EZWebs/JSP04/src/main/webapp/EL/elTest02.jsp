<%@ page language="java" contentType="text/html; charset=UTF-8"
	isELIgnored="false"	
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Expression Language</title>
</head>
<body>
	<h1>Expression Language</h1>
	<p>덧셈에서 문자열과 숫자를 더하면 문자열을 숫자로 변환 후 더함</p>
	<hr>
	<div>
		<p>더하기(문자열 + 숫자): ${'10' + 5}</p>
		<p>더하기(숫자 + 문자열): ${5 + '10'}</p>
		<%--
		<p>더하기(숫자 + 문자열): ${'ABC' + 5}</p>
		 --%>
	</div>
</body>
</html>