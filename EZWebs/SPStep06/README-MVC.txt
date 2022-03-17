[MVC]

1. MVC
	- 모델-뷰-컨트롤러
	- Model-View-Controller
	- Model : 데이터
	- View  : UI
	- Controller : 모델과 뷰를 연결, 제어
	
2. 프리젠테이션 계층
	- 사용자 요청, 응답
	- UI(User Interface)를 도메인 모델 사용
	- 유효성 검증
	- 컨트롤러 기능
	- @Controller

3. 서비스 계층
	- 허브 역할
	- 비즈니스 로직 처리(핵심 업무)	
	- 트랜잭션 처리(처리단위, 계좌이체서비스-송금, 이체, 확인)
	- 다른 계층에 인터페이스를 제공
	- @Service
	
4. 데이터 액세스 계층
	- DAO(Data Access Object)
	- 데이터 액세스 로직를 객체화
	- 저장소에 등록, 수정, 삭제, 조회
	- ORM(Object Relational Mapping) : iBatis, MyBatis, Hibernate, JTA, JPA	
	- @Repository
	 	
5. 도메인 모델 클래스
	- VO(Value Object)
	- DTO(Data Transfer Object)
	- 계층간에 데이터 전달을 위한 객체	 	
	- @Component