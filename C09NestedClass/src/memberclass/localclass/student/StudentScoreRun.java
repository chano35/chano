package memberclass.localclass.student;

public class StudentScoreRun {

	public static void main(String[] args) {
		
		Student student = new Student("우등생", "090", 19);
		student.print("중간고사");
		student.printScore(70,80,90);
		
		System.out.println("======================================");
		
		printScore(80,90,100);
	}
	

	static void printScore(int kor, int eng, int math) {
		System.out.println("[StudentScoreRun]");
		
		class Score {
			int kor, eng, math;
			int total;
			float avg;
			
			Score(int kor, int eng, int math) {
				this.kor = kor;
				this.eng = eng;
				this.math = math;
				this.total = this.kor + this.eng + this.math;
				this.avg = this.total / Student.AVG_COUNT;
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

}