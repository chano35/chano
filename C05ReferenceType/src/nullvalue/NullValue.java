package nullvalue;
/*
 * null:
 * - 무효의 값(literal)
 * - 참조타입은 널(null) 값을 가질 수 있다.
 * - 참조타입이 널값을 가지면 스택에 할당은 되지만 힙영역에는 할당되지 않은 상태
 * 
 */
public class NullValue {

	public static void main(String[] args) {
		// 기본타입은 널값을 가질 수 없다.
		// int a = null;
		// int b = (int)null;
		
		// The local variable hello1 may not have been initialized
		// String hello1;
		// System.out.println("hello1=" + hello1); // 초기값이 지정되어 참조할 수 있다.
		
		String hello = null;
		System.out.println("hello=" + hello);
		System.out.println("hello == null : " + (hello == null));
		System.out.println("hello != null : " + (hello != null));
	
		if(hello == null) {
			hello = "hello";
		}
		
		int hellolen = hello.length(); // 스트링의 크기(문자열의 길이)
		System.out.printf("hello: (%s), length(%d)\n", hello, hellolen);
	}

}