package section02.generic;

public class AppleRun {

	public static void main(String[] args) {
		Apple apple = new Apple();
		apple.set(new String("홍옥"));
		
		Object obj = apple.get();
		String str = (String)obj;
		
		System.out.println("apple=" + str);
	}

}