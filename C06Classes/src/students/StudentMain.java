package students;

public class StudentMain {

	public static void main(String[] args) {
		// Student student = new Student();
		// Student student = new Student("1234", "박찬호", "체육학과",	"4학년");
		
		School school = new School("경기대", "1970", "경기도 수원시");
		Student student = new Student("1234", 
				"박찬호", 
				"체육학과", 
				"4학년", 
				school);
		// student.printStudent("student");
		
		Student student2 = new Student(student);
		// student2.printStudent("student2");
		
		// student2.school이 새로운 객체로 변경되었기 때문에
		// 학교정보 객체가 변경도어 서로 다르다.
		// 그러므로 school2.setTenNo()로 전화번호를 변경시키면
		// student2만 변경된다.
		// student.school != student2.school
		student2.setSchool(new School("서울대", "1960", "서울시 관악구"));
		School school2 = student2.getSchool();
		school2.setSchoolCd(7); 			// 학교코드
		school2.setTelno("02-0001-0001"); 	// 학교전화번호
		
		// 속성에 직접접근하는 것 보다는 메소드를 통해서 접근
		// School school3 = student2.school;
		// school3.setTelno("02-0001-0001");
		// student2.school.telno = "02-0002-0002";
		
		System.out.println("********************************");
		student.printStudent("student");
		student2.printStudent("student2");
		
		System.out.println("THE END");
	}

}