package hashcode.member;

public class MemberRun {

	public static void main(String[] args) {
		Member mem1 = new Member("member");
		Member mem2 = new Member("member");
		Member mem3 = new Member("member");
		
		System.out.println(mem1);
		System.out.println(mem1.toString());
		System.out.println(mem2);
		System.out.println(mem3);
	}

}