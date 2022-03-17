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
<title>Taglibs - redirect</title>
</head>
<body>
	<h1>Taglibs - redirect</h1>
	<ul>
		<li>memberForm.html -> redirect.jsp -> member.jsp</li>
		<li>JSP의 request.sendRedirect(...) 해당하므로 GET방식으로 호출된다.</li>
		<li>웹 브라우저를 통해서 member.jsp가 이동되므로 주소가 member.jps로 변경된다.</li>
		<li>전달되는 파라미터가 주소에 표시된다.</li>
	</ul>
	<hr>
	
	<c:redirect url="member.jsp">
		<c:param name="mid" value="${param.mid}" />
		<c:param name="mname" value="${param.mname}" />
		<c:param name="pwd" value="${param.pwd}" />
		<c:param name="email" value="${param.email}" />
	</c:redirect>

</body>
</html>