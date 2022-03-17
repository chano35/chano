package exercises.exercises16;

public class Printer {
	void println(int x) {
		System.out.printf("Printer.println(%d)\n", x);
	}

	void println(boolean x) {
		System.out.printf("Printer.println(%b)\n", x);
	}

	void println(double x) {
		System.out.printf("Printer.println(%f)\n", x);
	}

	void println(String x) {
		System.out.printf("Printer.println(%s)\n", x);
	}

}