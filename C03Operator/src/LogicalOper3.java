/*
 * 논리연산자(!, ||, &&)
 * - 논리부정(!) : 반대, true -> false, false -> true
 * - 논리합(||)  : OR, A or B(A이거나 B이면 참, A, B중에 하나라도 참이면 참)
 * - 논리곱(&&)  : AND, A and B(A이고 B, A와 B가 모두 참이어야 참)
 */
public class LogicalOper3 {

	public static void main(String[] args) {
		boolean t = true;
		boolean f = false;

		System.out.printf("t(%b)\n", t); 
		System.out.printf("f(%b)\n", f); 

		// 논립곱(&&)
		boolean and1 = t && f;
		boolean and2 = t && t;
		boolean and3 = f && f;
		boolean and4 = f && t;
		
		System.out.printf("%b = t(%b) && f(%b)\n", and1, t, f);
		System.out.printf("%b = t(%b) && t(%b)\n", and2, t, t);
		System.out.printf("%b = f(%b) && f(%b)\n", and3, f, f);
		System.out.printf("%b = f(%b) && t(%b)\n", and4, f, t);
		
		boolean log1 = t && t && (t || f); // true
		boolean log2 = t && t && t || f;   // true
		boolean log3 = t && f && t || f;   // false
		
		System.out.printf("log1=(%b)\n", log1);
		System.out.printf("log2=(%b)\n", log2);
		System.out.printf("log3=(%b)\n", log3);
	}

}