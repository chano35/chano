/*
 * [문제] 계단식 배열 생성
 * - m은 1부터 10까지 1씩 증가하는 수
 * - n은 1부터 m까지 1씩 증가하는 수
 * - 배열(m * n)을 만들어 곱(m * n)의 값을 넣고 출력하라.
 * - 각 배열의 행(m)은 n만큼 열(n)을 만들어라.
 * - 예) 1행(1열), 2행(2열), 3행(3열), .... 10행(10열)의 행과 열을 배열로 만들어라.
 */
package array;

public class TwoArrayGuGu3 {
	
	final static int MAX_NUMBER = 10;

	public static void main(String[] args) {
		int[][] table = new int[MAX_NUMBER][];
		
		for(int m = 1; m <= MAX_NUMBER; m++) {
			
			table[m-1] = new int[m];
			
			for(int n = 1; n <= m; n++) {
				int mn = m * n;
				table[m-1][n-1] = mn; 
				// System.out.printf("m[%d], n[%d] : [%d]\n", m, n, mn);
			}
			
			// System.out.println("----------------------------");
		}

		for(int m = 0; m < table.length; m++) {
			for(int n = 0; n <= m; n++) {
				int mn = table[m][n]; 
				System.out.printf("m[%d], n[%d] : [%d] ", m+1, n+1, mn);
				for(int star = 0; star < mn; star++) {
					System.out.print("*");
				}
				System.out.println();
			}
			
			System.out.println();
		}

	}

}