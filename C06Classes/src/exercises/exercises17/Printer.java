package exercises.exercises17;

public class Printer {
	static void println(int x) {
		System.out.printf("Printer.println(%d)\n", x);
	}

	static void println(boolean x) {
		System.out.printf("Printer.println(%b)\n", x);
	}

	static void println(double x) {
		System.out.printf("Printer.println(%f)\n", x);
	}

	static void println(String x) {
		System.out.printf("Printer.println(%s)\n", x);
	}

}