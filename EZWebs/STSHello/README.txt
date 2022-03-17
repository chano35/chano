[STSHello]

스프링 부트 예제

(실행)
http://localhost:9058/hellopage.do

(pom.xml)
<!-- JSP -->
<dependency>
    <groupId>javax.servlet</groupId>
    <artifactId>jstl</artifactId>
	<scope>provided</scope>
</dependency>

<dependency>
    <groupId>org.apache.tomcat.embed</groupId>
    <artifactId>tomcat-embed-jasper</artifactId>
	<scope>provided</scope>
</dependency>
<!-- JSP -->

(src/main/resources/application.properties)		
# 서버 세팅
server.port = 9058

# 뷰 세팅
spring.mvc.view.prefix=/WEB-INF/views/
spring.mvc.view.suffix=.jsp
