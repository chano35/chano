<%@ page language="java" contentType="text/html; charset=UTF-8"
	isELIgnored="false"
    pageEncoding="UTF-8"%>
    
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<c:set var="contextPath" value="${pageContext.request.contextPath}" />
    
<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<title>사이드</title>
</head>
<body>
	<h3>서브 메뉴</h3>
	<h4>
		<a href="${contextPath}/user/loginform.do">로그인</a><br>
		<a href="${contextPath}/user/memberlist.do">회원정보</a><br>
		<a href="${contextPath}/user/memberform.do">회원등록</a><br>
	</h4>
</body>
</html>