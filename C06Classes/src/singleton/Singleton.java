/*
 * 객체가 하나만 생성되는 패턴(싱글톤 패턴)
 * - 생정자를 감춰서 외부에서 생성(new)을 하지 못하도록 막음(private)
 * - static으로 자신의 클래스의 인스턴스(객체)를 생성하고
 *   직접 외부에서 생성된 객체에 접근할 수 없도록 막음(private)
 * - 생성된 자신의 객체를 외부에서 참조할 수 있는 메소드를 제공(getInstance)
 * - 모든 필드는 비공개(private)로 막고 접슨할 수 있는 메소드를 공개(public)으로 제공
 */
package singleton;

public class Singleton {
	private static Singleton singleton = new Singleton();
	private static int singlecount;
	private String id; 
	
	private Singleton() {
		System.out.printf("Singleton() : singlecount=%d\n",	++singlecount);
	}
	
	public static Singleton getInstance() {
		return Singleton.singleton;
	}
	
	public static int singlecount() {
		System.out.println("singlecount=" + Singleton.singlecount);
		return Singleton.singlecount;
	}
	
	public void info() {
		System.out.printf("[%s] singlecount(%d)\n", this.id, Singleton.singlecount);
	}
}