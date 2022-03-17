/*
 * 2차원 배열
 * - 자바는 일차원 배열이 서로 연결된 구조로 다차원 배열을 구현하기 때문에
 *   수학 행렬 구조가 아닌 계단식 구조를 가질 수 있다.
 * 
 */
package array;

public class TwoArrayInt {

	public static void main(String[] args) {
		int[][] td = { {1,2,3}, {4,5,6} }; // 2행 3열의 2차원 배열(2 * 3)
		
		System.out.printf("td[0][0]:%d\n", td[0][0]); // 행,열
		System.out.printf("td[0][1]:%d\n", td[0][1]);
		System.out.printf("td[0][2]:%d\n", td[0][2]);

		System.out.printf("td[1][0]:%d\n", td[1][0]);
		System.out.printf("td[1][1]:%d\n", td[1][1]);
		System.out.printf("td[1][2]:%d\n", td[1][2]);
		
		// for문으로 배열(td)의 내용을 출력
		System.out.println("행의 크기: td.length=" + td.length);
		
		for(int row = 0; row < td.length; row++) { // 0, 1
			for(int col = 0; col < td[row].length; col++) {     // 0, 1, 2
				System.out.printf("td[%d][%d]:%d\n", row, col, td[row][col]);
			}
		}

	}

}
