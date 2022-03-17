/*
 * T : 제네릭 타입
 * <T>는 임의의 타입이 올 수 있다는 의미
 * T = (String | Class | ...)
 * -----------------------------------------
 * 1. 클래스를 선언할 때 타입이 결정(객체화 할 때)
 */
package section02.generic;

public class Box<T> {
	private T name;
	
	public void set(T name) {
		this.name = name;
	}
	
	public T get() {
		return this.name;
	}
	
	public void print() {
		System.out.println("Box:" + this.name);

		// System.out.println("Box:" + this.name.get());
		
		if(this.name instanceof Apple) {
			Apple apple = (Apple)this.name;
			System.out.println("apple:" + apple.get());
		}
	}
}

/*
Box<String> box = new Box<String>();
public class Box {
	private String name;
	
	public void set(String name) {
		this.name = name;
	}
	
	public String get() {
		return this.name;
	}
}
-----------------------------------------
Box<Integer> box = new Box<Integer>();
public class Box {
	private Integer name;
	
	public void set(Integer name) {
		this.name = name;
	}
	
	public Integer get() {
		return this.name;
	}
}
-----------------------------------------
Box<Apple> box = new Box<Apple>();
public class Box {
	private Apple name;
	
	public void set(Apple name) {
		this.name = name;
	}
	
	public Apple get() {
		return this.name;
	}
}
*/