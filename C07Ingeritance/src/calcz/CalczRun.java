package calcz;

public class CalczRun {

	public static void main(String[] args) {
		Calcz calc = new Calcz(10);

		calc.compute("*", 5);
		printSum(calc);
		
		calc.compute("/", 10);
		printSum(calc);

		calc.compute("+", 10);
		printSum(calc);
		
		calc.compute("-", 90);
		printSum(calc);
	}

	static void printSum(Calcz calc) {
		System.out.println("sum=" + calc.getSum());
	}
}