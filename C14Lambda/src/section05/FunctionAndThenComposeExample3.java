/*
 * Function의 순차적 연결
 * - Function<>.compose()를 시뮬레이션
 */
package section05;

import java.util.function.Function;

public class FunctionAndThenComposeExample3 {

	public static void main(String[] args) {
		Function<Member, Address> functionA;
		Function<Address, String> functionB;
		Function<Member, String> functionAB;
		String city;
		
		functionA = (Member member) -> {
			System.out.printf("FunctionA:(%s)(%s)\n", 
					member.getAddress().getCountry(),
					member.getAddress().getCity());
			return member.getAddress();
		};
		
		functionB = (Address addr) -> {
			System.out.printf("FunctionB:(%s)(%s)\n", addr.getCountry(), addr.getCity());
			return addr.getCity() + "[시]";
		};
		
		functionAB = functionB.compose(functionA);
		city = functionAB.apply(new Member("홍길동", "HGD", new Address("조선", "한양")));
		System.out.println("거주도시:" + city);
	}

}