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
	Connection con = null;
	PreparedStatement pstmt = null;
	
	int serial = Integer.parseInt(request.getParameter("serial"));
	int n = 0;
	
	try {
		con = DBConnection.getCon();
		String sql = "delete from ebook where eb_serial=?";
		pstmt = con.prepareStatement(sql);
		pstmt.setInt(1, serial);
		
		n = pstmt.executeUpdate();
	} catch(SQLException e) {
		System.out.println(e.getMessage());
	} finally {
		if(pstmt != null ) pstmt.close();
		if(con != null) con.close();
	}
	response.sendRedirect("index.jsp");
	
	%>
</body>
</html>