/*
 * 정적 멤버 클래스
 * - 클래스 Student가 객체화 되지 않아도 독립적으로 클래스 Score를 생성할 수 있다.
 */
package memberclass.staticclass.student;

public class Student {
	String name;
	String tel;
	int age;
	
	static class Score {
		private static float AVG_COUNT = 3.0f;
		int kor, eng, math;
		private Student student;
		
		Score(Student student) {
			this.student = student;
		}
		
		Score(Student student, int kor, int eng, int math) {
			this.student = student;
			this.kor = kor;
			this.eng = eng;
			this.math = math;
		}
		
		static float avgcount() {
			return AVG_COUNT;
		}
		
		int total() {
			return this.kor + this.eng + this.math;
		}
		
		float average() {
			return (this.kor + this.eng + this.math) / AVG_COUNT;
		}
		
		void print(String title) {
			System.out.printf("[%s]\n", title);
			System.out.printf("* Student: name(%s), tel(%s) age(%d)\n",	
					this.student.name, this.student.tel, this.student.age);
			System.out.printf(" > 국어:  %d\n", this.kor);
			System.out.printf(" > 영어:  %d\n", this.eng);
			System.out.printf(" > 수학:  %d\n", this.math);
			System.out.printf(" --------------------------------\n");
			System.out.printf(" > 총점:  %d\n", total());
			System.out.printf(" > 평균:  %.2f\n", average());
			System.out.println();
		}

	}
	
	Student() {}
	Student(String name, String tel, int age) {
		this.name = name;
		this.tel = tel;
		this.age = age;
	}

	void info() {
		System.out.printf("@ Student: name(%s), tel(%s) age(%d)\n",	this.name, this.tel, this.age);
	}
}