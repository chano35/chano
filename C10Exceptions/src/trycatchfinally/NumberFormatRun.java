/*
 * 1. try ... catch에서 finally는 옵션으로 
 *    try ... catch문이 실행된 후 최종적으로 항상 실행되는 블럭이다.
 * 2. 정상적으로 try 문이 실행되거나 예외가 발생하여 catch문이 실행되어도 최종적으로 항상 실행이 된다.
 * 3. finally 블럭에는 반드시 실행되어야 할 처리 루틴을 기술한다.    
 * 
 */
package trycatchfinally;

public class NumberFormatRun {

	public static void main(String[] args) {
		String s1 = null;
		String s2 = null;

		if(args.length > 0) {
			s1 = args[0];
		}
		
		if(args.length > 1) {
			s2 = args[1];
		}
		
		try {
			int x = Integer.parseInt(s1);
			int y = Integer.parseInt(s2);
			int z = x + y;
			System.out.printf("String(s1:\"%s\") -> int(val1:%d)\n", s1, x);
			System.out.printf("String(s2:\"%s\") -> int(val2:%d)\n", s2, y);
			System.out.printf("x(%d) + y(%d) = z(%d)\n", x, y, z);
		}
		catch(NumberFormatException e) {
			System.out.println("전달된 파라미터에 숫자로 변환할 수 없는 값이 포함되었습니다.");
			System.out.println(e.getMessage());
		}
		finally {
			if(args.length < 2) {
				System.out.println("연산을 정상적으로 수행하기 위해서는 2개의 파라미터가 필요합니다.");
			}
			else {
				System.out.println("연산을 정상적으로 수행했습니다.");
			}
		}
	}

}