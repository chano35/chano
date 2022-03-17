package section02.normal;

public class BoxRun2 {

	public static void main(String[] args) {
		Box box = new Box();
		box.set("홍길동");
		process(box);

		Apple apple = new Apple();
		apple.set("파일이플");
		process(apple);
	}
	
	static void process(Object object) {
		if(object instanceof Box) {
			Box box = (Box)object;
			System.out.println("Box: " + box.get());
		}
		else if(object instanceof Apple) {
			Apple apple = (Apple)object;
			System.out.println("Apple: " + apple.get());
		}
	}
}