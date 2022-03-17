/*
 * [문제] 2차원배열(9*9)에 구구단 값을 넣어서 출력하라.
 * - 1단부터 9단까지 값을 넣어서 출력
 * - 1단계 : 배열의 곱셉의 값을 넣음
 * - 2단계 : 배열을 순회하면서 출력
 */
package array;

public class TwoArrayGuGu {

	public static void main(String[] args) {
		int[][] gg = new int[9][9]; // 행(0~8), 열(0~8)
		
		for(int m = 1; m <= 9; m++) { // 단
			for(int n = 1; n <= 9; n++) {
				int mn = m * n;
				gg[m - 1][n - 1] = mn;
			}
		}

		for(int m = 0; m < gg.length; m++) { // 단
			for(int n = 0; n < gg[m].length; n++) {
				int mn = gg[m][n];
				System.out.printf("[%d] * [%d] = [%d]\n", m + 1, n + 1, mn);
			}
			System.out.println("-----------------------------");
		}

	}

}