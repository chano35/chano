package calcx2;

public class CalcxRun {

	public static void main(String[] args) {
		Calcx calc = new Calcx(10);

		calc.compute("*", 5);
		printSum(calc);
		
		calc.compute("/", 10);
		printSum(calc);

		calc.compute("+", 10);
		printSum(calc);
		
		calc.compute("-", 90);
		printSum(calc);
	}

	static void printSum(Calcx calc) {
		System.out.println("sum=" + calc.getSum());
	}
}