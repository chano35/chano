/*
 * 반복문(while):
 * 
 * [문제01] 구구단 : 2단부터 9단까지 출력
 *  - 조건: while문을 사용하라.
 */
public class WhileExample01 {
	
	final static int MIN_MULTIPLE = 2;
	final static int MAX_MULTIPLE = 9;

	public static void main(String[] args) {
		int m = MIN_MULTIPLE; // 단
		int n, mn;
		
		while(m <= MAX_MULTIPLE) {
			System.out.printf("[%d] 단\n", m);
			
			n = 1;
			while(n <= MAX_MULTIPLE) {
				mn = m * n;
				System.out.printf("[%d] * [%d] = [%d]\n", m, n, mn);
				n++;
			}
			
			m++;
			System.out.println("-------------------------------");
		}

	}

}