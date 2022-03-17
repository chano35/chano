<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="java.io.PrintWriter" %>    
<!DOCTYPE html>
<html>
<head>
	<meta http-equiv="Content-Type" content= "text/html; charset=UTF-8">
	<meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
	<title>탕탕탕 프로젝트</title>
	<!-- 부트스트랩 CSS 추가하기 -->
	<link rel="stylesheet" href="../css/bootstrap.min.css">
	<!-- 커스텀 CSS 추가하기 -->
	<link rel="stylesheet" href="../css/custom.css">
</head>
<body>
     <%
          String userID = null;
          if (session.getAttribute("userID") != null) {
        	  userID = (String) session.getAttribute("userID");
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
					<a class="nav-link" href="index.jsp">메인</a>
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
              <form method="post" action="eventWriteAction.jsp">
                <table class="table table-striped" style="text-align: center; border: 1px solid #dddddd">
                   <thead>
                        <tr>
                            <th colspan="2" style="background-color: #eeeeee; text-align: center;">게시판 글쓰기 양식</th>                                                
                        </tr>
                   </thead>
                   <tbody>
                        <tr>
                            <td><input type="text" class="form-control" placeholder="글 제목" name="bbsTitle" maxlength="50"></td>
                        </tr>                                                      
                        <tr>
                            <td><textarea class="form-control" placeholder="글 내용" name="bbsContent" maxlength="2048" style="height: 350px;"></textarea></td> 
                        </tr>
                   </tbody>                  
                </table>
                <input type="submit" class="btn btn-primary pull-right" value="글쓰기">   
              </form>         
                     
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