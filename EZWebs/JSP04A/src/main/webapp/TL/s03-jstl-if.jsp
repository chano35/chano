<%@ page language="java" contentType="text/html; charset=UTF-8"
	isELIgnored="false"	
	pageEncoding="UTF-8"%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
 
<c:set var="hello" value="Hello, JSTL!!!" scope="page" />
<c:set var="name" value="${'홍길동'}" scope="page" />
<c:set var="age" value="${29}" scope="page" />
    
<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<title>JSTL - taglibs</title>
	<style>
		div {
			background : #ccc;
		}
	</style>
</head>
<body>
	<h1>커스텀 태그 라이브러리 - JSTL</h1>
	<p> 조건식(if)</p>
	<hr>
	<div>
		<p>hello: ${hello}</p>
		<p>name: ${name}</p>
		<p>age: ${age}</p>
	</div>
	
	<div>
		<p>조건식(if) 테스트</p>
		<p>age가 30보다 작으면 청년 크거나 같으면 장년?</p>
		<hr>
		<c:if test="${age < 30}">
			<p>${name}님은 아직 청년(${age})입니다.</p>
		</c:if>
		<c:if test="${age >= 30}">
			<p>${name}님은 장년(${age})입니다.</p>
		</c:if>		
	</div>
</body>
</html>