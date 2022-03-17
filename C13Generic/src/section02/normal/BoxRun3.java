package section02.normal;

public class BoxRun3 {

	public static void main(String[] args) {
		Box box = new Box();
		box.set("홍길동");
		process(box);

		Apple apple = new Apple();
		apple.set("파일이플");
		process(apple);
	}
	
	// 메소드 오버로딩(overloading)
	static void process(Box object) {
		System.out.println("Box: " + object.get());
	}
	
	static void process(Apple object) {
		System.out.println("Apple: " + object.get());
	}
}