<%@ page language="java" contentType="text/html; charset=UTF-8"
	isELIgnored="false"
    pageEncoding="UTF-8"%>
    
<%@ taglib prefix="tiles" uri="http://tiles.apache.org/tags-tiles" %>    
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<c:set var="contextPath" value="${pageContext.request.contextPath}" />
    
<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<title><tiles:insertAttribute name="title"/></title>
	<style>
		#container {
			width: 100%;
			margin: 0px auto;
			text-align: center;
			border: 0px solid #cacaca;
		}
		
		#header {
			padding : 4px;
			margin-bottom : 4px;
			border : 0px solid #acacac;
			background-color: #778899;
		}
		
		#sidebar-left {
			width: 15%;
			height: 80%;
			padding: 4px;
			margin-right: 4px;
			margin-bottom: 4px;
			float: left;
			background-color: darkgreen;
			border: 0px solid #dcacfc;
			font-size: 12px;
		}
		
		#content {
			width: 80%;
			padding: 4px;
			float: left;
			border: 0px solid #afafaf;
		}
		
		#footer {
			clear: both;
			padding: 4px;
			border: 0px solid #babcbd;
			background-color: darkgreen;
		}
	</style>
</head>
<body>
	<div id="container">
		<div id="header">
			<tiles:insertAttribute name="header" />
		</div>
		
		<div id='sidebar-left'>
			<tiles:insertAttribute name="side" />
		</div>
		
		<div id="content">
			<tiles:insertAttribute name="body" />
		</div>
		
		<div id="footer">
			<tiles:insertAttribute name="footer" />
		</div>
	</div>

</body>
</html>