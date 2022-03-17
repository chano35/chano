<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="event.EventDAO" %>
<%@ page import="java.io.PrintWriter" %>
<% request.setCharacterEncoding("UTF-8"); %> 
<jsp:useBean id="bbs" class="event.EventDTO" scope="page" /> 
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width", initial-scale="1">
<title>탕탕탕 프로젝트</title>
</head>
<body>
     <%  
        String bbsTitle = null;
        String bbsContent = null;
        String userID = null;
        if (request.getParameter("bbsTitle") != null) {
        	bbsTitle = request.getParameter("bbsTitle");
        }
        if (request.getParameter("bbsContent") != null) {
        	bbsContent = request.getParameter("bbsContent");
        }
        if (session.getAttribute("userID") != null) {
      	   userID = (String) session.getAttribute("userID");
         }
        
        if (userID == null || userID.equals("")) {
     	   PrintWriter script = response.getWriter();
     	   script.println("<script>");
     	   script.println("alert('로그인을 하세요.')");
     	   script.println("location.href = '../user/userLogin.jsp'");
     	   script.println("</script>");
        } else {
            if (bbsTitle  == null || bbsTitle.equals("") || bbsContent == null || bbsContent.equals("")) {
            	PrintWriter script = response.getWriter();
            	script.println("<script>");
            	script.println("alert('입력이 안 된 사항이 있습니다.')");
            	script.println("history.back()");
            	script.println("</script>");
            } else {
            	EventDAO bbsDAO = new EventDAO();
                int result  = bbsDAO.write(bbsTitle, bbsContent);
                if (result == -1) {
                	PrintWriter script = response.getWriter();
                	script.println("<script>");
                	script.println("alert('글쓰기에 실패했습니다.')");
                	script.println("history.back()");
                	script.println("</script>");
                }
                else {
                	PrintWriter script = response.getWriter();
                	script.println("<script>");
                	script.println("location.href = 'event.jsp'");
                	script.println("</script>");
                }
            }
        }     
     
     %>

</body>
</html>