<%@ page language="java" contentType="text/html; charset=UTF-8"
	isELIgnored="false"
    pageEncoding="UTF-8"%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<%
	request.setCharacterEncoding("UTF-8");
%>
    
<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<title>File Upload</title>
</head>
<body>
	<h1>파일 업로드 예제</h1>
	<hr>
	<form name="fileupload" method="post" action="fileupload" enctype="multipart/form-data">
		<label>업로드 파일선택: <input type="file" name="upfile"/></label><br>
		<label>파일설명: <input type="text" name="filedesc"/></label>
		<input type="submit" value="업로드"/>
	</form>
</body>
</html>