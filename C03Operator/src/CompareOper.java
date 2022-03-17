/*
 * 비교연산자: ==, !=, >, >=, <, <=
 * 처리결과는 boolean
 * - EQ : 같다(==)
 * - NE : 같지안다(!=)
 * - GT : 크다(>)
 * - GE : 크거나 같다(>=) 
 * - LT : 작다(<)
 * - LE : 작거나 같다(<=)
 */
public class CompareOper {

	public static void main(String[] args) {
		int a = 10;
		int b = 20;
		int c = 30;
		System.out.printf("a(%d), b(%d), c(%d)\n", a, b, c);
		
		boolean eq = (a == b);
		boolean ne = (a != b);
		boolean gt = (a > b);
		boolean ge = (a >= b);
		boolean lt = (c < b);
		boolean le = (b <= c);
		
		System.out.printf("boolean: eq(%b) = a(%d) == b(%d) \n", eq, a, b);
		System.out.printf("boolean: ne(%b) = a(%d) != b(%d) \n", ne , a, b);
		System.out.printf("boolean: gt(%b) = a(%d)  > b(%d) \n", gt, a, b);
		System.out.printf("boolean: ge(%b) = a(%d) >= b(%d) \n", ge, a, b);
		System.out.printf("boolean: lt(%b) = c(%d)  < b(%d) \n", lt, c, b);
		System.out.printf("boolean: le(%b) = b(%d) <= c(%d) \n", le, b, c);
		

	}

}