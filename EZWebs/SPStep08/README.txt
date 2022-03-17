[SPStep08]

1. Spring Annotation
	- @Controller : 컨트롤러 
	- @Service : 서비스
	- @Repository : DAO
	- @Component : VO
	
2. JdbcTemplate


3. Project
	- Dynamic Web Project
	- Properties 
	  > Java Compiler : Java Version 1.8
	  > Project Facets : Java Version 1.8
	- Configure
	  > Convert To Maven Project
	  > pom.xml
	  
--------------------------------------------------------------------------------------------
4. web.xml(src/main/webapp/WEB-INF)
	<!-- 한글 -->
  <filter-mapping>
  	<filter-name>encodingFilter</filter-name>
  	<url-pattern>/*</url-pattern>
  </filter-mapping>
  
  <filter>
  	<filter-name>encodingFilter</filter-name>
  	<filter-class>org.springframework.web.filter.CharacterEncodingFilter</filter-class>
  	<init-param>
  		<param-name>encoding</param-name>
  		<param-value>UTF-8</param-value>
  	</init-param>
  </filter>
  
  
  <listener>
  	<listener-class>org.springframework.web.context.ContextLoaderListener</listener-class>
  </listener>

	<context-param>
		<param-name>contextConfigLocation</param-name>
		<param-value>
			/WEB-INF/config/context-datasource.xml
		</param-value>
	</context-param>
  
  <servlet-mapping>
  	<servlet-name>spstep08</servlet-name>
  	<url-pattern>*.do</url-pattern>
  </servlet-mapping>
  
  <servlet>
  	<servlet-name>spstep08</servlet-name>
  	<servlet-class>org.springframework.web.servlet.DispatcherServlet</servlet-class>
  	<load-on-startup>1</load-on-startup>
  </servlet>	  	
  
--------------------------------------------------------------------------------------------
5. spstep08-servlet.xml(src/main/webapp/WEB-INF)  
	<bean id="viewResolver" class="org.springframework.web.servlet.view.InternalResourceViewResolver">
		<property name="viewClass" value="org.springframework.web.servlet.view.JstlView"/>
		<property name="prefix" value="/user/" />
		<property name="suffix" value=".jsp" />
	</bean>
	
	<context:component-scan base-package="com.spstep"></context:component-scan>

6. pom.xml(Maven)
--------------------------------------------------------------------------------------------
  <properties>
  	<spring.maven.artifact.version>4.0.3.RELEASE</spring.maven.artifact.version>
  </properties>


--------------------------------------------------------------------------------------------
(실행)
http://localhost:8090/SPStep08/user/loginform.do


	