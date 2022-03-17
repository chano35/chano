<%@ page language="java" contentType="text/html; charset=UTF-8"
	isELIgnored="false"
	import="ebooks.*"
    pageEncoding="UTF-8"%>
    
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>    
<c:set var="contextPath" value="${pageContext.request.contextPath}" />
    
<%
	request.setCharacterEncoding("utf-8");
%>
   
<jsp:useBean id="ebook" class="ebooks.EBookVO" scope="page"/>

<%
	String serial = request.getParameter("serial");
	EBookDAO ebookDAO = new EBookDAO();
	EBookVO book = ebookDAO.getBook(serial);
	ebook.setBook(book);
%>
    
<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<title>도서 상세보기</title>
</head>
<body>

</body>

	<h1>도서 상세보기</h1>
	<table border=1>
	<tr><td>번호</td><td>${ebook.getSerial()}</td></tr>
	<tr><td>타이틀</td><td>${ebook.getTitle()}</td></tr>
	<tr><td>저자</td><td>${ebook.getAuthor()}</td></tr>
	<tr><td>가격</td><td>${ebook.getPrice()}</td></tr>
	<tr><td>수량</td><td>${ebook.getQty()}</td></tr>
	</table>
	<a href='${contextPath}/ebooksvc.do'>도서 서비스</a>
</html>