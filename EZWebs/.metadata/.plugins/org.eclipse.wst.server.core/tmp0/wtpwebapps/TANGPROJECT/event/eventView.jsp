<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="java.io.PrintWriter" %> 
<%@ page import="event.EventDTO" %> 
<%@ page import="event.EventDAO" %>    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width", initial-scale="1">
<link rel="stylesheet" href="css/bootstrap.css">
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
</head>
<body>
     <%
          String userID = null;
          if (session.getAttribute("userID") != null) {
        	  userID = (String) session.getAttribute("userID");
          }
          int bbsID = 0;
          if (request.getParameter("bbsID") != null) {
        	  bbsID = Integer.parseInt(request.getParameter("bbsID"));
          }
          if (bbsID == 0) {
        	   PrintWriter script = response.getWriter();
         	   script.println("<script>");
         	   script.println("alert('유효하지 않은 글입니다.')");
         	   script.println("location.href = 'event.jsp'");
         	   script.println("</script>");
          }
          EventDTO bbs = new EventDAO().getBbs(bbsID);
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
                            <th colspan="3" style="background-color: #eeeeee; text-align: center;">게시판 글 보기</th>                                                
                        </tr>
                   </thead>
                   <tbody>
                        <tr>
                            <td style="width: 20%;">글 제목</td>
                            <td colspan="2"><%= bbs.getE_title().replaceAll(" ", "&nbsp;").replaceAll("<", "&lt;").replaceAll(">", "&gt;").replaceAll("\n", "<br>") %></td> <!-- bbs.jsp는 게시글 클릭 전, view.jsp는 게시글 클릭 후 -->
                        </tr>
                         <tr>
                            <td>작성자</td>
                            <td colspan="2">관리자</td>
                        </tr>
                        <tr>
                            <td>작성일자</td>
                            <td colspan="2"><%= bbs.getE_date().substring(0, 11) + bbs.getE_date().substring(11, 13) + "시" + bbs.getE_date().substring(14, 16) + "분" %></td>
                        </tr> 
                        <tr>
                            <td>내용</td>
                            <td colspan="2" style="min-height: 200px; text-align: left;"><%= bbs.getE_text().replaceAll(" ", "&nbsp;").replaceAll("<", "&lt;").replaceAll(">", "&gt;").replaceAll("\n", "<br>") %></td>
                        </tr>                                                                              
                   </tbody>                  
                </table>
                <a href = "event.jsp" class= "btn btn-primary">목록</a>
               <%    
                    try {
                    if (userID.equals("admin")) {
                    	      
               %> 
                        <a href="eventUpdate.jsp?bbsID=<%= bbsID %>" class="btn btn-primary">수정</a>  
                        <a onclick="return confirm('정말로 삭제하시겠습니까?')" href="eventDeleteAction.jsp?bbsID=<%= bbsID %>" class="btn btn-primary">삭제</a>
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