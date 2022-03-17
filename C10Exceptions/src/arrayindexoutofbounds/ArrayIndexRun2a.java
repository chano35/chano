package arrayindexoutofbounds;

public class ArrayIndexRun2a {
	
	public static void main(String[] args) {
		String[] s = { "hello", "world", "." };
		
		int cnt = -1;
		
		// while(++cnt < s.length) { // 정상
		while(++cnt <= s.length) {   // 오류
			try {
				System.out.printf("s[%d]=%s\n", cnt, s[cnt]);
			}
			catch(ArrayIndexOutOfBoundsException ex) {
				System.out.println("[ArrayIndexOutOfBoundsException]");
				System.out.println(ex.getMessage());
				System.out.println("--------------------------------");
				// ex.printStackTrace();
			}
			catch(NullPointerException ex) {
				System.out.println("[NullPointerException]");
				System.out.println(ex.getMessage());
				System.out.println("--------------------------------");
				// ex.printStackTrace();
			}
			catch(Exception ex) {
				System.out.println("[Exception]");
				System.out.println(ex.getMessage());
			}
		}
		
		System.out.println("THE END");
	}

}