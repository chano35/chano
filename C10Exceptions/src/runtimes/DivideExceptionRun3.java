/*
 * 영(0)으로 나누기
 */
package runtimes;

public class DivideExceptionRun3 {

	public static void main(String[] args) {
		int x = 10;
		int y = 0;
		int z = 0;
		
		if(y != 0) {
			z = x / y;
		}
		else {
			System.out.printf("x(%d) 값을 0으로 나누려고 했습니다.\n", x);
			return;
		}
		
		System.out.printf("x(%d) / y(%d) = z(%d)\n", x, y, z);
	}

}