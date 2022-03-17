/*
 * 영(0)으로 나누기
 */
package runtimes;

public class DivideExceptionRun2 {

	public static void main(String[] args) {
		int x = 10;
		int y = 0;
		
		int z = (y != 0) ? x / y : 0; 
		
		System.out.printf("x(%d) / y(%d) = z(%d)\n", x, y, z);
	}

}