/*
 * 산술연산 : 나누기(%)
 */
public class Arithmetic4 {

	public static void main(String[] args) {
		int a = 10;
		int b = 3;
		int c = a / b;
		int n = a % b; // 나누고 남은 값(나머지)
		System.out.printf("몫: c(%d) = a(%d) / b(%d)\n", c, a, b);
		System.out.printf("나머지: n(%d) = a(%d) %% b(%d)\n", n, a, b);
		
		// [문제] 나머지 연산자(%)를 쓰지 않고 나머지를 구하라.
		int x = a - a / b * b;
		System.out.printf("나머지: x(%d) = a(%d) - a(%d) / b(%d) * b(%d)\n", x, a, a, b, b);

		int x2 = a - ((a / b) * b);
		System.out.printf("나머지: x2(%d)\n", x2);
		
		int n1 = a / b;  // 10 / 3 -> 3
		int n2 = n1 * b; //  3 * 3 -> 9
		int n3 = a - n2; // 10 - 9 -> 1
		System.out.printf("나머지: n1(%d), n2(%d), 나머지:n3(%d)\n", n1, n2, n3);
		
		// 곱하기, 나누기, 나머지는 우선순위가 동일
		// 더하기, 빼기는 곱하기, 나누기, 나머지보다 우선순위가 낮다.
		int x3 = 100 * 2 - 10 % 3;
		int x4 = (100 * 2) - (10 % 3);
		System.out.printf("연산순서: x3(%d) = 100 * 2 - 10 %% 3 \n", x3);
		System.out.printf("연산순서: x4(%d) = 100 * 2 - 10 %% 3 \n", x4);
		

	}
}