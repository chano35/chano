package section05;

import java.util.function.Consumer;

public class ConsumerAndThenExample2 {
	
	public static void main (String ar[]) {
		Consumer<Member> consumerA = (m) -> {
			System.out.println("consumerA(이름) :");
			System.out.println("> 한글이름 : " + m.getName());
			System.out.println("> 아 이 디 : " + m.getId());
			
		};
		
		Consumer<Member> consumerB = (m) -> {
			System.out.println("consumerB(주소) :");
			Address address = m.getAddress();
			System.out.println("> 국적 : " + address.getCountry());
			System.out.println("> 도시 : " + address.getCity());
		};
		
		System.out.println("[andThen]");
		Consumer<Member> consumerAB = consumerA.andThen(consumerB);
		consumerAB.accept(new Member("홍길동", "HongGilDong", new Address("조선", "한양")));
		
	}

}
