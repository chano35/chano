/*
 * 클래스는 속성과 메소드로 구성
 * 클래스 생성자
 * - 생성자를 정의하지 않으면 컴파일러는 기본생성자를 자동으로 만들어 준다.
 * - 클래스의 생성자는 클래스의 이름과 동일해야 한다.
 * - 생성자를 여러개 만들 수 있지만 파라미터가 달라야 한다.
 * - 생성자는 리턴 타입이 없다. 그러므로 결과를 리턴하지 않는다.
 * - this는 클래스가 객체와 되었을 때 가지고 있는 식별자이다.
 * - 클래스가 사람이면 객체는 홍길동, 이순신처럼 실체이다.
 *   그러므로 객체는 식별할 수 있는 this를 가진다.
 * ------------------------------------------------------------
 * 생성자는 생성(new)될 때 호출되는 메소드(멤버함수)   
 */
package students;

class Student3Main {

	public static void main(String[] args) {
		Student3 kim = new Student3("9999", "김사장", 40);
		
		kim.subject = "경영";
		
		System.out.println("[kim]");
		System.out.println("학번: " + kim.sno);
		System.out.println("이름: " + kim.name);
		System.out.println("학과: " + kim.subject);
		System.out.println("학년: " + kim.major);
		System.out.println("나이: " + kim.age);
	}

}