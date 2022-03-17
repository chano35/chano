<%@ page language="java" contentType="text/html; charset=UTF-8"
	isELIgnored="false"
    pageEncoding="UTF-8"%>
    
<%
	// 스크립트릿(scriptlet)은 표현언어(EL)에서는 인식하지 못함
	String hello = "hello, EL!!!";
%>    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Expression Language</title>
</head>
<body>
	<h1>Expression Language</h1>
	<h3>empty는 비어 있는지 검사해서 비어있으면 true</h3>
	<p>비어 있다는 의미는 다음과 같다</p>
	<ul>
		<li>변수가 유효한지 검사</li>
		<li>변수에 내용이 채워져 있는 검사</li>
		<li>변수의 값이 null인지 검사</li>
	</ul>
	<hr>
	<div>
		<p>표현식(hello): <%=hello%></p>
		<p>표현언어(hello): ${empty hello ? '선언되어 있지 않다' : hello}</p>
		<hr>		
		<p>빈연산자(empty "hello"): ${empty "hello"}</p>
		<p>변수가 선언 되어 있지 않음(empty hello): ${empty hello}</p>
		<p>부정(!(empty hello)): ${!(empty hello)}</p>
		<p>빈연산자(not(empty hello)): ${not(empty hello)}</p>
		<p>빈연산자(empty ""): ${empty ""}</p>
		<p>빈연산자(empty null): ${empty null}</p>
		<p>빈연산자(!(empty null)): ${!(empty null)}</p>
	</div>
</body>
</html>