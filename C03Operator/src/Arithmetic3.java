/*
 * 산술연산 : 나누기(/)
 */
public class Arithmetic3 {

	public static void main(String[] args) {
		int a = 10;
		int b = 3;
		int c = a / b;
		System.out.printf("c(%d) = a(%d) / b(%d)\n", c, a, b);

		int e = c * b;
		System.out.printf("e(%d) = c(%d) * b(%d)\n", e, c, b);
		
		// 계산 결과 정수를 실수(float)으로 대입해도 소수점이하가 소실
		float f1 = a / b;
		System.out.println("f1=" + f1);
		System.out.printf("f1(%f) = a(%d) / b(%d)\n", f1, a, b); // 3.000000
		
		// 계산 결과 정수를 실수(float)으로 대입해도 소수점이하가 소실
		float f2 = (float)(a / b);
		System.out.printf("f2(%f) = a(%d) / b(%d)\n", f2, a, b); // 3.000000

		// 계산전에 정수형을 실수형으로 변환(casting)해야 한다.
		float f3 = (float)a / (float)b; // 10.0f / 3.0f
		System.out.printf("f3(%f) = a(%d) / b(%d)\n", f3, a, b); // 3.333333

		// 계산전에 정수형을 실수형으로 변환(casting)해야 한다.
		float f4 = (float)a / b; // 10.0f / 3
		System.out.printf("f4(%f) = a(%d) / b(%d)\n", f4, a, b); // 3.333333

		float f5 = 10.0f / 3;
		float f6 = 10 / 3.0f;
		float f7 = a / (float)b; // 10.0f / 3
		System.out.printf("f5(%f), f6(%f), f7(%f)\n", f5, f6, f7);
		
		double d1 = (double)a / (double)b;
		System.out.printf("d1(%f) = a(%d) / b(%d)\n", d1, a, b); // 3.333333		

	}

}