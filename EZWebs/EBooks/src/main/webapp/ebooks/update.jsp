<%@page import="org.omg.stub.java.rmi._Remote_Stub"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	import="ebooks.*" import="java.sql.Connection"
	import="java.sql.SQLException" import="java.sql.PreparedStatement"
	import="java.sql.ResultSet" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>책 리스트 정보 변경</title>
<style>
table {
	width: 30%;
	border: 1px solid #444444;
	margin: auto;
}

td {
	border: 1px solid #444444;
	padding: 10px;
}

tr {
	text-align: center;
	background-color: skyblue;
}
</style>
</head>
<body>
	<%
	request.setCharacterEncoding("utf-8");
	int serial = Integer.parseInt(request.getParameter("serial"));

	Connection con = null;
	PreparedStatement pstmt = null;
	ResultSet rs = null;

	try {
		con = DBConnection.getCon();
		String sql = "select * from ebook where eb_serial=?";

		pstmt = con.prepareStatement(sql);
		pstmt.setInt(1, serial);
		rs = pstmt.executeQuery();
		
		String eb_title = "";
		String eb_author = "";
		int eb_price = 0;
		int eb_qty = 0;
		
		if(rs.next()) {
		eb_title = rs.getString("eb_title");
		eb_author = rs.getString("eb_author");
		eb_price = rs.getInt("eb_price");
		eb_qty = rs.getInt("eb_qty");
		
	}
	%>

	<h1 style="text-align: center">책 정보 수정</h1>
	<form name="update" method="post">
		<table>
			<tr>
				<td>책 제목</td>
				<td><input type="text" name="title" value="<%=eb_title%>"></td>
			</tr>
			<tr>
				<td>저자</td>
				<td><input type="text" name="author" value="<%=eb_author%>"></td>
			</tr>
			<tr>
				<td>가격</td>
				<td><input type="text" name="price" value="<%=eb_price%>"></td>
			</tr>
			<tr>
				<td>수량</td>
				<td><input type="text" name="qty" value="<%=eb_qty%>"></td>
			</tr>
			<tr>
				<td colspan="2" align="center">
				<input type="submit" value="정보변경" formaction="updateOk.jsp?serial=<%=serial%>">
				<input type="submit" value="목록" formaction="index.jsp">
				</td>
			</tr>
		</table>
	</form>
	<%
	} catch (SQLException e) {
	System.out.println(e.getMessage());
	} finally {
	try {
		if (rs != null)
			rs.close();
		if (pstmt != null)
			pstmt.close();
		if (con != null)
			con.close();
	} catch (SQLException e) {
		System.out.println(e.getMessage());
	}
	}
	%>

</body>
</html>