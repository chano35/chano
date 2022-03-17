<%@ page language="java" contentType="text/html; charset=UTF-8"
	isELIgnored="false"	
	pageEncoding="UTF-8"%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<%--<c:set var="id" value="" scope="page" />--%>
<c:set var="id" value="" scope="page" />
<%--<c:set var="id" value="HGD" scope="page" />--%>

<c:set var="name" value="${'홍길동'}" scope="page" />
<c:set var="age" value="${29}" scope="page" />
<c:set var="height" value="${190}" scope="page" />
    
<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<title>JSTL - taglibs</title>
	<style>
		table, td, th {
			border : 1px solod #ccc;
			border-collapse: collapse;
		}
	</style>
</head>
<body>
	<h1>커스텀 태그 라이브러리 - JSTL</h1>
	<p>선택문(choose)</p>
	<hr>
	<table border="1">
		<tr align="center" bgcolor="lightgray">
			<td>아이디</td>
			<td>이름</td>
			<td>나이</td>
			<td>신장</td>
		</tr>
		<c:choose>
		<c:when test="${empty id}">
		<tr align="center">
			<td colspan=4>아이디가 없습니다.</td>
		</tr>
		</c:when>		
		<c:otherwise>		
		<tr align="center">
			<td>${id}</td>
			<td>${name}</td>
			<td>${age}</td>
			<td>${height}</td>
		</tr>
		</c:otherwise>
		</c:choose>
	</table>
</body>
</html>