package section02.generic;

public class Apple {
	private Object obj;
	
	public Apple() {}
	public Apple(Object obj) {
		this.obj = obj;
	}
	
	public void set(Object obj) {
		this.obj = obj;
	}
	
	public Object get() {
		return this.obj;
	}
	
	@Override
	public String toString() {
		String str = String.format("사과:%s", (obj != null) ? obj : "몰라");
		return str;
	}
}