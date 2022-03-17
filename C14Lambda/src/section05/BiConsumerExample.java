//[표준 API의 함수적 인터페이스]
//Cousumer 함수적 인터페이스
//public interface BiConsumer <T,U> {
//	void accept(T t, U u);
//}

package section05;

import java.util.function.BiConsumer;

public class BiConsumerExample {
	
	public static void main (String ar[]) {
		BiConsumer<String, String> biConsumer = (t,u) -> System.out.println(t + u);
		biConsumer.accept("Java", "8");
		
		BiConsumer<String, Integer> biInteger = (t,u) -> System.out.println(u + t);
		biInteger.accept("Java", 8);
		
	}

}
