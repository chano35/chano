package section05;

import java.util.function.Consumer;

public class ConsumerAndThenExample {
	
	public static void main (String ar[]) {
		Consumer<Member> consumerA = (m) -> {
			System.out.println("consumerA :" + m.getName());
		};
		
		Consumer<Member> consumerB = (m) -> {
			System.out.println("consumerB :" + m.getId());
		};
		
		System.out.println("[개별처리]");
		Member member = new Member("홍길동", "HongGilDong", null);
		consumerA.accept(member);
		consumerB.accept(member);
		
		System.out.println("[andThen]");
		Consumer<Member> consumerAB = consumerA.andThen(consumerB);
		consumerAB.accept(new Member("전우치", "JeonWooChi", null));
		
	}

}
