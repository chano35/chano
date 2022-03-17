<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
	request.setCharacterEncoding("UTF-8");
%>    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Contents - include action tag</title>
</head>
<body>
	<h1>인클루드 액션 태그</h1>
	<p>인클루드 액션 태그를 사용하여 context.jsp 인클루드 예제</p>
	<hr>
	<jsp:include page="content.jsp" flush="true">
		<jsp:param name="content" value="애드벌룬"/>
		<jsp:param name="imagename" value="content.jpg"/>
	</jsp:include>
</body>
</html>