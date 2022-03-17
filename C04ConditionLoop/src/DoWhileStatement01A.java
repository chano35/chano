/*
 * 반복문: do~while
 */
public class DoWhileStatement01A {
	
	final static int MAX_NUMBER = 10;

	public static void main(String[] args) {
		int num = 0;
		int sum = 0;
		
		do {
			num++;
			sum += num;
			System.out.printf("> num(%d) : sum(%d)\n", num, sum); 
		} while(num < MAX_NUMBER);
		
		System.out.printf("합계: num(%d), sum(%d)\n", num, sum); 
	}

}