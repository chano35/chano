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

class Student3 {
	String sno;
	String name;
	String subject;
	String major;
	int age = 33;
	
	Student3() { // 기본생성자: 파라미터가 없음
		// major = "1학년";
		
		// this는 클래스가 객체와 되었을 때 가지고 있는 식별자
		this.major = "1학년";
		System.out.println("[1] 기본생성자 호출 : this=" + this);
	}
	
	Student3(String sno, String name) {
		System.out.printf("[2] 생성자 호출 : this(%s), sno(%s), name(%s)\n", this, sno, name);
		this.sno = sno;
		this.name = name;
	}

	Student3(String sno, String name, int age) {
		System.out.printf("[3] 생성자 호출 : this(%s), sno(%s), name(%s), age(%d)\n", this, sno, name, age);
		this.sno = sno;
		this.name = name;
		this.age = age;
	}

	public static void main(String[] args) {
		Student3 noname = new Student3("1000", "홍길동");
		
		// noname.sno = "1000"; 
		// noname.name = "홍길동";
		noname.age = 34;
		noname.subject = "컴공";
		
		System.out.println("[noname]");
		System.out.println("학번: " + noname.sno);
		System.out.println("이름: " + noname.name);
		System.out.println("학과: " + noname.subject);
		System.out.println("학년: " + noname.major);
		System.out.println("나이: " + noname.age);
		
		// Student3 abc = new Student3("2000", "이사랑", 24);
		Student3 abc = new Student3("2000", "이사랑", 24);
		
		// abc.sno = "2000";
		// abc.name = "김박사";
		abc.subject = noname.subject;
		
		System.out.println("[abc]");
		System.out.println("학번: " + abc.sno);
		System.out.println("이름: " + abc.name);
		System.out.println("학과: " + abc.subject);
		System.out.println("학년: " + abc.major);
		System.out.println("나이: " + abc.age);
		
		
		System.out.println("담긴 내용이 같아도 개별적으로 생성(new)하면 다른 객체이다.");
		System.out.println("noname == abc ? " + (noname == abc)); // false
		
	}

}