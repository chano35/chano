/*
 * [문제] 10*10의 2차원 배열을 만들고 
 * - 9*9에 1부터 81까지 순차적으로 1씩 증가한 값을 넣어라.
 * - 각 행과 열의 합을 구하라.
 * - 가로 소계는 각 행의 9열에 넣어라
 * - 세로 소계는 각 열의 9행에 넣어라
 */
package array;

public class ArrayExample02A {

	final static int MAX_ROW = 9;
	final static int MAX_COL = 9;
	
	public static void main(String[] args) {
		int[][] td = new int[MAX_ROW + 1][MAX_COL + 1];
		
		int cnt = 0;
		
		for(int row=0; row < MAX_ROW; row++) {
			for(int col=0; col < MAX_COL; col++) {
				td[row][col] = ++cnt;
				td[row][MAX_COL] += td[row][col];
				td[MAX_ROW][col] += td[row][col];
				
				System.out.printf("[%3d] ", td[row][col]);
			}
			td[MAX_ROW][MAX_COL] += td[row][MAX_COL];
			System.out.printf("[%3d]\n", td[row][MAX_COL]);
		}
		
		for(int col=0; col <= MAX_COL; col++) {
			System.out.printf("[%3d] ", td[MAX_ROW][col]);
		}
		
		System.out.println();
		System.out.println("테이블의 내용");
		for(int row=0; row <= MAX_ROW; row++) {
			for(int col=0; col <= MAX_COL; col++) {
				System.out.printf("[%3d] ", td[row][col]);
			}
			System.out.println();
		}
	}

}