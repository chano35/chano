/*
 * [표준 API의 함수적 인터페이스]
 * Consumer 함수적 인터페이스
 *   - 리턴값이 없으며 하나의 매개변수
 *   - 전달된 매개변수를 소비(사용)
 * public interface Consumer<T> {
 *   void accept(T t);
 * }
 */
package section05;

import java.util.function.Consumer;

public class ConsumerExample {

	public static void main(String[] args) {
		// Consumer<String> consumer = (t) -> { System.out.println(t + "8"); };
		Consumer<String> consumer = t -> System.out.println(t + "8");
		consumer.accept("Java");
		
		Consumer<String> consumer2 = (String t) -> System.out.println(t + "2");
		consumer2.accept("Java");

		
		Consumer<Integer> conInteger = t -> System.out.println(t + t);
		conInteger.accept(10);
		
		normal();
	}
	
	static void normal() {
		Consumer<String> consumer = new Consumer<String>() {
			@Override
			public void accept(String t) {
				System.out.println(t + "15");
			}
		};
		
		consumer.accept("Java");
	}

}