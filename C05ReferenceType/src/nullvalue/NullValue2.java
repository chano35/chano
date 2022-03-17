package nullvalue;
/*
 * 빈 문자열 : ""
 * - 문자열에 빈 문자열을 할당하게 되면 힙영역 빈문자열 공간을 할당
 * 
 */
public class NullValue2 {

	public static void main(String[] args) {
		String hello = "";
		System.out.printf("hello=(%s)\n", hello);
		System.out.println("hello == null : " + (hello == null));
		System.out.println("hello != null : " + (hello != null));

		if(hello == null || hello.isEmpty()) {
			hello = "hello";
		}
		
		int hellolen = hello.length();         // 스트링의 크기(문자열의 길이)
		boolean helloempty = hello.isEmpty();  // 스트링이 비어있는지 확인(boolean)
		System.out.printf("hello: (%s), length(%d)\n", hello, hellolen);
		System.out.printf("hello: (%s), isEmpty(%b)\n", hello, helloempty);
	}

}