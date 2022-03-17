/*
 * 2차원 배열 : 계단식 구조
 */
package array;

public class TwoArrayInt2 {

	public static void main(String[] args) {
		int[][] td = { {11}, {21,22}, {31,32,33}, {41,42} }; // 0행 1열, 1행 2열, 2행 3열
		
		System.out.println("행의 크기: td.length=" + td.length);
		
		for(int row = 0; row < td.length; row++) { // 0, 1
			
			System.out.printf("[%d]행, [%d]열\n", row, td[row].length);
			
			for(int col = 0; col < td[row].length; col++) {     // 0, 1, 2
				System.out.printf("td[%d][%d]:%d\n", row, col, td[row][col]);
			}
			
			System.out.println();
		}

	}

}