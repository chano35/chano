package cloneobject;

public class MemberRun {

	public static void main(String[] args) {
		try {
			Member member = new Member("hong", "홍길동", "1234", 30, true);
			Member cloned = member.cloneMember();
			
			Member member2 = member;
			
			print(member, "원본");
			print(cloned, "사본");

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