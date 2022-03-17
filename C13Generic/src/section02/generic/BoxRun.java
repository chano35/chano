package section02.generic;

public class BoxRun {

	public static void main(String[] args) {
		Box<String> box = new Box<String>();
		box.set("제넥릭 상자");
		
		// 컴파일러 잘못된 자료형 선언되지 않은 형태로 사용되는 것을 방지
		// The method set(String) in the type Box<String> is not applicable for the arguments (int)
		// box.set(1234);

		// 캐스팅을 해도 된다. 
		String str1 = (String)box.get();
		System.out.println(str1);
		
		// 캐스팅을 할 필요가 없다.
		String str2 = box.get();
		System.out.println(str2);
	}

}