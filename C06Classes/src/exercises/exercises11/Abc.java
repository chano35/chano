package exercises.exercises11;

public class Abc {
	int x, y;
	private int z;
	
	Abc(int x, int y) {
		System.out.printf("Abc(%d, %d)\n", x, y);
		this.z = 99;
	}
	
	void print(int x) {
		System.out.printf("Abc.print(%d)\n", x);
	}
	
	int print(String str) {
		String msg = "Abc.print(" + str + ")\n";
		System.out.println(msg);
		return msg.length();
	}
	
	int print(int ... values) {
		int len = values.length;
		System.out.printf("print(len:[%d])\n", len);
		for(int cnt=0; cnt < len; cnt++) {
			System.out.printf("[%d][%d]\n", cnt, values[cnt]);
		}
		
		return len;
	}
	
	public static void main(String[] args) {
		Abc abc = new Abc(10, 20);
		abc.print(10);
		abc.print("Hello");
		abc.print(2,4,6);
		abc.print(1,3,5,7,9);
	}
}