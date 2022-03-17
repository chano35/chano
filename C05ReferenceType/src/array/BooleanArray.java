/*
 * 1차원 배열 : boolean
 * - 동일한 자료들의 연속된 모음
 * - 빠르게 자료를 처리하는데 유용
 * - 배열의 선언은 대괄호 []
 * - 초기값 지정은 중괄호 {}
 * - 초가값을 지정한 것으로 배열의 크기가 결정
 */
package array;

public class BooleanArray {

	public static void main(String[] args) {
		boolean[] tf = { true, false };               // 2개짜리 1차원 배열
		boolean tf2[] = { false, true, true, false }; // 4개짜리 1차원 배열
		
		System.out.println("tf[0] = " + tf[0]);
		System.out.println("tf[1] = " + tf[1]);
		
		System.out.println("tf2[0] = " + tf2[0]);
		System.out.println("tf2[1] = " + tf2[1]);
		System.out.println("tf2[2] = " + tf2[2]);
		System.out.println("tf2[3] = " + tf2[3]);

	}

}