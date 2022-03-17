package singleton;

public class SingletonMain {
	
	public static void main (String ar[]) {
		
		Singleton s1 = Singleton.getSingleton();
		Singleton s2 = Singleton.getSingleton();
		
		s1.singlecount();
		s2.singlecount();
		Singleton.singlecount();
		
		System.out.println("s1 == s2 ?" + (s1 == s2));
		
		
		
	}

}
