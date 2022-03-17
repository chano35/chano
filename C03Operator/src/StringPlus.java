/*
 * 문자열 연산(+)
 * - 문자열을 붙인다.(연결)
 */
public class StringPlus {

	public static void main(String[] args) {
		System.out.println("Hello, World!");
		System.out.println("Hello" + ", " + "World!");
		
		String hello = "Hello";
		String world = "World";
		String helloworld = hello + ", " + world + "!";
		
		System.out.println(hello);
		System.out.println(world);
		System.out.println(helloworld);
		
		String java = "Java";
		String ver = "Ver";
		//String version;			// 초기값이 할당되지 않아 없는 상태
		String version = "";	// 초기값으로 빈문자열이 할당된 상태

		System.out.printf("version=(%s)\n", version);
		
		version = java + " ";
		version = version + ver;
		version = version + "." + 99;  // 문자열 + 숫자 -> 숫자가 문자열("99")로 변환이 되어 문자열에 연결된다.
		
		System.out.println(version);
		

	}

}