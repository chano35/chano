package main;
/*
 * ����(int) : integer
 *  - 4����Ʈ(32��Ʈ)
 *  - ���� : -2147483648 ~ 2147483647
 *  �ڹٿ��� ������ �⺻ ����
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
