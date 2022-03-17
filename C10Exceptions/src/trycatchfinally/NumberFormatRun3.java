/*
 * 멀티 catch:
 * 여러 catch를 하나의 예외 객체로 받을 때 사용
 * 예: 
 *     catch(예외클래스 | 예외클래스 | 예외클래스 예외객체) {
 *     		...
 *     }
 */
package trycatchfinally;

public class NumberFormatRun3 {

	public static void main(String[] args) {
		
		// String[] lists = { "hello", "world" };
		// int result = add(lists);
		int result = add(args);
		
		System.out.println("result=" + result);
	}
	
	static int add(String[] args) {

		try {
			String s1 = args[0];
			String s2 = args[1];
			int x = Integer.parseInt(s1);
			int y = Integer.parseInt(s2);
			int z = x + y;
			return z;
		}
		catch(NumberFormatException | ArrayIndexOutOfBoundsException e) {
			System.out.println("전달된 자료가 잘못되었습니다.");
			System.out.println(e.getMessage());
		}
		finally {
			System.out.println("finally: 마무리 작업");
		}
		
		return -1;
	}

}