package singleton;

//객체가 하나만 생성되는 패턴(싱글톤 패턴)
//- 생성자를 감춰서 외부서 생성(new)을 하지 못하도록 막음(private)
//- static으로 자신의 클래스의 인스턴스(객체_를 생성하고)
//  외부에서 생성도니 객체에 직전 접근할 수 없도록 막음(private)
//- 생성된 자신의 객체를 외부에서 참조할 수 있는 메소드를 제공 (getInstance)
//- 모든 필드는 비공개(private)로 막고 접근할 수 있는 메소드를 공개(public)으로 제공

public class Singleton {
	
	private static Singleton singleton = new Singleton();
	private static int singlecount;
	private String id;
	
	private Singleton() {
		System.out.printf("Singlecount =%d\n", ++singlecount);
	}

	public static Singleton getSingleton() {
		return Singleton.singleton;
	}
	
	public static int singlecount() {
		System.out.println("Singlecount =" + Singleton.singlecount);
		return Singleton.singlecount;
	}
	
	public void info() {
		System.out.printf("[%s] singlecount(%d)\n" , this.id, Singleton.singlecount);
	}


	
	
	
	

}
