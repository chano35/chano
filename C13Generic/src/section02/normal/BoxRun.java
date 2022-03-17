package section02.normal;

public class BoxRun {

	public static void main(String[] args) {
		Box box = new Box();
		box.set("홍길동");
		
		String str = (String)box.get();
		System.out.println(str);
		
		box.set(32);
		int x = (int)box.get();
		System.out.println(x);
		
		box.set(new Apple());
		Apple apple = (Apple)box.get();
		System.out.println(apple);
		
		/*
		 * Object로 선언을 하게 되면 모든 타입의 값을 저장할 수 있다.
		 * 하지만 잘못된 캐스팅으로 인한 실행 오류의 가능성이 있다.
		 */
		String hello = (String)box.get();
		System.out.println(hello);
	}

}