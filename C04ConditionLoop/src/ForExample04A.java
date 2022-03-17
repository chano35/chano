/*
 * [문제4] 1부터 100까지 1씩 증가하는 수에서 짝수의 합을 구하라.
 */
public class ForExample04A {
	
	final static int MAX_NUMBER = 100;
	final static int MAX_SUM = MAX_NUMBER * (MAX_NUMBER + 1) / 2; 

	public static void main(String[] args) {
		int sum = 0;
		
		for(int num = 1; num <= 100; num++) {
			if(num % 2 == 0) { // 2,4,6,8,10, ..., 100
				sum += num;
				System.out.printf("num(%d), sum(%d)\n", num, sum);
			}
		}
		
		System.out.printf("1부터 %d까지의 짝수의 합? %d\n", MAX_NUMBER, sum);
	}

}