package section05;

import java.util.function.DoubleConsumer;

public class DoubleConsumerExample {

	public static void main(String[] args) {
		DoubleConsumer consumer = value -> System.out.println("DoubleConsumer: "+ value);
		consumer.accept(0.12345);
		
		DoubleConsumer consumer2 = value -> {
			value *= 2.0;
			System.out.println("DoubleConsumer: "+ value);
		};
		
		consumer2.accept(0.12345);
		
	}
}