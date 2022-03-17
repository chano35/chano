<%@ page language="java" contentType="text/html; charset=UTF-8"
	isELIgnored="false"
    import="java.util.List"
    import="ebooks.*"
    pageEncoding="UTF-8"%>
    
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>    

<jsp:useBean id="ebookMap" class="java.util.HashMap" />
    
<%
	request.setCharacterEncoding("utf-8");
	ebookMap.put("ebookList", request.getAttribute("ebooks"));
%>

    
<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<title>도서 상세보기</title>
	<style>
		table, tr, td, th {
			border: 1px solid #ccc;
			border-collapse : collapse;
		};
	</style>
</head>
<body>

</body>
	<h1>도서 리스트</h1>
	
	<table border=1>
		<tr align='center' bgcolor='lightgreen'>
		<td>번호</td>
		<td>제목</td>
		<td>저자</td>
		<td>가격</td>
		<td>수량</td>
		<td>삭제</td>
		<td>수정</td>
		</tr>

		<c:forEach var="ebook" items="${ebookMap.ebookList}" varStatus="loop">
		<tr>
		<td><a href='ebookdetail.jsp?serial=${ebook.getSerial()}'>${ebook.getSerial()}</a></td>
		<td>${ebook.getTitle()}</td>
		<td>${ebook.getAuthor()}</td>
		<td>${ebook.getPrice()}</td>
		<td>${ebook.getQty()}</td>
		<td><a href='ebooksvc.jsp?svcid=delBook&serial=${ebook.getSerial()}'>삭제</a></td>
		<td><a href='ebookedit.jsp?serial=${ebook.getSerial()}'>수정</a></td>
		</tr>
		</c:forEach>
	</table>
	<a href='ebookreg.jsp'>도서등록</a>
</html>