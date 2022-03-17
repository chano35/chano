/*
 * 산술연산자(+, -, *, /, %)
 * - 더하지 : +
 * - 빼기   : -
 * - 곱합기 : *(아스터리스크)
 * - 나누기 : /(슬레쉬)
 * - 나머지 : %
 * -------------------------------------
 * 산술 연산 방향 : 좌(left) -> 우(right)
 */
public class Arithmetic {

	public static void main(String[] args) {
		int a = 10;
		int b = 20;
		int c = a + b;
		System.out.printf("c(%d) = a(%d) + b(%d)\n", c, a, b);
		
		int d = c - 40;
		System.out.printf("d(%d) = c(%d) - (%d)\n", d, c, 40);
		
		int e = a + b + c + d;
		System.out.printf("e(%d) = a(%d) + b(%d) + c(%d) + d(%d)\n", e, a, b, c, d);
		
		// 변수(e)를 재사용
		e = a + b + c - d;
		System.out.printf("e(%d) = a(%d) + b(%d) + c(%d) - d(%d)\n", e, a, b, c, d);
		
		// 마이너스(minus) 값을 표현할 때 관행적으로 괄호()로 감싸서 표현한다.
		int f = a + b + c - (-10);
		System.out.printf("f(%d) = a(%d) + b(%d) + c(%d) - (%d)\n", f, a, b, c, -10);
		
		// 우선순위 : plus, minus는 동일하므로 좌측에 먼저 나온 연산자부터 계산
		int g = a - b + c;
		System.out.printf("g(%d) = a(%d) - b(%d) + c(%d)\n", g, a, b, c);

		int h = a + b - c;
		System.out.printf("h(%d) = a(%d) + b(%d) - c(%d)\n", h, a, b, c);
		
		// 연산순서 변경 : 괄호안에 연산식을 먼저 계산
		int i = b - c + a;
		System.out.printf("i(%d) = b(%d) - c(%d) + a(%d)\n", i, b, c, a);
		int j = a + (b - c);
		int bc = b - c;
		int abc = a + bc;
		System.out.printf("j(%d) = a(%d) + (b(%d) - c(%d))\n", j, a, b, c);
		System.out.printf("bc(%d), abc(%d)\n", bc, abc);

	}

}