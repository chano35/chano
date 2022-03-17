/*
 * 반복문: do~while
 */
public class DoWhileStatement01B {
	
	final static int MAX_NUMBER = 10;

	public static void main(String[] args) {
		int num = 1;
		int sum = 0;
		
		do {
			sum += num;
			System.out.printf("> num(%d) : sum(%d)\n", num, sum);
			// num++;
		} while(++num <= MAX_NUMBER);
		// } while((++num) <= MAX_NUMBER);

		System.out.printf("합계: num(%d), sum(%d)\n", num, sum); 
	}

}