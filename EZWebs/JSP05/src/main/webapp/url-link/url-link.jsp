<%@ page language="java" contentType="text/html; charset=UTF-8"
	isELIgnored="false"
    pageEncoding="UTF-8"%>
    
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>    

<c:url var="memberurl" value="member.jsp">
	<c:param name="mid" value="${'HGD'}" />
	<c:param name="mname" value="${'홍길동'}" />
	<c:param name="pwd" value="${'1234'}" />
	<c:param name="email" value="${'1234@hgd.com'}" />
</c:url>	
    
<%
	request.setCharacterEncoding("UTF-8");
%>    
<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<title>Taglibs - url link</title>
</head>
<body>
	<h1>Taglibs - url link</h1>
	<hr>
	<a href="${memberurl}">멤버정보</a>
</body>
</html>