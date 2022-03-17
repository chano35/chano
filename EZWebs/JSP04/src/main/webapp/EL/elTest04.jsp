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
	<h3>논리 연산자</h3>
	<hr>
	<div>
		<p>논리곱(10 == 10) && (10 != 20): ${10 == 10 && 10 != 20}</p>
		<p>논리합(10 == 10) || (10 == 20): ${10 == 10 || 10 == 20}</p>
		<p>부정(!(10 != 20)): ${!(10 != 20)}</p>
		<hr>
		<p>논리곱(10 == 10) and (10 != 20): ${10 == 10 and 10 != 20}</p>
		<p>논리합(10 == 10) or (10 == 20): ${10 == 10 or 10 == 20}</p>
		<p>부정(not(10 != 20)): ${not(10 != 20)}</p>
	</div>
</body>
</html>