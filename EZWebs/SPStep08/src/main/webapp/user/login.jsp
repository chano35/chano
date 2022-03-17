<%@ page language="java" contentType="text/html; charset=UTF-8"
	isELIgnored="false"
    pageEncoding="UTF-8"%>
    
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<c:set var="contextPath" value="${pageContext.request.contextPath}" />    
    
<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<title>로그인</title>
</head>
<body>
	<h1>로그인</h1>
	<hr>
	<p>${result}</p>
	<a href="${contextPath}/user/memberlist.do">멤버 리스트로 이동</a>
</body>
</html>