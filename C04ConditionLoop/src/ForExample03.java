/*
 * [문제3]
 * 1부터 100까지 1씩 증가하는 수에서 총합을 구하라.
 * 조건: 
 *   - 10단위로 중간 결과를 출력하라.
 *   - 총합은 맨 마지막에 한 번만 출력하라.
 */
public class ForExample03 {
	final static int MAX_NUMBER = 100;
	final static int MAX_TEN = 10;

	public static void main(String[] args) {
		int sum = 0;
		int cnt = 0;
		
		for(int n=1; n <= MAX_TEN; n++) {
			for(int m=1; m <= MAX_TEN; m++) {
				cnt++;
				sum += cnt;
			}
			System.out.printf("cnt(%d) = (%d)\n", cnt, sum);
		}

		System.out.printf("1부터 cnt(%d)까지의 총합? %d\n", cnt, sum);
	}

}