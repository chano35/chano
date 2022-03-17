[Expression Language] 표현언어

1. JSP에서 표현 언어를 사용하려면 페이지 디렉티브(Page directive) 속성에서
	isELIgnored 속성을 false 변경해야 한다.(isELIgnored="false")  
	
	<%@ page language="java" contentType="text/html; charset=UTF-8"
	isELIgnored="false"	
    pageEncoding="UTF-8"%>
	
2. 표현 언어 특징
	- 변수와 연산자를 포함
	- JSP 내장 객체에 저장된 속성이나 자바빈 속성을 출력 가능	
	- JSP 페이지 생성시 기본 설정은 표현 언어를 사용할 없음(기본값은 isELIgnored="true")
	- 사용하기 위해서 다음과 같이 설정해야 한다. (isELIgnored="false")
	
3. 자료형
	- 논리: true, false
	- 정수: +, -, 0~9로 이루어진 값
	- 실수: 소숫점으로 이루어진 값, 지수형
	- 문자열: 작은따옴표('문자열'), 큰따옴표("문자열")
	- 무효값: null
	
4. 연산자
	- 산술연산자: +, -, *, /, %, div, mod
	- 비교연산자: eq(==), ne(!=), gt(>), ge(>=), lt(<), le(<=)
	- 논리연산자:
	  -> 논리곱(&&, and)
	  -> 논리합(||, or)
	  -> 부정(!, not)
	- 빈연산자(empty) : null이거나 비어 있으면 true 반환
	- 조건연산자: 식 ? 참값 : 거짓값

5. 사용예
   ${값}
   ${변수}
   ${표현식}
   		  
=======================================================================
[커스컴 태그]
-----------------------------------------------------------------------
1. JSTL(JSP Standard Tag Library)
2. 다운로드 사이트 : https://tomcat.apache.org/download-taglibs.cgi
3. Jar Files -> Tomcat:/lib
	Impl(taglibs-standard-impl-1.2.5.jar)
	Spec(taglibs-standard-spec-1.2.5.jar)
	EL(taglibs-standard-jstlel-1.2.5.jar)
	Compat(taglibs-standard-compat-1.2.5.jar)

(Core 태그 라이브러리)
1. 변수
	<c:set> : 변수지정
	<c:remove> : 변수제거
   
2. 흐름제어
    <c:if> : 조건문
    <c:choose> : switch문, <c:when> <c:otherwise>
    <c:forEach> : 반복문
    <c:forTokens> 구분자를 이용한 토큰 처리

3. URL 처리        		  
	<c:import> : URL을 이용해서 다른 JSP를 추가
	<c:redirect> : response.sendRedirect()
	<c:url> : 요청 매개변수로부터 url 생성
	
4. 기타 태그
	<c:catch> : 예외처리
	<c:out> : JspWriter를 이용한 출력

5. JSP에서 커스텀 태그 라이브러리 사용하기 위해서 페이지 디렉티브에 선언
	<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
	
6. 사용예
	- 변수선언
		<c:set var="변수명"	value="변수값" scope="변수의 범위 />
	- 변수의 범위
		scope: page, request, session, application
		
	- 흐름제어
		<c:forEach var="변수이름" items="반복객체" begin="시작값" end="마지막값" step="증가값" varStatus="반복상태이름">
			...		
		</c:forEach>
	- 반복상태이름
		varStatus:
			-> index: int, items의 인덱스 번호(0부터 시작), begin 값부터 시작
			-> count: int, 반복 순번, 1부터 시작
			-> first: boolean, 첫 번째 반복 유무
			-> last: boolean, 마지막 반복 유무
			
							


	
	
	