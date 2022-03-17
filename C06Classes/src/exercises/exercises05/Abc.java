package exercises.exercises05;

public class Abc {
	int x, y;
	
	Abc() {
		this(0);
		System.out.println("Abc()");
	}
	
	Abc(int x) {
		this.x = x;
		System.out.printf("Abc(%d)\n", x);
	}
	
	Abc(int x, int y) {
		this();
		System.out.printf("Abc(%d, %d)\n", x, y);
	}
	
	public static void main(String[] args) {
		Abc abc = new Abc(10, 20);
	}
}