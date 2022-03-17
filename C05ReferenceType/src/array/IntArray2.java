/*
 * 정적생성 : 컴파일 단계에서 생성, 확정적, static
 * 동적생성 : 실행 단계에서 생성, 가변적, dynamic
 * ---------------------------------------------
 * 배열의 선언:
 * 타입[] 변수 = { 초기값1, 초기값2, ... };
 * 타입[] 변수 = new 타입[길이] { 초기값1, 초기값2, ... };
 * 타입[] 변수 = new 타입[길이];
 */
package array;

public class IntArray2 {

	public static void main(String[] args) {
		// int[] os = { 1, 3, 5, 7, 9 };
		int[] os = new int[] { 1, 3, 5, 7, 9 }; // 정적 생성
		int[] es = null;
		
		System.out.println("홀수 : " + os.length);

		for(int index=0; index < os.length; index++) {
			System.out.printf("홀수: index[%d] = [%d]\n", index, os[index]);
		}
		
		if(es == null) { // 동적 생성
			// es = new int[] { 2, 4, 6, 8, 10 };
			// es = new int[5];
			es = new int[os.length];
			for(int index=0; index < es.length; index++) {
				es[index] = os[index] + 1;
			}
		}
		
		System.out.println("짝수 : " + es.length);
		for(int index=0; index < es.length; index++) {
			System.out.printf("짝수: index[%d] = [%d]\n", index, es[index]);
		}
	}

}