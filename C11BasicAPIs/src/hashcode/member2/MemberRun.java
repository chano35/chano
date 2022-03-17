package hashcode.member2;

public class MemberRun {

	public static void main(String[] args) {
		Member mem1 = new Member("mem1", 30);
		Member mem2 = new Member("mem1", 30);
		Member mem3 = new Member("mem1", 32);
		
		System.out.println("[mem1 == mem2] ? " + (mem1 == mem2));	// false
		System.out.println("[mem1 == mem3] ? " + (mem1 == mem3));	// false
		System.out.println("[mem2 == mem3] ? " + (mem2 == mem3));	// false

		// Member.equals()를 오버라이드해서 id, age의 두 값이 모두 같은지 비교
		System.out.println("mem1.equals(mem2) ? " + (mem1.equals(mem2)));	// true
		System.out.println("mem1.equals(mem3) ? " + (mem1.equals(mem3)));	// false
		System.out.println("mem2.equals(mem3) ? " + (mem2.equals(mem3)));	// false

	}

}