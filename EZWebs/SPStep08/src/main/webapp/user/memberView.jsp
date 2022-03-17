<%@ page language="java" contentType="text/html; charset=UTF-8"
	isELIgnored="false"
    pageEncoding="UTF-8"%>
    
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<c:set var="contextPath" value="${pageContext.request.contextPath}" />    
    
<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<title>회원 상세조회</title>
	<style>
		table, tr, td {
			border : 1px solid gray;
			border-collapse : collpase;
		}
	</style>
</head>
<body>
		<h1>회원 정보 등록창</h1>
		<table>
			<tr>
				<td><p align="right">아이디</p></td>
				<td>${member.mid}</td>
			</tr>
			<tr>
				<td><p align="right">이름</p></td>
				<td>${member.mname}</td>
			</tr>
			<tr>
				<td><p align="right">비밀번호</p></td>
				<td>${member.pwd}</td>
			</tr>
			<tr>
				<td><p align="right">전자메일</p></td>
				<td>${member.email}</td>
			</tr>
			<tr>
				<td><p align="right">등록일자</p></td>
				<td>${member.regdate}</td>
			</tr>
		</table>

	<a href="${contextPath}/user/memberlist.do">회원목록으로 이동</a>
</body>
</html>