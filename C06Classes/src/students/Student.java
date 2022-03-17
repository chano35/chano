/*
 * 학생정보 클래스
 */
package students;

class Student {
	String sno;		// 학번
	String name;	// 이름
	String subject; // 학과
	String major;	// 학년
	School school; 	// 학교정보
	
	Student() {
		System.out.println("생성함수: 기본생성자");
	}
	
	Student(Student student) {
		System.out.println("생성함수: 학생객체");
		this.sno = student.sno;
		this.name = student.name;
		this.subject = student.subject;
		this.major = student.major;
		this.school = student.school;
	}

	public Student(String sno, String name, String subject, String major) {
		System.out.println("생성함수: 학생정보");
		this.sno = sno;
		this.name = name;
		this.subject = subject;
		this.major = major;
	}

	public Student(String sno, String name, String subject, String major, School school) {
		System.out.println("생성함수: 학생정보, 학교정보");
		this.sno = sno;
		this.name = name;
		this.subject = subject;
		this.major = major;
		this.school = school;
	}
	
	School getSchool() {
		return this.school;
	}
	
	void setSchool(School school) {
		this.school = school;
	}
	
	void printStudent(String title) {
		System.out.printf("******** [학생정보: %s ] ********\n", title);
		
		if(this.sno == null) {
			System.out.println("학생정보(학번)가 비어 있습니다.");
			return;
		}
		
		System.out.println("학번: " + this.sno);
		System.out.println("이름: " + this.name);
		System.out.println("학과: " + this.subject);
		System.out.println("학년: " + this.major);
		System.out.println("--------------------------------");
		if(this.school == null) {
			System.out.println("학교정보가 없습니다.");
			return;
		}
		// System.out.println("학교정보: " + this.school);
		// System.out.println("학교이름: " + this.school.name);
		this.school.printSchool();
		System.out.println("================================");
	}

}