/*
 * Infinity(무한대)
 * NaN(Not a Number)
 * ------------------------------------------
 * (정수 제로로 나누기)
 * - 정수연산에서 Zero로 나눌 수 없다.
 * - 제로로 나누게 되면 예외(Exception)
 * - 예외 : 정상적이이 않은 상항
 * - 예외가 발생되면 프로그램은 실행을 멈춤
 * - 예외는 코드가 비정상적인 처리를 만나게 되면 JVM 발생되는 인터럽트 
 */
public class InfinityNaN {

	public static void main(String[] args) {
		int x = 10;
		int y = 0;
		int z = -1;
		int n = -1;
		
		try {
			z = x / y;
			n = x % y;
		}
		catch(ArithmeticException e) { // Exception in thread "main" java.lang.ArithmeticException: / by zero
			System.out.println("예외발생:" + e);
		}

		System.out.printf("x(%d) / y(%d) -> z(%d)\n", x, y, z);
		System.out.printf("x(%d) %% y(%d) -> z(%d)\n", x, y, n);
	}

}