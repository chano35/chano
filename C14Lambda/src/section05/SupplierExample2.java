/*
 * [Supplier 함수적 인터페이스]
 * - 리턴값이 있는 메소드를 가지고 있는 함수적 인터페이스
 * @FunctionalInterface
 * public interface IntSupplier {
 *     int getAsInt();
 * }
 */
package section05;

import java.util.function.Supplier;

public class SupplierExample2 {

	public static void main(String[] args) {
		Supplier<Long> supplier = () -> {
			long num = (long)(Math.random() * 6 + 1);
			return num;
		};

		for(int x = 0; x < 6; x++) {
			long num = supplier.get();
			System.out.println("눈의 수: " + num);
		}
	}
}