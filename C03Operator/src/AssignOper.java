/*
 * 할당연산자(=)
 * - 왼쪽 = 오른쪽
 * - 왼쪽에는 반드시 변수
 * - 오른쪽에는 연산식
 * - 오른쪽의 연산식의 처리 결과를 왼쪽으로 할당
 * - 왼쪽에 있던 변수의 값은 사라지고 오른쪽에 있는 할당되는 값으로 대체
 * - 값의 대입 순서는 가장 오른쪽부터 왼쪽으로 진행
 *   > a = b = c = d : d -> c -> b -> a
 */
public class AssignOper {

	public static void main(String[] args) {
		int x = 10;
		int y = 20;
		int z = y = x; // x(10) -> y(10) -> z(10)
		// y = x;
		// z = y;
		
		System.out.printf("x(%d), y(%d), z(%d) \n", x, y, z);
		
		float f = 3.1234f;
		float g = z = (int)f;
		System.out.printf("g(%f), z(%d), f(%f) \n", g, z, f);
		
		// 하나의 타입에 여러 변수를 선언하면서 초기값을 0로 지정
		int kor = 0, eng = 0, math = 0;
	}

}