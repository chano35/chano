package exercises.exercise6;

public class CalcExample {

	public static void main(String[] args) {
		Calc calc = new Calculator(100);
		calc.plus(50.0);
		calc.minus(25.0);
		calc.multiply(2.0);
		calc.divide(2.0);
		
		Calc.result("사칙연산", calc);
	}

}