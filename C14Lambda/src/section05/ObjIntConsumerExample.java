/*
 * public interface ObjIntConsumer<T> {
 *   void accept(T t, int value);
 * }
 */
package section05;

import java.util.function.ObjIntConsumer;

public class ObjIntConsumerExample {

	public static void main(String[] args) {
		ObjIntConsumer<String> consumer = (t, x) -> {
			System.out.println("ObjIntConsumer: " + t + x);
		};
		
		consumer.accept("Java", 8);
	}

}