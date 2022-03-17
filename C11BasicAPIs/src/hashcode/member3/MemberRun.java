package hashcode.member3;

public class MemberRun {

	public static void main(String[] args) {
		Member mem1 = new Member("mem1", 30);
		Member mem2 = new Member("mem1", 30);
		Member mem3 = new Member(new String("mem1"), 30);
		
		System.out.println("[mem1] " + mem1);
		System.out.println("[mem2] " + mem2);
		System.out.println("[mem3] " + mem3);
		
		/*
		 * [해시코드] 
		 * 1. 객체의 메모리 번지를 이용해서 해시코드를 만들어 관리하기 때문에
		 *    객체마다 다른 값을 가진다.
		 * 2. 자바객체를 식별하는 키   
		 */
		System.out.println("[mem1] " + mem1.hashCode()); 
		System.out.println("[mem2] " + mem2.hashCode()); 
		System.out.println("[mem3] " + mem3.hashCode()); 
		
		System.out.println("[mem1 == mem2] ? " + (mem1 == mem2));	// false
		System.out.println("[mem1 == mem3] ? " + (mem1 == mem3));	// false
		System.out.println("[mem2 == mem3] ? " + (mem2 == mem3));	// false

		// Member.equals()를 오버라이드해서 id, age의 두 값이 모두 같은지 비교
		System.out.println("mem1.equals(mem2) ? " + (mem1.equals(mem2)));	// true
		System.out.println("mem1.equals(mem3) ? " + (mem1.equals(mem3)));	// false
		System.out.println("mem2.equals(mem3) ? " + (mem2.equals(mem3)));	// false
		
	}

}