/*
 * 영(0)으로 나누기
 */
package runtimes;

public class DivideExceptionRun {

	public static void main(String[] args) {
		int x = 10;
		int y = 0;
		
		// Exception in thread "main" java.lang.ArithmeticException: / by zero
		int z = x / y; 
		
		System.out.printf("x(%d) / y(%d) = z(%d)\n", x, y, z);
	}

}