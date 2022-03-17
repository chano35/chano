/*
 * [생성자 참조]
 * - 람다식에서 생성자 참조
 * - 생성자를 참조하면 객체를 생성하게 됨
 * - 클래스이름::new
 */
package section06;

import java.util.function.BiFunction;
import java.util.function.Function;

public class MemberConstructorReferenceExample {
	public static void main(String[] args) {
		Function<String, Member> func1 = Member::new;
		Member member1 = func1.apply("angel");
		System.out.println("member1: " + member1.getId());
		
		BiFunction<String, String, Member> func2 = Member::new;
		Member member2 = func2.apply("백두산", "호랑이");
		System.out.println("member2: " + member2.getName());
		System.out.println("member2: " + member2.getId());

		BiFunction<String, String, Member> func3 = (name, id) -> new Member(name, id);
		Member member3 = func3.apply("한라산", "고라니");
		System.out.println("member3: " + member3.getName());
		System.out.println("member3: " + member3.getId());
	}
}