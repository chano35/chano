package arrayindexoutofbounds;

public class ArrayIndexRun {
	
	public static void main(String[] args) {
		String[] s = { "hello", "world", "." };
		
		System.out.printf("s[0]=%s\n", s[0]);
		System.out.printf("s[1]=%s\n", s[1]);
		System.out.printf("s[2]=%s\n", s[2]);
		
		// array index out of bounds
		// Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException: 
		// Index 3 out of bounds for length 3
		System.out.printf("s[3]=%s\n", s[-2]);
		// System.out.printf("s[3]=%s\n", s[3]);
	}

}