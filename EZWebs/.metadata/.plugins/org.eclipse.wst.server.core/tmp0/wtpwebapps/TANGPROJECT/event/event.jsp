<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="java.io.PrintWriter" %> 
<%@ page import="event.EventDAO" %>
<%@ page import="event.EventDTO" %> 
<%@ page import="java.util.ArrayList" %>    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width", initial-scale="1">

<title>탕탕탕 프로젝트</title>
	
<link rel="stylesheet" href="../css/bootstrap.min.css">
	<!-- 커스텀 CSS 추가하기 -->
	<link rel="stylesheet" href="../css/custom.css">
<style type="text/css">
     a, a:hover {
         color: #000000;
         text-decoration: none;
     }
</style>
	<meta http-equiv="Content-Type" content= "text/html; charset=UTF-8">
	<meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
</head>
<body>
     <%
          String userID = null;
          if (session.getAttribute("userID") != null) {
        	  userID = (String) session.getAttribute("userID");
          }
          int pageNumber = 1;
          if (request. getParameter("pageNumber") != null) {
        	  pageNumber = Integer.parseInt(request.getParameter("pageNumber"));
          }
     %>
   	<nav class="navbar navbar-expand-lg">
		<a class="navbar-brand" href="../index.jsp"><img src = ../tang.png width=100 height=50></a>
		<button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbar">
			<span class="navbar-toggler-icon"></span>
		</button>
		<div class="collapse navbar-collapse" id="navbar">
			<ul class="navbar-nav mr-auto">
				<li class="nav-item active">
					<a class="nav-link" href="../index.jsp">메인</a>
				</li>
				<li class="nav-item dropdown">
					<a class="nav-link dropdown-toggle" id="dropdown" data-toggle="dropdown">
            		 고객 센터
        			</a>
			        <div class="dropdown-menu" aria-labelledby="dropdown">
			          <a class="dropdown-item" href="event.jsp">이벤트</a>
			          <a class="dropdown-item" href="../notice/notice.jsp">공지사항</a>
			        </div>
		     	</li>
			</ul>

   		<% 
	if(userID == null || userID.equals("")) {
    %>               
	             <form class="form-inline my-2 my-lg-0">
	                <ul class="navbar-nav mr-auto">
	                   <li class="nav-item active">
	                      <a class="nav-link" href="../user/userLogin.jsp" style="color:black;">로그인</a>
	                   </li>              
	                   <li class="nav-item active">
	                      <a class="nav-link" href="../user/userJoin.jsp" style="color:black;">회원가입</a>
	                   </li>  
	                </ul>  
	             </form>
	<%
		} else {
	%>	             
	             <form class="form-inline my-2 my-lg-0">
	                <ul class="navbar-nav mr-auto">
	                   <li class="nav-item active">
	                      <a class="nav-link" href="../user/userLogout.jsp" style="color:black;">로그아웃</a>	              
	                   </li>  
	                </ul>  
	             </form>
	 <%
	}
    %>                  	
		</div>
	</nav>
     <div class="container">
          <div class="row">
              <table class="table table-striped" style="text-align: center; border: 1px solid #dddddd">
                   <thead>
                        <tr>
                            <th style="background-color: #eeeeee; text-align: center;">번호</th>
                            <th style="background-color: #eeeeee; text-align: center;">제목</th>
                            <th style="background-color: #eeeeee; text-align: center;">작성자</th>
                            <th style="background-color: #eeeeee; text-align: center;">작성일</th>                                                 
                        </tr>
                   </thead>
                   <tbody>
                       <% 
                             EventDAO bbsDAO = new EventDAO();
                             ArrayList<EventDTO> list = bbsDAO.getList(pageNumber);
                             for(int i = 0; i < list.size(); i++) {
                       %>                   
                        <tr>
                             <td><%= list.get(i).getE_num() %></td>
                             <td><a href="eventView.jsp?bbsID=<%= list.get(i).getE_num() %>"><%= list.get(i).getE_title().replaceAll(" ", "&nbsp;").replaceAll("<", "&lt;").replaceAll(">", "&gt;").replaceAll("\n", "<br>") %></a></td>
                             <td>관리자</td>
                             <td><%= list.get(i).getE_date().substring(0, 11) + list.get(i).getE_date().substring(11, 13) + "시" + list.get(i).getE_date().substring(14, 16) + "분"%></td>
                        </tr>
                         <% 
                              }                                              
                         %>  
                   </tbody>
              </table>              
             <% 
                 if(pageNumber != 1) {                                                           
              %> 
                 <a href="event.jsp?pageNumber=<%=pageNumber - 1%>" class="btn btn-success btn-arraw-left">이전</a>
              <% 
                 } if(bbsDAO.nextPage(pageNumber + 1)) {                                                         
              %> 
                 <a href="event.jsp?pageNumber=<%=pageNumber + 1%>" class="btn btn-success btn-arraw-left">다음</a>
              <% 
                 }  
              %> 
              <%    
                    try {
                    if (userID.equals("admin")) {
                    	      
              %> 
              
              <a href="eventWrite.jsp" class="btn btn-primary pull-right">글쓰기</a>
             <% 
                 }
                    } catch (Exception e) {
                      e.printStackTrace();
              }
                    
              %> 
              
          </div>
     </div>
     <script src="https://code.jquery.com/jquery-3.1.1.min.js"></script>
     <script type="js/bootstrap.js"></script>
     <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
<!-- Latest compiled and minified JavaScript -->
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js" integrity="sha384-Tc5IQib027qvyjSMfHjOMaLkfuWVxZxUPnCJA7l2mCWNIpG9mGCD8wGNIcPD7Txa" crossorigin="anonymous"></script> 
       <!--  제이쿼리 자바스크립트 추가하기 -->
     <script src="../js/jquery.min.js"></script>
     <!--  파퍼 자바스크립트 추가하기 -->
     <script src="../js/popper.js"></script>
     <!--  부트스트랩 자바스크립트 추가하기 -->
     <script src="../js/bootstrap.min.js"></script>
</body>
</html>