[SPStep06]

1. 프로젝트 생성
	- Dynamic Web Project
	- Configure: Convert to Maven Project  
	- Project Root Directory : pom.xml
	- Spring: Add Spring Project Nature
	
2. 데이터베이스 연동 
	- Spring JDBC
	- Oracle JDBC
	
3. 싱글 요청, 멀티 요청
	- org.springframework.web.servlet.handler.SimpleUrlHandlerMapping
	- org.springframework.web.servlet.mvc.multiaction.MultiActionController	

--------------------------------------------------------------------------
(pom.xml) SPStep05(pom.xml) dependencies -> SPStep06(pom.xml)	

	<properties>
	  	<spring.maven.artifact.version>4.0.3.RELEASE</spring.maven.artifact.version>
	</properties>

   	<!-- https://mvnrepository.com/artifact/javax.annotation/javax.annotation-api -->
	<dependency>
	    <groupId>javax.annotation</groupId>
	    <artifactId>javax.annotation-api</artifactId>
	    <version>1.3.2</version>
	</dependency>
	
	<!-- https://mvnrepository.com/artifact/org.springframework/spring-jdbc -->
	<dependency>
	    <groupId>org.springframework</groupId>
	    <artifactId>spring-jdbc</artifactId>
	    <version>${spring.maven.artifact.version}</version>
	</dependency>
	
	<!-- https://mvnrepository.com/artifact/com.oracle.database.jdbc/ojdbc8 -->
	<dependency>
	    <groupId>com.oracle.database.jdbc</groupId>
	    <artifactId>ojdbc8</artifactId>
	    <version>21.5.0.0</version>
	</dependency>
	
--------------------------------------------------------------------------
(web.xml)
  <servlet-mapping>
  	<servlet-name>spstep06</servlet-name>
  	<url-pattern>*.do</url-pattern>
  </servlet-mapping>
  
  <servlet>
  	<servlet-name>spstep06</servlet-name>
  	<servlet-class>org.springframework.web.servlet.DispatcherServlet</servlet-class>
  	<load-on-startup>1</load-on-startup>
  </servlet>
	
--------------------------------------------------------------------------
(spstep06-servlet.xml) 
- web.xml에 있는 servlet-name 이름과 같아야 한다.
- 전체이름(풀이름) : sevlet-name에 "-servlet.xml"

(jdbc.properties)
jdbc.driverClassName=oracle.jdbc.driver.OracleDriver
jdbc.url="jdbc:oracle:thin:@localhost:1521:orcl"
jdbc.username="SOLUSER"
jdbc.password="SOLUSER"
	
--------------------------------------------------------------------------
(실행)	
http://localhost:8090/SPStep06/user/loginForm.jsp
http://localhost:8090/SPStep06/user/memberForm.jsp
http://localhost:8090/SPStep06/user/memberlist.do

