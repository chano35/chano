package calcminus;

import calc.Calc;

public class CalcMinusRun extends Calc {

	public static void main(String[] args) {
		printCalc();
	}
	
	void print() {
		System.out.println("[CalcMinusRun.print]");
		System.out.println("sum=" + getSum());
		System.out.println("sum=" + this.getSum());
		System.out.println("sum=" + this.sum);
		System.out.println("sum=" + sum);
	}
	
	static void printCalc() {
		System.out.println("[printCalc]");
		CalcMinus calc = new CalcMinus(1000);
		int sum = calc.compute(300);
		System.out.println("sum=" + sum);
		System.out.println("sum=" + calc.getSum());

		// Calc.sum은 protected이기 때문에 접근 불가
		// System.out.println("sum=" + calc.sum);
		
		CalcMinusRun calcrun = new CalcMinusRun();
		calcrun.compute(60);
		calcrun.print();
		
	}

}