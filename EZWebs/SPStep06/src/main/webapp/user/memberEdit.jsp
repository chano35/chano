<%@ page language="java" contentType="text/html; charset=UTF-8"
	isELIgnored="false"
    pageEncoding="UTF-8"%>
    
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<c:set var="contextPath" value="${pageContext.request.contextPath}" />    
    
<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<title>회원정보 수정</title>
</head>
<body>
	<form name="userForm" method="post"  action="${contextPath}/user/memberupdate.do">
		<h1>회원 정보 등록창</h1>
		<table>
			<tr>
				<td><p align="right">아이디</p></td>
				<td><input type="text" name="mid" value="${member.mid}"readonly></td>
			</tr>
			<tr>
				<td><p align="right">이름</p></td>
				<td><input type="text" name="mname" value="${member.mname}"></td>
			</tr>
			<tr>
				<td><p align="right">비밀번호</p></td>
				<td><input type="password" name="pwd" value="${member.pwd}"></td>
			</tr>
			<tr>
				<td><p align="right">전자메일</p></td>
				<td><input type="text" name="email" value="${member.email}"></td>
			</tr>
			<tr>
				<td><p align="right">등록일자</p></td>
				<td><input type="text" name="regdate" value="${member.regdate}" readonly></td>
			</tr>
			<tr>
				<td></td>
				<td>
					<input type="submit" name="회원수정">
					<input type="reset" name="다시입력">
				</td>
			</tr>
		</table>
	</form>

	<a href="${contextPath}/user/memberlist.do">회원목록으로 이동</a>
</body>
</html>