/*
 * System.out.printf(format, arguments);
 * - public PrintStream printf(String format, Object ... args) {
 * ----------------------------------------------------------
 * %n : 줄바꿈
 * \n : 줄바꿈
 * %s : String
 * %d : Integer(byte, short, int, long)
 * %f : float, double
 * %o : 8진수
 * %x : 16진수
 * %b : boolean
 * %e : 지수(exponent)
 * %t : date, time 
 */
public class SystemPrintf {

	public static void main(String[] args) {
		System.out.printf("System.out.printf(...)\n");
		System.out.printf("System.out.printf(...)%n");
		System.out.println("System.out.printf(...)");
		
		String name = "홍길동";
		int n = 12345;
		int N = 0xff00;
		float f = 3.141592f;
		double d = 0.1234567890123456;
		float e = 0.1234e4f;
		boolean bt = true;
		boolean bf = false;
		
		System.out.printf("String : (%s)%n", name);
		
		System.out.printf("Decimal : (%d)%n", n);
		System.out.printf("Decimal : 8진수(0%o)%n", n);
		System.out.printf("Decimal : 16진수(0x%x)%n", n);
		System.out.printf("Decimal : 16진수(0x%X)%n", N);
		System.out.printf("Decimal : 16진수(0x%x)%n", N);
		
		System.out.printf("Float : (%f)%n", f);
		System.out.printf("Double : (%f)%n", d);
		System.out.printf("Exponent : f(%e)%n", f);
		System.out.printf("Exponent : d(%e)%n", d);
		System.out.printf("Exponent : e(%e)%n", e);
		
		float g1 = 3.141596f;
		float g2 = 3.141594f;
		
		System.out.printf("Float : g(%g)%n", g1);
		System.out.printf("Float : g(%g)%n", g2);

		
		System.out.printf("Boolean : (%b)%n", bt);
		System.out.printf("Boolean : (%b)%n", bf);


	}

}