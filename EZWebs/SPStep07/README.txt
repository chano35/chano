[SPStep07]

Spring Annotation

1. Project
	- Dynamic Web Project
	- Convert To Maven Project
	
2. Spring Annotation
	- <context:component-scan base-package="package-name" />	

3. Spring Bean
	- @Controller : 컨트롤러 
	- @Service : 서비스
	- @Repository : DAO
	- @Component : VO
	
4. URL 요청 처리를 위한 스프링 클래스
	- 4.0.3.RELEASE 버전에서 아래의 빈을 등록하지 않아도 됨 
	- 클래스 레벨에서 @RequestMapping
	  -> @Deprecated 3.2 :   <bean class="org.springframework.web.servlet.mvc.annotation.DefaultAnnotionHandlerMapping" />
	  -> 4.0.3.RELEASE :     <bean class="org.springframework.web.servlet.mvc.method.annotation.RequestMappingHandlerMapping" />
	- 메서드 레벨에서 @RequestMapping
	  -> @Deprecated 3.2 :   <bean class="org.springframework.web.servlet.mvc.annotation.AnnotionMehtodHandlerAdapter" />
	  -> 4.0.3.RELEASE :     <bean class="org.springframework.web.servlet.mvc.method.annotation.RequestMappingHandlerAdapter" />
	
(실행)
http://localhost:8090/SPStep07/hello/hello.do
http://localhost:8090/SPStep07/login/loginform.do

(web.xml) 
한글문제 : @RequestParam을 사용했을 때 한글 깨지는 문제
  <filter>
  	<filter-name>encodingFilter</filter-name>
  	<filter-class>org.springframework.web.filter.CharacterEncodingFilter</filter-class>
  	<init-param>
  		<param-name>encoding</param-name>
  		<param-value>UTF-8</param-value>
  	</init-param>
  </filter>
  
  <filter-mapping>
  	<filter-name>encodingFilter</filter-name>
  	<url-pattern>/*</url-pattern>
  </filter-mapping>

(요청)
@RequestMapping(value="/login/loginform.do", method=RequestMethod.GET)
@RequestMapping(value="/login/login.do", method=RequestMethod.POST)

(파라미터 전달 방법)
@RequestParam("userid") String userid
@RequestParam("username") String username
@RequestParam(value="email", required=false) String email
@RequestParam Map<String, String> params
@ModelAttribute("loginVO") LoginVO loginVO

