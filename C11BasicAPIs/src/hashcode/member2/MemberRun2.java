package hashcode.member2;

public class MemberRun2 {

	public static void main(String[] args) {
		Member mem1 = new Member("mem1", 30);
		Member mem2 = new Member("mem1", 30);
		Member mem3 = new Member("mem1", 32);
		
		System.out.println("[mem1] " + mem1);
		
		/*
		 * [해시코드] 
		 * 1. 객체의 메모리 번지를 이용해서 해시코드를 만들어 관리하기 때문에
		 *    객체마다 다른 값을 가진다.
		 * 2. 자바객체를 식별하는 키   
		 */
		System.out.println("[mem1] " + mem1.hashCode()); 
	}

}