<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ page import="java.io.PrintWriter" %>
<%@ page import="member.MemberDAO" %>
<%@ page import="java.util.ArrayList" %>
<%@ page import="java.net.URLEncoder" %>
<!doctype html>
<html>
<head>
	<meta http-equiv="Content-Type" content= "text/html; charset=UTF-8">
	<meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
	<title>탕탕탕 프로젝트</title>
	<!-- 부트스트랩 CSS 추가하기 -->
	<link rel="stylesheet" href="./css/bootstrap.min.css">
	<!-- 커스텀 CSS 추가하기 -->
	<link rel="stylesheet" href="./css/custom.css">
</head>
<body>
<% 
	request.setCharacterEncoding("UTF-8");
	String lectureDivide = "전체";
	String searchType = "최신순";
	String search = "";
	int pageNumber = 0;
	if(request.getParameter("lectureDivide")!= null){
		lectureDivide = request.getParameter("lectureDivide"); 
	}
	if(request.getParameter("searchType")!= null){
		searchType = request.getParameter("searchType"); 
	}
	if(request.getParameter("search")!= null){
		search = request.getParameter("search"); 
	}
	if(request.getParameter("pageNumber")!= null){
		try{
		pageNumber = Integer.parseInt(request.getParameter("pageNumber")); 
		} catch(Exception e){
			System.out.println("검색 페이지 번호 오류");
		}
	}
	
	String userID = null;
	if(session.getAttribute("userID") != null){
		userID = (String) session.getAttribute("userID");
	}
	
%>
	<nav class="navbar navbar-expand-lg">
		<a class="navbar-brand" href="index.jsp"><img src = tang.png width=100 height=50></a>
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
			          <a class="dropdown-item" href="event/event.jsp">이벤트</a>
			          <a class="dropdown-item" href="notice/notice.jsp">공지사항</a>
			        </div>
		     	</li>
			</ul>

   		<% 
	if(userID == null || userID.equals("")) {
    %>               
	             <form class="form-inline my-2 my-lg-0">
	                <ul class="navbar-nav mr-auto">
	                   <li class="nav-item active">
	                      <a class="nav-link" href="user/userLogin.jsp" style="color:black;">로그인</a>
	                   </li>              
	                   <li class="nav-item active">
	                      <a class="nav-link" href="user/userJoin.jsp" style="color:black;">회원가입</a>
	                   </li>  
	                </ul>  
	             </form>
	<%
		} else {
	%>	             
	             <form class="form-inline my-2 my-lg-0">
	                <ul class="navbar-nav mr-auto">
	                   <li class="nav-item active">
	                      <a class="nav-link" href="user/userLogout.jsp" style="color:black;">로그아웃</a>	              
	                   </li>  
	                </ul>  
	             </form>
	 <%
	}
    %>                  	
		</div>
	</nav>
	<section class="container mt-3" style = "max-width: 560px;">
	메인 페이지
	</section>
	
	<footer class="bg-dark mt-4 p-5 text-center" style="color: #FFFFFF;">
			Copyright &copy; 2022 3팀 All Rights Reserved.
	</footer>
	
	
	
	<!-- 제이쿼리 자바스크립트 추가하기 -->
	<script src ="./js/jquery.min.js"></script>	
	<!-- 파퍼 자바스크립트 추가하기 -->	
	<script src ="./js/popper.min.js"></script>
	<!-- 부트스트랩 자바스크립트 추가하기 -->
	<script src ="./js/bootstrap.min.js"></script>
</body>
</html>