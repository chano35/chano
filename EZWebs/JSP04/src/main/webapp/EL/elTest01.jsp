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
	<p>isELIgnored="false"</p>
	<hr>
	<div>
		<p>정수: ${1234}</p>
		<p>더하기: ${10 + 5}</p>
		<p>빼기:   ${10 - 3}</p>
		<p>곱하기: ${10 * 3}</p>
		<p>나누기: ${10 / 3}</p>
		<p>나머지: ${10 % 3}</p>
		<p>나누기: ${10 div 3}</p>
		<p>나머지: ${10 mod 3}</p>
		<hr>
		<p>문자열: ${"Hello, EL!!!" }</p>
		<p>문자열: ${'Hello, EL!!!' }</p>
	</div>
</body>
</html>