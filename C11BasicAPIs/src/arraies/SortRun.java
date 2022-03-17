/*
 * 정렬(Sort)
 * 1. 오름차순(ascending): 작은 값에서 큰 값으로 정렬(기본), 1,2,3,4, .... 
 * 2. 내림차순(descending): 큰 값에서 작은 값으로 정렬, 10, 9, 8, 7, 6, ...
 * ----------------------------------------------------------------
 * Arrays.sort(배열)
 * - 기존의 선언된 배열 변수의 내용의 위치를 변경
 * - 기본적으로 오름차순으로 정렬
 * - 배열의 크기의 변화는 없다.
 * - 배열의 위치가 오름차순으로 변경된다.
 */
package arraies;

import java.util.Arrays;

public class SortRun {

	public static void main(String[] args) {
		int[] scores = { 3, 2, 5, 6, 7, 8, 1, 0, 88, 34, 23 };
		
		Arrays.sort(scores); // 오름차순
		
		System.out.println("[오름차순]");
		for(int x = 0; x < scores.length; x++) {
			System.out.printf("scores[%d]=[%d]\n", x, scores[x]);
		}

	}

}