<%@ page language="java" contentType="text/html; charset=UTF-8"
	import="ebooks.*" import="java.sql.Connection"
	import="java.sql.SQLException" import="java.sql.PreparedStatement"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>책 등록</title>
</head>
<body>
	<%
	request.setCharacterEncoding("utf-8");
	String title = request.getParameter("title");
	String author = request.getParameter("author");
	int price = Integer.parseInt(request.getParameter("price"));
	int qty = Integer.parseInt(request.getParameter("qty"));

	Connection con = null;
	PreparedStatement pstmt = null;
	String sql = " insert into ebook(EB_SERIAL, EB_TITLE, EB_AUTHOR, EB_PRICE, EB_QTY)"
			+ "values(EBOOK_SEQUENCE.nextval, ?, ?, ?, ?)";
	int n = 0;

	try {
		con = DBConnection.getCon();
		pstmt = con.prepareStatement(sql);
		pstmt.setString(1, title);
		pstmt.setString(2, author);
		pstmt.setInt(3, price);
		pstmt.setInt(4, qty);

		n = pstmt.executeUpdate();

	} catch (SQLException e) {
		System.err.println(e);
	} finally {
		try {
			if (pstmt != null)
		pstmt.close();
			if (con != null)
		con.close();

		} catch (SQLException e) {
			System.err.println(e);
		}
	}
	%>
	<script>
		if (
	<%=n%>
		> 0) {
			alert("정상적으로 등록 되었습니다.");
			location.href = "index.jsp";
		} else {
			alert("입력된 정보가 올바르지 않습니다.")
			history.go(-1);
		}
	</script>


</body>
</html>