package memberclass.instanceclass.student;

public class StudentScoreRun {

	public static void main(String[] args) {
		Student student = new Student("우등생", "010", 17);
		student.info();
		
		Student.Score s1 = student.new Score(70, 80, 90);
		System.out.printf(" ] 총점:  %d\n", s1.total());
		System.out.printf(" ] 평균:  %.2f\n", s1.average());
		
		Student.Score s2 = student.new Score(90, 90, 90);
		// student.info(s1);
		// student.info(s2);
		s2.print();

		
		Student student2 = new Student("이등생", "020", 16);
		Student.Score s3 = student2.new Score(60, 70, 80);
		// student2.info(s3); // 우등생 점수가 전달되어 잘못된 내용 출력
		// student2.info(s2);
		s3.print();

	}

}