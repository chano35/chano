package section04.genericmethod;

public class Box<T> {
	
	private T name;
	
	public Box() {}
	public Box (T name) {
		this.name = name;
	}
	
	public void set(T name) {
		this.name = name;
	}
	
	public T get() {
		return this.name;
	}
	

}
