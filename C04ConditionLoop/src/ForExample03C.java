/*
 * [문제3]
 * 1부터 100까지 1씩 증가하는 수에서 총합을 구하라.
 * 조건: 
 *   - 10단위로 중간 결과를 출력하라.
 *   - 총합은 맨 마지막에 한 번만 출력하라.
 *---------------------------------------------
 * sum = n * (n - 1) / 2   
 */
public class ForExample03C {
	final static int MAX_NUMBER = 100;
	final static int MAX_SUM = MAX_NUMBER * (MAX_NUMBER + 1) / 2;

	public static void main(String[] args) {
		int sum = 0;

		// 나머지 연산자를 사용하지 않고 해결
		for(int n=1; n <= MAX_NUMBER; n++) {
			sum += n;
			
			int x = n / 10 * 10;
			if(n == x) {
				System.out.printf(">>> n(%d), x(%d) = (%d)\n", n, x, sum);
			}
		}

		System.out.printf("1부터 cnt(%d)까지의 총합? %d\n", MAX_NUMBER, sum);
		System.out.printf("1부터 cnt(%d)까지의 총합? %d\n", MAX_NUMBER, MAX_SUM);
	}

}