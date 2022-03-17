package nullvalue;
/*
 * 문자열 : null & empty
 */
public class NullValue3 {

	public static void main(String[] args) {
		String hello = "";
		System.out.printf("hello=(%s)\n", hello);
		System.out.println("hello == null : " + (hello == null));
		System.out.println("hello != null : " + (hello != null));

		int hellolen = hello.length();         // 스트링의 크기(문자열의 길이)
		boolean helloempty = hello.isEmpty();  // 스트링이 비어있는지 확인(boolean)
		System.out.printf("hello: (%s), length(%d)\n", hello, hellolen);
		System.out.printf("hello: (%s), isEmpty(%b)\n", hello, helloempty);

		if(hello == null || hello.isEmpty()) {
			hello = "hello";
		}
		
		hellolen = hello.length();         // 스트링의 크기(문자열의 길이)
		helloempty = hello.isEmpty();  // 스트링이 비어있는지 확인(boolean)
		System.out.printf("hello: (%s), length(%d)\n", hello, hellolen);
		System.out.printf("hello: (%s), isEmpty(%b)\n", hello, helloempty);
	}

}