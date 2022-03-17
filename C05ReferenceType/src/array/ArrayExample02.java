/*
 * [문제] 10*10의 2차원 배열을 만들고 
 * - 9*9에 1부터 81까지 순차적으로 1씩 증가한 값을 넣어라.
 * - 각 행과 열의 합을 구하라.
 * - 가로 소계는 각 행의 9열에 넣어라
 * - 세로 소계는 각 열의 9행에 넣어라
 */
package array;

public class ArrayExample02 {

	final static int MAX_ROW = 9;
	final static int MAX_COL = 9;
	
	public static void main(String[] args) {
		int[][] td = new int[MAX_ROW][MAX_COL];
		
		int cnt = 0;
		
		for(int row=0; row < MAX_ROW; row++) {
			for(int col=0; col < MAX_COL; col++) {
				td[row][col] = ++cnt;
				System.out.printf("[%2d] ", td[row][col]);
			}
			System.out.println();
		}

	}

}