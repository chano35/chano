package singleton;

public class SingletonMain {

	public static void main(String[] args) {
		/*
		Singleton s1 = new Singleton();
		Singleton s2 = new Singleton();
		System.out.println("s1 == s2 ? " + (s1 == s2)); // false
		*/
			
		Singleton s1 = Singleton.getInstance();
		Singleton s2 = Singleton.getInstance();

		s1.singlecount();
		s2.singlecount();
		Singleton.singlecount();

		System.out.println("s1 == s2 ? " + (s1 == s2)); // true
	}

}