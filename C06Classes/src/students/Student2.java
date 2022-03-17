/*
 * 클래스는 속성과 메소드로 구성
 */
package students;

class Student2 {
	String sno;
	String name;
	String subject;
	String major = "1학년"; // 공통적으로 적용되는 내용은 초기값을 지정할 수 있다.
	int age = 33;

	public static void main(String[] args) {
		Student2 noname = new Student2();
		
		noname.sno = "1000"; 
		noname.name = "홍길동";
		noname.age = 34;
		noname.subject = "컴공";
		
		System.out.println("[noname]");
		System.out.println("학번: " + noname.sno);
		System.out.println("이름: " + noname.name);
		System.out.println("학과: " + noname.subject);
		System.out.println("학년: " + noname.major);
		System.out.println("나이: " + noname.age);
		
		Student2 abc = new Student2();
		
		abc.sno = "2000";
		abc.name = "김박사";
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