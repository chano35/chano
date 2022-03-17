/*
 * 인터페이스의 익명구현객체 선언
 */
package section03;

public class MyFunctionalInterfaceExample2 {

	public static void main(String[] args) {
		normal();
		lambda();
	}
	
	public static void lambda() {
		MyFunctionalInterface myfunc = () -> {
			System.out.println("MyFunctionalInterface의 "
					+ "람다식 구현 객체");
		};
		
		myfunc.method();
	}
	
	public static void normal() {
		MyFunctionalInterface myfunc = new MyFunctionalInterface() {
			@Override
			public void method() {
				System.out.println("MyFunctionalInterface의 익명 구현 객체");
			}
		};
		
		myfunc.method();
	}
}