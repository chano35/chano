package Singleton2;

public class SingletonMain {

	public static void main(String[] args) {
		Singleton s1 = Singleton.getInstance("Hello");
		s1.info();

		Singleton s2 = Singleton.getInstance();
		s2.info();
		System.out.println("s1 == s2 ? " + (s1 == s2));
	}

}