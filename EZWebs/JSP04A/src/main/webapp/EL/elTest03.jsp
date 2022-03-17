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
	<h3>비교 연산자</h3>
	<hr>
	<div>
		<p>같다(10 == 10): ${10 == 10}</p>
		<p>같다(10 eq 10): ${10 eq 10}</p>
		<p>같다('hello' == 'hello'): ${'hello' == 'hello'}</p>
		<p>같다('hello' == 'world'): ${'hello' == 'world'}</p>
		<p>같지않다('hello' != 'world'): ${'hello' != 'world'}</p>
		<p>같지않다('hello' ne 'world'): ${'hello' ne 'world'}</p>
		<p>크다(20 > 10): ${20 > 10}</p>
		<p>크다(20 gt 10): ${20 gt 10}</p>
		<p>작다(15 < 25): ${15 < 25}</p>
		<p>작다(20 lt 30): ${20 lt 30}</p>
		<p>크거나 같다(50 >= 50): ${50 >= 50}</p>
		<p>크거나 같다(50 ge 50): ${50 ge 50}</p>
		<p>작거나 같다(40 <= 50): ${40 <= 50}</p>
		<p>작거나 같다(40 le 50): ${40 le 50}</p>
	</div>
</body>
</html>