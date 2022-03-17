<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="notice.NoticeDAO" %>
<%@ page import="notice.NoticeDTO" %>
<%@ page import="java.io.PrintWriter" %>
<% request.setCharacterEncoding("UTF-8"); %> 
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width", initial-scale="1">
<title>탕탕탕 프로젝트</title>
</head>
<body>
     <%
        String userID = null;
        if (session.getAttribute("userID") != null) {
     	   userID = (String) session.getAttribute("userID");
        }
        if (userID == null) {
     	   PrintWriter script = response.getWriter();
     	   script.println("<script>");
     	   script.println("alert('로그인을 하세요.')");
     	   script.println("location.href = '../user/userLogin.jsp'");
     	   script.println("</script>");
        } 
        int bbsID = 0;
        if (request.getParameter("bbsID") != null) {
      	  bbsID = Integer.parseInt(request.getParameter("bbsID"));
        }
        if (bbsID == 0) {
      	   PrintWriter script = response.getWriter();
       	   script.println("<script>");
       	   script.println("alert('유효하지 않은 글입니다.')");
       	   script.println("location.href = 'notice.jsp'");
       	   script.println("</script>");
        }
        
       //권한 체크 했기 때문에 비회원은 주소에 http://localhost:8080/BBS/deleteAction.jsp?bbsID=14 써도 삭제 불가능
        NoticeDTO bbs = new NoticeDAO().getBbs(bbsID);
        if (!userID.equals("admin")) {
      	  PrintWriter script = response.getWriter();
      	   script.println("<script>");
      	   script.println("alert('권한이 없습니다.')");
      	   script.println("location.href = 'notice.jsp'");
      	   script.println("</script>");
      	  
        } else {          
        	NoticeDAO bbsDAO = new NoticeDAO();
            int result = bbsDAO.delete(bbsID);
            if (result == -1) {
            	PrintWriter script = response.getWriter();
            	script.println("<script>");
            	script.println("alert('글 삭제에 실패했습니다.')");
            	script.println("history.back()");
            	script.println("</script>");
            }
          //글 성공적 삭제
            else {
            	PrintWriter script = response.getWriter(); 
            	script.println("<script>");
            	script.println("location.href = 'notice.jsp'");
            	script.println("</script>");
            }
            
        }
     
     %>

</body>
</html>