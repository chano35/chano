package cloneobject;

public class MemberRun2 {

	public static void main(String[] args) {
		try {
			Member member = new Member("hong", "홍길동", "1234", 30, true);
			Member cloned = member.cloneMember();	// 원본과 같은 새로운 객체를 생성
			Member cloned2 = member.cloneMember2();	// 원본과 같은 새로운 객체를 생성
			Member member2 = member; 				// 객체(member)를 공유
			
			print(member, "원본");
			print(cloned, "사본");
			print(cloned2, "사본2");
			print(member2, "원본2");
			
			cloned.change("ryu", "류현진", "89", 34, true);		// 사본을 변경해도 원본에 영향을 주지 않음
			cloned2.change("lee", "이소정", "2030", 23, true);		// 사본을 변경해도 원본에 영향을 주지 않음
			member2.change("bag", "박소리", "99", 18, false);	// 사본을 변경하면 원본도 함께 변경 됨(같은 객체를 공유)
			System.out.println("---------------------------------------");
			print(member, "원본");
			print(cloned, "사본");
			print(cloned2, "사본2");
			print(member2, "원본2");

		}
		catch(CloneNotSupportedException e) {
			System.out.println("Member object is not supported for clone!!!");
		}
	}
	
	static void print(Member mem, String title) {
		System.out.printf("[%s]\n", title);
		System.out.printf("      id : %s\n", mem.id);
		System.out.printf("    name : %s\n", mem.name);
		System.out.printf("password : %s\n", mem.password);
		System.out.printf("     age : %d\n", mem.age);
		System.out.printf("   adult : %b\n", mem.adult);
		System.out.println();
	}

}