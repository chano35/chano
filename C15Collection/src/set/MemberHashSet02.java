package set;

import java.util.HashSet;
import java.util.Set;

public class MemberHashSet02 {

	public static void main(String[] args) {
		Set<Member> members = new HashSet<>();
		
		members.add(new Member("자바", 20));
		members.add(new Member("자바스크립트", 25));
		members.add(new Member(new String("파이썬"), 15));
		
		// Member 클래서에서 메소드(hashCode, equals) 오버라이딩 하여 처리
		// 객체가 다르지만 name, age가 같으므로 같은 객체로 처리되어 저장되지 않음
		members.add(new Member(new String("파이썬"), 15));

		for(Member member : members) {
			System.out.printf("name(%s), age(%d)\n", member.name, member.age);
		}

	}

}