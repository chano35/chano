[SPStep03]

(Annotation)
1. @Component : 클래스를 자바 빈으로 지정

(Properties)
1. 외부 설정값을 스프링 빈에서 사용
2. 환경설정이나 시스템의 초기 설정값을 지정
3. 자바 소스코드를 수정하지 않고도 다양한 환경에서 사용할 수 있도록 세팅
4. 예제파일: resource/productx.properties
5. 예제소스: ProductX.java, ProductPT.java

(스프링 환경)
1. 스프링 프레임워크 : 5.0.2.RELEASE
2. 스프링 테스트 : 5.0.2.RELEASE
3. JUnit : 4.13.1
4. 서비스용: src/main/resources/context-product.xml
5. 테스트용: src/test/resources/context-product-test.xml
6. GenericXmlApplicationContext context = new GenericXmlApplicationContext("context-product.xml");

(Project)
1. Maven Project
2. New Maven project
	- Create a simple project: check
3. Configure project
	- Group Id: com.spstep03A
	- Artifact Id: SPStep03A


(구조)
- project name
	- src
		- main
			- java
			- resource
		- test
			- java
			- resource
	- target
	- pom.xml

(springframework)
version: 5.0.2
<properties>
	<spring.mavan.artifact.version>5.0.2.RELEASE</spring.mavan.artifact.version>
</properties>


https://mvnrepository.com/artifact/org.springframework/spring-test/5.0.2.RELEASE
 <dependencies>
 
 	<!-- https://mvnrepository.com/artifact/javax.annotation/javax.annotation-api -->
	<dependency>
	    <groupId>javax.annotation</groupId>
	    <artifactId>javax.annotation-api</artifactId>
	    <version>1.3.2</version>
	</dependency>
 
	<!-- https://mvnrepository.com/artifact/org.springframework/spring-context -->
	<dependency>
	    <groupId>org.springframework</groupId>
	    <artifactId>spring-context</artifactId>
	    <version>${spring.mavan.artifact.version}</version>
	</dependency>
	
	<!-- https://mvnrepository.com/artifact/org.springframework/spring-test -->
	<dependency>
	    <groupId>org.springframework</groupId>
	    <artifactId>spring-test</artifactId>
	    <version>${spring.mavan.artifact.version}</version>
	    <scope>test</scope>
	</dependency>
	
	<!-- https://mvnrepository.com/artifact/junit/junit -->
	<dependency>
	    <groupId>junit</groupId>
	    <artifactId>junit</artifactId>
	    <version>4.13.1</version>
	    <scope>test</scope>
	</dependency>
  </dependencies>
--------------------------------------------------------------------------------------
(JUnit)
1. Java에서 독립된 단위테스트(Unit Test)를 지원해주는 프레임워크
2. 단위 테스트(Unit Test)
	- 소스코드의 특정 모듈이 의도한 대로 정확히 작동하는 검증하는 절차
	- 클래스의 메소드에 대한 테스트 케이스(Test Case)를 작성하는 절차
	- JUnit은 보이지 않고 숨겨진 단위 테스트를 도출하여 정형화시켜서 
	  단위 테스트를 쉽게 해주는 테스트 지원 프레임워크
3. 특징
	- TDD 창시자 켄벡(Kent Beck)과 디자인 패턴 저자(Erich Gamma)가 작성
	- 단정(assert) 메서도로 테스트 케이스의 수행 결과를 판별: assertEquals(예상값, 실제값) 	
	- 어노테이션(JUnit4) : @Test, @Before, @After
	- 각 @Test 메서드가 호출될 때 마다 새로운 인스턴스를 생성하여 독립적인 테스트가 이루어 진다.  	
	
(유닛 테스트)
유닛 테스트(unit test)는 컴퓨터 프로그래밍에서 소스 코드의 특정 모듈이 
의도된 대로 정확히 작동하는지 검증하는 절차다. 
즉, 모든 함수와 메소드에 대한 테스트 케이스(Test case)를 작성하는 절차를 말한다. 
이를 통해서 언제라도 코드 변경으로 인해 문제가 발생할 경우, 
단시간 내에 이를 파악하고 바로 잡을 수 있도록 해준다. 
이상적으로, 각 테스트 케이스는 서로 분리되어야 한다. 
이를 위해 가짜 객체(Mock object)를 생성하는 것도 좋은 방법이다. 
유닛 테스트는 (일반적인 테스트와 달리) 개발자(developer) 뿐만 아니라 
보다 더 심도있는 테스트를 위해 테스터(tester)에 의해 수행되기도 한다.	

(TDD)
테스트 주도 개발(Test-driven development TDD)은 매우 짧은 개발 사이클을 반복하는 
소프트웨어 개발 프로세스 중 하나이다.
개발자는 먼저 요구사항을 검증하는 자동화된 테스트 케이스를 작성한다. 
그런 후에, 그 테스트 케이스를 통과하기 위한 최소한의 코드를 생성한다. 
마지막으로 작성한 코드를 표준에 맞도록 리팩토링한다. 
이 기법을 개발했거나 '재발견' 한 것으로 인정되는 Kent Beck은 
2003년에 TDD가 단순한 설계를 장려하고 자신감을 불어넣어준다고 말하였다.

(테스트 지원 어노테이션)
1. @Test
	- 테스트를 수행하는 메서드
	- 각 테스트가 서로 영향을 주지 않고 독립적으로 실행
	- 처리되는 순서는 일반적으로 메소드의 알파벳순이지만 순서가 보장되지 않는다.
	- @Test 처리 결과에 의한 시나리오를 구성하는 것은 바람직하지 않다.
		
2. @Ignore
	- 메서드는 테스트를 수행하지 않음
	
3. @Before
	- @Test 메소드가 수행되기 전에 반드시 실행
	- @Test 메소드에서 공통으로 사용되는 코드를 @Before에 선언

4. @After
	- @Test 메소드가 수행된 후 반드시 실행
	- @Test 메소드가 수행된 후 반드시 후 처리 해야할 코드를 선언

5. @BeforeClass
	- @Test 메소드 보다는 먼저 실행되며 @Test가 여러번 실행이 되더라도 맨 처음 한 번만 실행
	- @Before 이전에 단 한 번만 실행
	- 정적 메소드 선언(static method)

6. @AfterClass
	- @Test 메소드 보다는 나중에 실행되며 @Test가 여러번 실행이 되더라도 맨 마직막 한 번만 실행
	- @After 이후에 단 한 번만 실행 
	- 정적 메소드 선언(static method)
		
(단정 메서드)
- https://javadoc.io/doc/junit/junit/latest/index.html
- org.junit.Assert : 패키지
- assertEquals(expected, actual) : 예상값과 실제값이 같은가?
- assertNotNull(object) : 객체가 널인가?
- assertSame(expected, actual) : 같은가?
- assertTrue(object) : 객체가 참인가?
- assertArrayEquals(expected, actual) : 배열의 값이 같은가?
	 		
(Spring Test)
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations="classpath:context-product-test.xml")

