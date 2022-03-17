package memberclass.staticclass.student;

public class StudentScoreRun {

	public static void main(String[] args) {
		// System.out.println("평균계산을 위한 갯수: " + Student.Score.AVG_COUNT);
		System.out.println("평균계산을 위한 갯수: " + Student.Score.avgcount());
		
		Student student1 = new Student("우등생", "090", 19);
		Student student2 = new Student("차등생", "010", 20);
		
		Student.Score s1 = new Student.Score(student1, 70, 80, 90);
		Student.Score s2 = new Student.Score(student1, 90, 90, 90);
		Student.Score s3 = new Student.Score(student2, 60, 70, 80);

		s1.print("중간고사");
		s2.print("기말고사");
		s3.print("중간고사");

	}

}