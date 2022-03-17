/*
 * 패키지:
 * - 같은 패키지 안에 있는 클래스는 import를 하지 않고 사용할 수 있다.
 * - 접근제한자가 없어도(default) 사용할 수 있다.
 */
package calc;

public class CalcMain {

	Calc calc;
	
	CalcMain() {
		System.out.println("2. CalcMain()");
		calc = new Calc();
	}

	public static void main(String[] args) {
		System.out.println("1. CalcMain() : main");
		CalcMain calcMain = new CalcMain();
		calcMain.calc.plus(99);
		
		// System.out.printf("calc.total(%d)\n", calcMain.calc.total);
		System.out.printf("calc.calc(%d)\n", Calc.getTotalStatic(calcMain.calc));

		// calcMain.step1();
		// calcMain.step2();
		// calcMain.step3();
		// calcMain.step4();
	}
	
	void step1() {
		System.out.println("[step1]");
		calc.plus(10);
		calc.minus(5);
		calc.multiple(4);
		calc.divide(3);
		int total1 = calc.mod(4);
		int total2 = calc.total();
		calc.print();
		
		System.out.printf("total1(%d), total2(%d)\n", total1, total2);
	}

	void step2() {
		System.out.println("[step2]");
		calc.plus(20);
		calc.print();
		
		calc.clear();
		calc.plus(50);
		calc.print();

		// Calc.total이 private이므로 접근 불가
		// System.out.printf("calc.total(%d)\n", calc.total);
		System.out.printf("calc.total(%d)\n", calc.total());
	}

	void step3() {
		calc.clear();
		
		int[] values = {1,2,3,4,5,6,7,8,9,10};
		calc.sum(values);
		calc.print("step3:배열덧셈");

		calc.sum(new int[] {1,2,3,4,5,6,7,8,9,10});
		calc.print("step3:배열덧셈");

		calc.sums(1,3,5,7,9);
		calc.sums(new int[] {1,2,3,4,5,6,7,8,9,10});
	}

	void step4() {
		calc.clear();
		
		calc.sums(1,3,5,7,9);
		calc.print("step4:가변인자(10까지 홀수의 합");
		
		calc.clear();
		calc.sums(new int[] {1,2,3,4,5,6,7,8,9,10});
		calc.print("step4:가변인자(10까지 합");
	}

}
