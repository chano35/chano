/*
 * 클래스는 속성과 메소드로 구성
 */
package students;

class Student1 { // 정의
	// 멤버필드: property(자원), field, attribute(속성)
	String sno;		// 학번
	String name; 	// 이름
	String subject;	// 학과
	int age;		// 나이

	public static void main(String[] args) {
		Student1 noname = new Student1(); // 선언(객체)
		
		System.out.println("학번: " + noname.sno);
		System.out.println("이름: " + noname.name);
		System.out.println("학과: " + noname.subject);
		System.out.println("나이: " + noname.age);
		
		Student1 abc = new Student1();
		System.out.println("학번: " + abc.sno);
		System.out.println("이름: " + abc.name);
		System.out.println("학과: " + abc.subject);
		System.out.println("나이: " + abc.age);
		
		System.out.println("noname == abc ? " + (noname == abc)); // false
		
	}

}