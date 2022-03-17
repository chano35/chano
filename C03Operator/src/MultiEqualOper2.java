/*
 * 복합대입연산자: 
 *   : +=, -=, *=, /=, %=
 *   : &=, ^=, |=, <<=, >>=, >>>=
 * 
 * 
 */
public class MultiEqualOper2 {

	public static void main(String[] args) {
		int a = 10;
		int b = 20;
		int c = 1;
		
		c = c + a;
		System.out.printf("c(%d)\n", c);
		
		c += a; // c = c + a
		System.out.printf("c(%d)\n", c);
		
		int x = 0;
		x = x + 2;
		x += 2;
		System.out.printf("x(%d)\n", x);
		
		x -= 3; // x = x - 3;
		System.out.printf("x(%d)\n", x);
		
		x *= 10; // x = x * 10
		System.out.printf("x(%d)\n", x);
		
		x /= 3; // x = x / 3
		System.out.printf("x(%d)\n", x);
		
		x %= 3; // x = x % 3
		System.out.printf("x(%d)\n", x);

		x++;
		x++;
		
		x = x + 2;
		
		x += 2;
		System.out.printf("x(%d)\n", x);
		
		x *= a + b; // x = x * (a + b)
		System.out.printf("x(%d) *= a(%d) + b(%d)\n", x, a, b);
		
	}

}