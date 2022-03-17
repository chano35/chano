/*
 * n은 1부터 10까지 1씩 증가하는 수이다.
 * n의 총합을 구하라. 
 */
public class ForExample01B {

	public static void main(String[] args) {
		int sum = 0;
		
		for(int n=1; n <= 10; ++n) { // n++, n = n + 1, n += 1
			sum += n;
			// sum = sum + n;
			System.out.printf("n(%d), sum(%d)\n", n, sum);
		}
		
		System.out.println("총합은? " + sum);
	}

}