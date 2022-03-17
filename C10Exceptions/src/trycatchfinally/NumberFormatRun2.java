/*
 * 1. try ... catch에서 finally는 옵션으로 
 *    try ... catch문이 실행된 후 최종적으로 항상 실행되는 블럭이다.
 * 2. 정상적으로 try 문이 실행되거나 예외가 발생하여 catch문이 실행되어도 최종적으로 항상 실행이 된다.
 * 3. finally 블럭에는 반드시 실행되어야 할 처리 루틴을 기술한다.    
 * 4. try {} 나 catch {} 블럭에서 리턴(return)을 만나더라도 finally {}을 실행하고 리턴한다.
 * 5. catch {} 블럭에서 예외를 받지 못하여 비정상 종료를 하더라도 finally는 무조건 실행된다.
 */
package trycatchfinally;

public class NumberFormatRun2 {

	public static void main(String[] args) {
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
		catch(NumberFormatException e) {
			System.out.println("전달된 파라미터에 숫자로 변환할 수 없는 값이 포함되었습니다.");
			System.out.println(e.getMessage());
			return -8;
		}
		catch(ArrayIndexOutOfBoundsException e) {
			System.out.println(e.getMessage());
			return -9;
		}
		finally {
			System.out.println("finally: 마무리 작업");
		}
		
		// return -1;
	}

}