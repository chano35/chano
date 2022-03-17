<%@ page language="java" contentType="text/html; charset=UTF-8"
	isELIgnored="false"	
	pageEncoding="UTF-8"%>
<%@ page import="java.util.*" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

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
	<p>토큰처리(forTokens)</p>
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
		
		<c:set var="lists" value="hello, world, hi, welcome!" />
		<c:forTokens var="data" items="${lists}" delims="," varStatus="loop">
		<tr align="center">
			<td>${data}</td>
			<td>${loop.index}</td>
			<td>${loop.count}</td>
			<td>${loop.first}</td>
			<td>${loop.last}</td>
		</tr>
		</c:forTokens>
	</table>
</body>
</html>