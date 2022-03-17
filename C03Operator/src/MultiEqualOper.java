/*
 * 복합대입연산자: 
 *   : +=, -=, *=, /=, %=
 *   : &=, ^=, |=, <<=, >>=, >>>=
 *
 */
public class MultiEqualOper {

	public static void main(String[] args) {
		int a = 10;
		int b = 20;
		int c = 1;
		
		a += 3;
		c += a;
		
		// 사용 가능하지만 권고되지 않는다.
		// c += (a += 3);
		System.out.printf("c(%d), a(%d)\n", c, a);
		
		int bp = b;
		
		c = 1;
		c += ++b + c + b; // b(21) + c(1) + b(21) + c(1)
		System.out.printf("* c(%d)\n", c);
		
		c = 1;
		b = bp;
		System.out.printf("b(%d)\n", b);
		int x1 = ++b;
		System.out.printf("x1(%d)\n", x1);
		int x2 = x1 + c;
		System.out.printf("x2(%d)\n", x2);
		int x3 = x2 + b;
		System.out.printf("x3(%d)\n", x3);
		c = c + x3;
		System.out.printf("c(%d)\n", c);
				
		
		
		
	}

}