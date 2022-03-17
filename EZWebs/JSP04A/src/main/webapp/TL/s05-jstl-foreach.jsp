<%@ page language="java" contentType="text/html; charset=UTF-8" 	
	isELIgnored="false"	
	pageEncoding="UTF-8"%>
<%@ page import="java.util.*" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<%
	List<String> listx = new ArrayList<String>();
	listx.add("hello");
	listx.add("world");
	listx.add("welcome!");
%>
    
<c:set var="lists" value="<%=listx%>" />
    
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
	<p>반복문(forEach)</p>
	<hr>
	<table border="1">
		<tr align="center" bgcolor="lightgray">
			<td>메시지</td>
		</tr>
		<c:forEach var="msg" items="${lists}">
		<tr align="center">
			<td>${msg}</td>
		</tr>
		</c:forEach>
	</table>
</body>
</html>