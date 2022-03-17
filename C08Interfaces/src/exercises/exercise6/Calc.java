package exercises.exercise6;

public interface Calc {
	double plus(double value);
	double minus(double value);
	double multiply(double value);
	double divide(double value);
	double total();
	
	public static void result(String title, Calc calc) {
		System.out.printf("[%s]:total(%f)\n", title, calc.total());
	}
}