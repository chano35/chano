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
<c:set var="listlen" value="<%=listx.size()%>" />
    
<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<title>JSTL - taglibs</title>
	<style>
		table, tr, td, th {
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
		<tr bgcolor="lightgray">
			<td align="center" rowspan="2">data</td>
			<td align="center" colspan="4">varStatus</td>
		</tr>
	
		<tr align="center"  bgcolor="lightgray">
			<td>index</td>
			<td>count</td>
			<td>first</td>
			<td>last</td>
		</tr>
		<%--<c:forEach var="data" items="${lists}" varStatus="loop"> --%>
		<c:forEach var="cnt" begin="0" end="${listlen-1}" step="1" varStatus="loop">
		<tr align="center">
			<td>${lists[cnt]}</td>
			<td>${loop.index}</td>
			<td>${loop.count}</td>
			<td>${loop.first}</td>
			<td>${loop.last}</td>
		</tr>
		</c:forEach>
	</table>
</body>
</html>