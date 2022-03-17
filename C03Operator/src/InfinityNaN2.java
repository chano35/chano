/*
 * Infinity(무한대)
 * NaN(Not a Number)
 * ------------------------------------------
 * (실수 제로로 나누기)
 * - 정수를 제로로 나누기처럼 예외가 발생되지 않고 아래와 같은 값을 산출
 * - 나누기(/) : 연산결과가 Infinity
 * - 나머지(%) : 연산결과가 NaN
 */
public class InfinityNaN2 {

	public static void main(String[] args) {
		float x = 10.0f;
		float y = 0.0f;
		float z = -1.0f;
		float n = -1.0f;
		
		z = x / y;
		n = x % y;
		
		System.out.println("z=" + z); // Infinity
		System.out.println("n=" + n); // NaN 
		
		System.out.println("z=" + Double.isInfinite(z));
		System.out.println("n=" + Double.isNaN(n));
	}

}