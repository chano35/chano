package section02.generic;

public class BoxRun4 {

	public static void main(String[] args) {
		// Box<Apple> box = new Box<Apple>();
		Box<Apple> box = new Box<>();
		
		box.set(new Apple("파인애플"));
		box.print();
	}

}