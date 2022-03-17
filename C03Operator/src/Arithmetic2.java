public class Arithmetic2 {

	public static void main(String[] args) {
		int a = 10;
		int b = 3;
		int c = a * b;
		System.out.printf("c(%d) = a(%d) * b(%d)\n", c, a, b);

		// 변수의 값을 마이너스로 바꾸기 위해서는 연산자(-)를
		// 변수 앞에 붙인다.
		// int d = a * -b;
		int d = a * (-b);
		System.out.printf("d(%d) = a(%d) * b(%d)\n", d, a, b);

		int m3 = -3;
		int e = a * m3;
		System.out.printf("e(%d) = a(%d) * m3(%d)\n", e, a, m3);
		
		int m4 = b * -1;
		System.out.printf("m4(%d)\n", m4);
		
		int f = e * m4;
		System.out.printf("f(%d) = e(%d) * m4(%d)\n", f, e, m4);
		
		// 연산순서에서 곱하기, 나누기는 동일
		// 곱하기, 나누기는 더하기, 빼기보다 우선순위가 높다.
		int g = c + a * b; // 30 + 10 * 3, 기대값:120, 결과:60
		int h = (c + a) * b; // 30 + 10 * 3, 기대값:120
		System.out.printf("g(%d) = c(%d) + a(%d) * b(%d)\n", g, c, a, b);
		System.out.printf("h(%d) = (c(%d) + a(%d)) * b(%d)\n", h, c, a, b);
	}

}