/*
 * 증감연산자: ++, --
 * - 증가연산자(++) : 1씩 증가
 * - 감소연산자(--) : 1씩 감조
 */
public class SingleOper {

	public static void main(String[] args) {
		int pp = 0;
		pp++; // 1증가 : pp = pp + 1
		System.out.println("pp=" + pp);
		
		++pp; // 1증거 : pp = pp + 1
		System.out.println("pp=" + pp);
		
		int p1 = pp++; // pp에 있는 값을 먼저 p1에 할당하고 pp는 1증가
		System.out.printf("p1(%d), pp(%d)\n", p1, pp);
		
		int p2 = ++pp; // pp에 먼저 1을 증가 시키고 그 값을 p2에 할당 
		System.out.printf("p2(%d), pp(%d)\n", p2, pp);
		
		System.out.printf("pp++(%d)(%d)\n", pp++, pp);
		System.out.printf("pp++(%d)(%d)\n", pp++, pp);

		System.out.printf("++pp(%d)(%d)\n", ++pp, pp);
		
		pp--; // pp = pp - 1;
		System.out.printf("pp(%d)\n", pp);
		System.out.printf("--pp(%d)\n", --pp);
		System.out.printf("pp--(%d)(%d)\n", pp--, pp);
		
		//
		int x1 = 10;
		int x2 = 10;

		int y1 = (x1++) + (--x2); // 10 + 9 -> 19
		System.out.printf("x1(%d), x2(%d), y1(%d)\n", x1, x2, y1);

		int y2 = (++x1) + (--x2); // 10(11+1) + 8(9-1) -> 20
		System.out.printf("x1(%d), x2(%d), y2(%d)\n", x1, x2, y2);
	}

}