/*
 * Class.forName(...)은 반드시 catch(ClassNotFoundException e)를 해야 한다.
 * public static Class<?> forName(String className) throws ClassNotFoundException
 * 만약에 try ... catch를 하지 않으면 다음과 같은 컴파일 오류가 발생한다.
 * - Unhandled exception type ClassNotFoundException
 * - 반드시 해당하는 Exception 클래스를 catch에서 기술해야 한다.
 */
package throwsexceptions;

public class ThrowsFindClass {

	public static void main(String[] args) {
		findClass();
	}

	public static void findClass() {
		final String StringClass = "java.lang.String";
		
		try {
			Class clsString = Class.forName(StringClass);
			if(clsString != null) {
				System.out.printf("(%s) class found\n", StringClass);
			}
		}
		catch(ClassNotFoundException e) {
			System.out.printf("(%s) class not found\n", StringClass);
		}
	}
}