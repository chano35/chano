/*
 * 2차원 배열 : 계단식 구조
 */
package array;

public class TwoArrayInt3 {

	public static void main(String[] args) {
		int[][] scores = new int[2][]; // 2행 * 열(?)
		
		System.out.printf("scores.length=(%d)행\n", scores.length);
		
		for(int row = 0; row < scores.length; row++) {
			int col = (scores[row] == null) ? -1 : scores[row].length; 
			System.out.printf("[%d]행, [%d]열\n", row, col); 
		}

		for(int row = 0; row < scores.length; row++) {
			if(scores[row] == null) {
				scores[row] = new int[] { 
						(row+1) * 1, 
						(row+1) * 2, 
						(row+1) * 3 };
			}
			int col = (scores[row] == null) ? -1 : scores[row].length; 
			
			System.out.printf("(%d)*(%d) : ", row, col);
			
			for(int colval : scores[row]) {
				System.out.printf("[%d]", colval); 
			}
			
			System.out.println();
		}

	}

}