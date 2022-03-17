package section02.generic;

public class AppleRun2 {

	public static void main(String[] args) {
		Apple apple = new Apple();
		apple.set(new Integer(40));
		
		Integer obj = (Integer)apple.get();
		obj += 10;
		
		// String obj = (String)apple.get();
		// obj += 10;
		
		System.out.println("apple=" + obj);
	}

}