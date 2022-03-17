/*
 * 인터페이스의 익명구현객체 선언
 */
package section03;

public class MyFunctionalInterfaceExampleX {

	public static void main(String[] args) {
		step1();
		step2();
	}
	
	static void step1() {
		MyFunctionalInterfaceX myfunc = (int x) -> {
			System.out.println("MyFunctionalInterfaceX: x=" + x);
		};
		
		myfunc.method(99);
	}
	
	static void step2() {
		MyFunctionalInterfaceX myfunc = x -> System.out.println("MyFunctionalInterfaceX: x=" + x);
		myfunc.method(99);
	}	
}