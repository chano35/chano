package section02.generic;

public class BoxRun2 {

	public static void main(String[] args) {
		Box<Integer> box = new Box<Integer>();
		box.set(12345);
		
		Integer num = box.get();
		System.out.println(num);
	}

}