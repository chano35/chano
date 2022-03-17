<%@ page language="java" contentType="text/html; charset=UTF-8"
	isELIgnored="false"
    pageEncoding="UTF-8"%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>    
<c:set var="contextPath" value="${pageContext.request.contextPath}" />

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>도서 리스트</title>
</head>
<body>
	<h1>도서 등록</h1>
	<a href="${contextPath}/ebooksvc.do">도서 서비스로 이동</a>
	<hr>
	<form name="ebookreg" method="post" action="${contextPath}/ebooksvc.do">
		<table>
			<tr>
				<td>제목</td>
				<td><input type="text" name="title"></td>
			</tr>
			
			<tr>
				<td>저자</td>
				<td><input type="text" name="author"></td>
			</tr>
			
			<tr>
				<td>가격</td>
				<td><input type="text" name="price"></td>
			</tr>
			
			<tr>
				<td>수량</td>
				<td><input type="text" name="qty"></td>
			</tr>
		</table>
		<input type="submit" value="도서등록">
		<input type="reset" value="다시입력">
		<input type="hidden" name="svcid" value="addBook"/>
	</form>
</body>
</html>