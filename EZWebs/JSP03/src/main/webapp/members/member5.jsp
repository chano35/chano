<%@ page language="java" contentType="text/html; charset=UTF-8"
	import="members.*, java.util.*"
    pageEncoding="UTF-8"%>
    
<%
	request.setCharacterEncoding("UTF-8");
%>
    
<jsp:useBean id="member" class="members.MemberVO" scope="page"/>

<!--
<jsp:setProperty name="member" property="mid" param="mid" />
<jsp:setProperty name="member" property="mname" param="mname" />
<jsp:setProperty name="member" property="pwd" param="pwd" />
<jsp:setProperty name="member" property="email" param="email" />
-->
<!-- param을 생략 가능: 빈속성과 getParameter가 같으면 -->
<jsp:setProperty name="member" property="mid" />
<jsp:setProperty name="member" property="mname" />
<jsp:setProperty name="member" property="pwd" />
<jsp:setProperty name="member" property="email" />

<%
	MemberDAO dao = new MemberDAO();
	dao.insertMember(member);
	
	List<MemberVO> members = dao.getMembers();
	
%>    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>멤버 등록 및 조회</title>
</head>
<body>
	<h1>멤버 등록 및 조회</h1>
	<hr>
	<table>
		<tr bgcolor="88aacc">
			<td>아이디</td>
			<td>이름</td>
			<td>비밀번호</td>
			<td>이메일</td>
			<td>등록일자</td>
		</tr>
<%
	for(int row=0; row < members.size(); row++) {
		MemberVO mem = (MemberVO)members.get(row);
%>
	<tr>
		<td><%=mem.getMid()%></td>
		<td><%=mem.getMname()%></td>
		<td><%=mem.getPwd()%></td>
		<td><%=mem.getEmail()%></td>
		<td><%=mem.getRegdate()%></td>
	</tr>
<%		
	}
%>		
	</table>

</body>
</html>