package memberclass.instanceclass.student;

public class Student {
	String name;
	String tel;
	int age;
	
	class Score {
		int kor, eng, math;
		Score() {}
		Score(int kor, int eng, int math) {
			this.kor = kor;
			this.eng = eng;
			this.math = math;
		}
		
		int total() {
			return this.kor + this.eng + this.math;
		}
		
		float average() {
			return (this.kor + this.eng + this.math) / 3.0f;
		}
		
		void print() {
			System.out.printf("# Student: name(%s), tel(%s) age(%d)\n",
					Student.this.name, Student.this.tel, Student.this.age);
			
			System.out.printf(" > 총점:  %d\n", total());
			System.out.printf(" > 평균:  %.2f\n", average());
		}

	}
	
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
	
	/*
	 * Student와 Score 객체가 일치 하지 않을 가능성이 있다.
	void info(Score score) {
		System.out.printf("$ Student: name(%s), tel(%s) age(%d)\n",
				Student.this.name, Student.this.tel, Student.this.age);
		
		System.out.printf(" > 총점:  %d\n", score.total());
		System.out.printf(" > 평균:  %.2f\n", score.average());
	}
	*/

}