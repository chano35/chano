package section02.generic;

public class BoxRun3 {

	public static void main(String[] args) {
		Box<Apple> box = new Box<Apple>();
		box.set(new Apple("파인애플"));
		// box.set(new Apple());
		
		Apple apple = box.get();
		// apple.set("파인애플");
		System.out.println("apple:" + apple);
		
		box.print();
	}

}