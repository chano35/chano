/*
 * [로컬 클래스]
 * - 메소드에서 선언된 클래스
 * - 메소드가 호출되어야 클래스도 사용할 수 있다.
 * - 메소드 호출없이 클래스 밖에서 사용할 수 없다.
 */
package memberclass.localclass.student;

public class Student {
	final static float AVG_COUNT = 3.0f;

	String name;
	String tel;
	int age;
	
	Student() {}
	Student(String name, String tel, int age) {
		this.name = name;
		this.tel = tel;
		this.age = age;
	}

	void info() {
		System.out.printf("@ Student: name(%s), tel(%s) age(%d)\n",	
				this.name, this.tel, this.age);
	}
	
	void printScore(int kor, int eng, int math) {
		class Score {
			int kor, eng, math;
			int total;
			float avg;
			
			Score(int kor, int eng, int math) {
				this.kor = kor;
				this.eng = eng;
				this.math = math;
				this.total = this.kor + this.eng + this.math;
				this.avg = this.total / AVG_COUNT;
			}
			
			void print() {
				System.out.printf(" > 국어:  %d\n", this.kor);
				System.out.printf(" > 영어:  %d\n", this.eng);
				System.out.printf(" > 수학:  %d\n", this.math);
				System.out.printf(" --------------------------------\n");
				System.out.printf(" > 총점:  %d\n", this.total);
				System.out.printf(" > 평균:  %.2f\n", this.avg);
			}
		}
		
		Score score = new Score(kor, eng, math);
		score.print();
	}
			
	void print(String title) {
		System.out.printf("[%s]\n", title);
		System.out.printf("* Student: name(%s), tel(%s) age(%d)\n",	
				this.name, this.tel, this.age);
	}
}