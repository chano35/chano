[Expression Language Built-In Object]

표현언어에서 사용할 수 있는 객체

1. applicationScope
	- JSP의 application 객체에 해당

2. sessionScope
	- JSP session 객체에 해당
	
3. requestScope
	- JSP request 객체에 해당
	- 예제)
	  -> memberForm2.html
	  -> member2.jsp

4. pageScope
	- JSP의 page 객체에 해당
	
5. param
	- JSP의 request.getParameter() 메소드에 해당	
   
6. paramValues
	- JSP의 request.getParamterValues() 메소드에 해당   
   
7. 액션태그의 유즈빈(useBean)을 사용하면 표현식과 표현언어에서 사용할 수 있다.
	- 예제)
	  -> memberForm3.html
	  -> member3.jsp

   