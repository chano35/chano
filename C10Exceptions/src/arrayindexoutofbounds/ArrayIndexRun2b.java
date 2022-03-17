/*
 * 1. catch에서 Exception을 맨 위에 기술하면 하위에 있는 
 *    Exception은 도달하지 못해 컴파일 오류 발생
 *    Unreachable catch block for ...
 * 2. Exception은 맨 마지막 catch에 기술
 */
package arrayindexoutofbounds;

public class ArrayIndexRun2b {
	
	public static void main(String[] args) {
		String[] s = { "hello", "world", "." };
		
		int cnt = -1;
		
		// while(++cnt < s.length) { // 정상
		while(++cnt <= s.length) {   // 오류
			try {
				System.out.printf("s[%d]=%s\n", cnt, s[cnt]);
			}
			catch(Exception ex) {
				System.out.println("[Exception]");
				System.out.println(ex.getMessage());
			}
			/*
			catch(ArrayIndexOutOfBoundsException ex) { // Unreachable catch block for ArrayIndexOutOfBoundsException.
				System.out.println("[ArrayIndexOutOfBoundsException]");
				System.out.println(ex.getMessage());
				System.out.println("--------------------------------");
				// ex.printStackTrace();
			}
			catch(NullPointerException ex) { // Unreachable catch block for NullPointerException.
				System.out.println("[NullPointerException]");
				System.out.println(ex.getMessage());
				System.out.println("--------------------------------");
				// ex.printStackTrace();
			}
			*/
		}
		
		System.out.println("THE END");
	}

}