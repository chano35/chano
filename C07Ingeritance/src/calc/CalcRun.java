/*
 * [protected 접근 제한자]
 * - 자식 클래스가 아닌 다른 패키지에 소속된 클래스에서는 접근할 수 없다.
 * - 같은 패키지 안에 있는 클래스에서는 디폴트(default)와 같이 접근할 수 있다.
 * 
 * [private 접근 제한자]
 * - 같은 패키지라 하더라도 private은 접근할 수 없다.
 */
package calc;

public class CalcRun {

	public static void main(String[] args) {
		Calc calc = new Calc(900);
		int sum = calc.compute(10);
		
		System.out.println("calc.sum=" + calc.sum);			// protected
		System.out.println("calc.prevsum=" + calc.prevsum);	// default
		
		// 같은 패키지라 하더라도 private은 접근할 수 없다.
		// System.out.println("calc.prisum=" + calc.prisum);	// private
		System.out.println("calc.prisum=" + calc.getPrivSum());	// protected
		
		System.out.println("sum=" + sum);
	}

}