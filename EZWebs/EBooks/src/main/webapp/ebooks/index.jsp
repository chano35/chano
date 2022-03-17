<%@ page language="java" contentType="text/html; charset=UTF-8"
	import="ebooks.*" import="java.sql.Connection"
	import="java.sql.SQLException" import="java.sql.PreparedStatement"	
	import="java.sql.ResultSet"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>책 리스트</title>
<style>

	table {
		width : 100%;
		border : 1px solid #444444;
		border-collapse: collapse;	
	}
	td {
	border : 1px solid #444444;
	padding : 10px;
	}
	tr{
	text-align: center;
	}

	</style>
</head>
<body>
	<h1 style="text-align:center" >책 리스트</h1>
	<hr>
	<table>
		<tr bgcolor='skyblue'>
			<td>번호</td>
			<td>책 이름</td>
			<td>저자</td>
			<td>가격</td>
			<td>수량</td>
			<td>수정</td>
			<td>삭제</td>
		</tr>
		<%
		Connection con = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		
		try {
			con = DBConnection.getCon();
			String sql = "select * from ebook";
			pstmt = con.prepareStatement(sql);
			rs = pstmt.executeQuery();
			while(rs.next()) {
				int serial = rs.getInt("eb_serial");
				String title = rs.getString("eb_title");
				String author = rs.getString("eb_author");
				int price = rs.getInt("eb_price");
				int qty = rs.getInt("eb_qty");
				%>
				<tr>
					<td><%=serial%></td>
					<td><%=title%></td>
					<td><%=author%></td>
					<td><%=price%></td>
					<td><%=qty%></td>
					<td><a href="update.jsp?serial=<%=serial %>">수정</a></td>
					<td><a href="delete.jsp?serial=<%=serial %>">삭제</a></td>
					
				</tr>
				<%
			}
		} catch (SQLException e) {
			System.err.println(e);
		} finally {
			try {
				if(rs!=null) rs.close();
				if(pstmt!=null) pstmt.close();
				if(con!=null) con.close();
			} catch(SQLException e) {
				System.out.println(e.getMessage());
			}
		}
			
		%>
		
	</table>
	<a href="insert.html">책 등록</a> 

</body>
</html>