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
public class CompareOper2 {

	public static void main(String[] args) {
		double a = 0.1; // 0.10000000149011612
		double b = 0.1;
		float c = 0.1f;
		System.out.printf("a(%f), b(%f), c(%f)\n", a, b, c);
		
		boolean eq = (a == b);         // true
		boolean ac = (a == c);         // false
		boolean ad = (a == (double)c); // false
		boolean ae = ((float)a == c);  // true
		boolean ag = (a > c);          // false
		boolean al = (a < c);          // true
		
		boolean ne = (a != b);
		boolean gt = (a > b);
		boolean ge = (a >= b);
		boolean lt = (c < b);
		boolean le = (b <= c);
		
		System.out.printf("boolean: eq(%b) = a(%f) == b(%f) \n", eq, a, b);
		System.out.printf("*** boolean: ac(%b) = a(%f) == c(%f) \n", ac, a, c);
		System.out.printf("*** boolean: ad(%b) = a(%f) == c(%f) \n", ad, a, c);
		System.out.printf("*** boolean: ae(%b) = a(%f) == c(%f) \n", ae, a, c);
		System.out.printf("*** boolean: ag(%b) = a(%f) > c(%f) \n", ag, a, c);
		System.out.printf("*** boolean: al(%b) = a(%f) < c(%f) \n", al, a, c);

		System.out.println("--------------------------------------");
		System.out.printf("boolean: ne(%b) = a(%f) != b(%f) \n", ne , a, b);
		System.out.printf("boolean: gt(%b) = a(%f)  > b(%f) \n", gt, a, b);
		System.out.printf("boolean: ge(%b) = a(%f) >= b(%f) \n", ge, a, b);
		System.out.printf("boolean: lt(%b) = c(%f)  < b(%f) \n", lt, c, b);
		System.out.printf("boolean: le(%b) = b(%f) <= c(%f) \n", le, b, c);
		

	}

}