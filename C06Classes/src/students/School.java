/*
 * 학교정보 클래스
 */
package students;

public class School {
	int schoolcd;		// 학교코드
	String name;		// 학교이름
	String buildyear;	// 설립년도
	String address;		// 학교주소
	String telno;		// 전화번호

	School() {
	}
	
	public School(String name, String buildyear, String address) {
		this.name = name;
		this.buildyear = buildyear;
		this.address = address;
	}
	
	public void setSchoolCd(int cd) {
		this.schoolcd = cd;
	}
	
	public void setTelno(String telno) {
		this.telno = telno;
	}
	
	public void printSchool() {
		System.out.println("[학교정보]");
		System.out.println("학교코드: " + this.schoolcd);
		System.out.println("학교이름: " + this.name);
		System.out.println("설립년도: " + this.buildyear);
		System.out.println("학교주소: " + this.address);
		System.out.println("전화번호: " + this.telno);
	}
}