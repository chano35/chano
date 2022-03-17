package hashcode.member;

public class MemberRun2 {

	public static void main(String[] args) {
		Member mem1 = new Member("member");
		Member mem2 = new Member("member");
		Member mem3 = new Member("member3");
		
		System.out.println("[mem1 == mem2] ? " + (mem1 == mem2));	// false
		System.out.println("[mem1 == mem3] ? " + (mem1 == mem3));	// false
		System.out.println("[mem2 == mem3] ? " + (mem2 == mem3));	// false

		// Member.equals()를 오버라이드해서 id의 값으로 비교
		System.out.println("mem1.equals(mem2) ? " + (mem1.equals(mem2)));	// true
		System.out.println("mem1.equals(mem3) ? " + (mem1.equals(mem3)));	// false

	}

}