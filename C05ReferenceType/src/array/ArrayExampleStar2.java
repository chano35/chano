/*
 * [문제] 배열(9 * 9)에 단계(1, 3, 5, 7)별로 '*' 채워서 출력하라.  
 */
package array;

public class ArrayExampleStar2 {
	final static int MAX_ROW = 9;
	final static int MAX_COL = 9;

	public static void main(String[] args) {
		char[][] star = new char[MAX_ROW][MAX_COL];
		
		for(int row=1, cnt=1; row <= MAX_ROW; row++, cnt += 2) { // cnt: 1, 3, 5, 7, 9, 11(7), 13(5), 15(3), 17(1)
			int x = (cnt > 9) ? MAX_ROW - (cnt - 9) : cnt;
			int pos = (MAX_COL - x) / 2;
			
			for(int col=0; col < x; col++) {
				star[row-1][pos + col] = '*';
			}
		}
		
		for(int row=0; row < star.length; row++) {
			for(int col=0; col < star[row].length; col++) {
				char ch = (star[row][col] != '*') ? ' ' : '*'; 
				System.out.print(ch);
			}
			System.out.println();
		}
	}

}