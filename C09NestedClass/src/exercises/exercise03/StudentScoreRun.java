package exercises.exercise03;

public class StudentScoreRun {

	public static void main(String[] args) {
		
		printStudent(new Student("우등생", "090", 19));
		
	}
	
	static void printStudent(Student student) {
		student.print("중간고사");
		student.printScore(70,80,90);
	}

}