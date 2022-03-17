[액션 태그]

1. 인클루드 액션 태그(include)
    - JSP 포함
    - <jsp:include>
	<jsp:include page="content.jsp" flush="true">
		<jsp:param name="content" value="애드벌룬"/>
		<jsp:param name="imagename" value="content.jpg"/>
	</jsp:include>


2. 포워드 액션 태그
   - RequestDispatcher 포워드
   - <jsp:forward>
   	<jsp:forward page="loginform3.jsp">
		<jsp:param name="msg" value="<%=msg%>"/>
	</jsp:forward>
   
   
3. 유즈빈 액션 태그
   - 자바의 new 연산자를 대신하는 태그
   - 인자가 없는 생성자를 가져야 한다. (디폴트 생성자)
   - <jsp:useBean>
   
4. Set 포로퍼티 액션 태그(Set Property)
   - 자바의 세터(setter)
   - 첫 글자는 소문자
   - <jsp:setProperty>
   
5. Get 프로퍼티 액션 태그
   - 자바의 getter
   - 첫 글자는 소문자
   - <jsp:getProperty>       
   
<jsp:useBean id="member" class="members.MemberVO" scope="page"/>
<jsp:setProperty name="member" property="mid" value='<%=request.getParameter("mid")%>' />
<jsp:setProperty name="member" property="mname" value='<%=request.getParameter("mname")%>' />
<jsp:setProperty name="member" property="pwd" value='<%=request.getParameter("pwd")%>' />
<jsp:setProperty name="member" property="email" value='<%=request.getParameter("email")%>' />
   
   
<!-- 빈 생성 -->    
<jsp:useBean id="member" class="members.MemberVO" scope="page"/>
   
<jsp:setProperty name="member" property="mid" />
<jsp:setProperty name="member" property="mname" />
<jsp:setProperty name="member" property="pwd" />
<jsp:setProperty name="member" property="email" />

<jsp:setProperty name="member" property="*" />


<tr> <!-- 빈에서 값을 참조 -->
	<td><jsp:getProperty name="member" property="mid"/></td>
	<td><jsp:getProperty name="member" property="mname"/></td>
	<td><jsp:getProperty name="member" property="pwd"/></td>
	<td><jsp:getProperty name="member" property="email"/></td>
	<td><jsp:getProperty name="member" property="regdate"/></td>
</tr>
