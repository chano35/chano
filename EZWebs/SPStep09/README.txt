[SPStep09]

1. Project
	- Dynamic Web Project
	- Properties 
	  > Java Compiler : Java Version 1.8
	  > Project Facets : Java Version 1.8
	- Configure
	  > Convert To Maven Project
	  > pom.xml
	  
2. Tiles(JSP)
	- 버전: 3.0.5
	- 레이아웃을 헤더, 사이드, 하단, 컨텐츠 영역을 
	  분리하여 구성할 수 있도록 제공하는 프레임워크
	- 페이지 레이아웃 구성
	- 공통된 레이아웃 구성

	
3. pox.xml
	<!-- Tiles -->
	<!-- https://mvnrepository.com/artifact/org.apache.tiles/tiles-core -->
	<dependency>
	    <groupId>org.apache.tiles</groupId>
	    <artifactId>tiles-core</artifactId>
	    <version>3.0.8</version>
	</dependency>
	
	<!-- https://mvnrepository.com/artifact/org.apache.tiles/tiles-servlet -->
	<dependency>
	    <groupId>org.apache.tiles</groupId>
	    <artifactId>tiles-servlet</artifactId>
	    <version>3.0.8</version>
	</dependency>

	<!-- https://mvnrepository.com/artifact/org.apache.tiles/tiles-jsp -->
	<dependency>
	    <groupId>org.apache.tiles</groupId>
	    <artifactId>tiles-jsp</artifactId>
	    <version>3.0.8</version>
	</dependency>
	
4. 빈즈 등록 설정 파일
	- 컨피그 : WEB-INF/config/jdbc.properties
	- 스프링 : WEB-INF/spring 
	  -> WEB-INF/spstep09-servlet.xml -> WEB-INF/spring/servlet-context.xml
	  -> WEB-INF/config/context-datasoruce.xml -> WEB-INF/spring/datasoruce-context.xml

5. web.xml
	- 명시적으로 서블릿 컨텍스트 위치와 이름 지정(servlet-context.xml)
	  
  	<servlet>
  		<servlet-name>spstep09</servlet-name>
	  	<servlet-class>org.springframework.web.servlet.DispatcherServlet</servlet-class>
	  	<init-param>
	  		<param-name>contextConfigLocation</param-name>
	  		<param-value>/WEB-INF/spring/servlet-context.xml</param-value>
	  	</init-param>
  		<load-on-startup>1</load-on-startup>
  	</servlet>

6. 타일즈 정의 파일
	- 위치 : src/main/resources
	- 파일 : tiles-member.xml
	- 뷰이름 맵핑 : JSP
	  -> 레이아웃 정의
	  -> 컨트롤러에서 요청된 뷰이름을 연결

(실행)
http://localhost:8090/SPStep09/home.do

