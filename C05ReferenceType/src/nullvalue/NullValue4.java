package nullvalue;
/*
 * 문자열 : null & empty
 */
public class NullValue4 {

	public static void main(String[] args) {
		// String hello = null;
		String hello = "";
		System.out.printf("hello=(%s)\n", hello);
		System.out.println("hello == null : " + (hello == null));
		System.out.println("hello != null : " + (hello != null));

		if(hello == null || hello.isEmpty()) {
			hello = new String("hello");
		}
		
		int hellolen = hello.length();     // 스트링의 크기(문자열의 길이)
		boolean helloempty = hello.isEmpty();  // 스트링이 비어있는지 확인(boolean)
		System.out.printf("hello: (%s), length(%d)\n", hello, hellolen);
		System.out.printf("hello: (%s), isEmpty(%b)\n", hello, helloempty);
	}

}