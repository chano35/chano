<%@ page language="java" contentType="text/html; charset=UTF-8"
	import="ebooks.*" import="java.sql.Connection"
	import="java.sql.SQLException" import="java.sql.PreparedStatement"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<%
	request.setCharacterEncoding("utf-8");
	
	int serial = Integer.parseInt(request.getParameter("serial"));
	String title = request.getParameter("title");
	String author = request.getParameter("author");
	int price = Integer.parseInt(request.getParameter("price"));
	int qty = Integer.parseInt(request.getParameter("qty"));
	
	Connection con = null;
	PreparedStatement pstmt = null;
	String sql = "update ebook set eb_title=?, eb_author=?, eb_price=?, eb_qty=? where eb_serial=?";
	int n = 0;
	
	try {
		con = DBConnection.getCon();
		pstmt = con.prepareStatement(sql);
		pstmt.setString(1, title);
		pstmt.setString(2, author);
		pstmt.setInt(3, price);
		pstmt.setInt(4, qty);
		pstmt.setInt(5, serial);
		
		n = pstmt.executeUpdate();
	} catch (SQLException e) {
		System.out.println(e.getMessage());
	} finally {
		try {

		if(pstmt != null) pstmt.close();
		if(con != null ) con.close();
		} catch (SQLException e) {
			System.out.println(e.getMessage());
		}
	}	
	%>
	<script>
		if(<%=n%> > 0) {
			alert("수정되었습니다.");
			location.href="index.jsp";
			
		} else {
			alert("수정 실패");
			history.go(-1);
		}
	</script>
	
	
</body>
</html>