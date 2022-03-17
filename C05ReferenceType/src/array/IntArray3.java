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

public class IntArray3 {

	public static void main(String[] args) {
		int[] os = new int[] { 1, 3, 5, 7, 9 }; // 정적 생성
		int[] es = null;
		
		// 배열을 새로운 변수에 할당하면 값이 아니라 주소가 할당되므로
		// 같은 데이터의 위치를 공유하여 할당받은 변수에서 값을 변경하면
		// 할당해주 변수의 데이터도 함께 변경된다.
		if(es == null) { 
			// es = new int[os.length];
			es = os;	// 할당
			for(int index=0; index < es.length; index++) {
				es[index] = os[index] + 1;
			}
		}
		
		System.out.println("홀수 : " + os.length);
		System.out.println("짝수 : " + es.length);
		for(int index=0; index < es.length; index++) {
			System.out.printf("홀수: index[%d] = [%d]\n", index, os[index]);
			System.out.printf("짝수: index[%d] = [%d]\n", index, es[index]);
		}
	}

}