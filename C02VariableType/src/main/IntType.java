package main;
/*
 * 정수(int) : integer
 *  - 4바이트(32비트)
 *  - 범위 : -2147483648 ~ 2147483647
 *  자바에서 정수의 기본 단위
 */
public class IntType {

	public static void main(String[] args) {
		int minint = -2147483648;
		int maxint = 2147483647;
		
		System.out.println("minint : " + minint);
		System.out.println("maxint : " + maxint);
		
		int minone = minint - 1;
		int maxone = maxint + 1;

		System.out.println("minone : " + minone);
		System.out.println("maxone : " + maxone);
		
		
		
	}

}
