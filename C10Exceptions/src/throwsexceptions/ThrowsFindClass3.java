/*
 * Class.forName(...)은 반드시 catch(ClassNotFoundException e)를 해야 한다.
 * public static Class<?> forName(String className) throws ClassNotFoundException
 * 만약에 try ... catch를 하지 않으면 다음과 같은 컴파일 오류가 발생한다.
 * - Unhandled exception type ClassNotFoundException
 * - 반드시 해당하는 Exception 클래스를 catch에서 기술해야 한다.
 */
package throwsexceptions;

public class ThrowsFindClass3 {
	static final String StringClass = "java.lang.String";
	// static final String StringClass = "java.lang.String2";

	// main을 호출한 JVM이 처리를 대신 하게 된다.
	public static void main(String[] args) throws ClassNotFoundException {
		findClass();
	}

	/*
	 * findClass()를 호출한 메소드(main)에게 예외를 떠넘기기
	 * 그러면 findClass를 try catch를 처리하지 않아도 된다.
	 */
	public static void findClass() throws ClassNotFoundException {
		Class clsString = Class.forName(StringClass);
		if(clsString != null) {
			System.out.printf("(%s) class found\n", StringClass);
		}
	}
}