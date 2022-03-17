package arrayindexoutofbounds;

public class ArrayIndexRun2 {
	
	public static void main(String[] args) {
		String[] s = { "hello", "world", "." };
		
		try {
			System.out.printf("s[0]=%s\n", s[0]);
			System.out.printf("s[1]=%s\n", s[1]);
			System.out.printf("s[2]=%s\n", s[2]);
			
			// array index out of bounds
			// Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException: 
			// Index 3 out of bounds for length 3
			System.out.printf("s[3]=%s\n", s[3]);
		}
		catch(ArrayIndexOutOfBoundsException ex) {
			System.out.println("[ArrayIndexOutOfBoundsException]");
			System.out.println(ex.getMessage());
			System.out.println("--------------------------------");
			// ex.printStackTrace();
		}
		
		System.out.println("THE END");
	}

}