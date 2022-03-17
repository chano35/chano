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

public class IntArray4 {

	public static void main(String[] args) {
		int[] os = new int[] { 1, 3, 5, 7, 9 }; // 정적 생성

		// print(os);
		print2(os);
		// printNoChange(os);
		
		System.out.println("원본 : " + os.length);
		for(int index=0; index < os.length; index++) {
			System.out.printf("원본: index[%d] = [%d]\n", index, os[index]);
		}
	}
	
	/*
	 * 함수에서 배열을 받아서 배열의 요소의 데이터를 변경하면
	 * 원본의 데이터도 변경된다.
	 */
	static void print(int[] values) {
		System.out.println("[print]");
		for(int index=0; index < values.length; index++) {
			values[index] *= values[index]; 
			System.out.printf("index[%d] = [%d]\n", index, values[index]);
		}
	}

	// 원본 데이터의 변경 발생
	static void print2(int[] values) {
		int[] value2 = values;
		
		System.out.println("[print2]");
		for(int index=0; index < value2.length; index++) {
			value2[index] *= value2[index]; 
			System.out.printf("index[%d] = [%d]\n", index, value2[index]);
		}
	}

	// 배열에서 요소를 하나씩 꺼내서 기본형으로 참조하는 것은 
	// 배열의 값을 새로운 변수에 할당하는 것으로
	// 원본 데이터가 변경되지 않음
	static void printNoChange(int[] values) {
		System.out.println("[printNoChange]");
		for(int index=0; index < values.length; index++) {
			int value = values[index];
			value *= value;
			System.out.printf("index[%d] = [%d]\n", index, value);
		}
	}

}