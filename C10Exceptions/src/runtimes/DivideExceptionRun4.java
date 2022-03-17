/*
 * 영(0)으로 나누기
 */
package runtimes;

public class DivideExceptionRun4 {

	public static void main(String[] args) {
		int x = 10;
		int y = 0;
		int z = 0;
		
		try {
			z = x / y;
			System.out.printf("x(%d) / y(%d) = z(%d)\n", x, y, z);
		}
		catch(ArithmeticException e) {
			System.out.printf("x(%d) 값을 0으로 나누려고 했습니다.\n", x);
		}
		
	}

}