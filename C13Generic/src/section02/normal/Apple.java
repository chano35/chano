package section02.normal;

public class Apple {
	private Object obj;
	
	public void set(Object obj) {
		this.obj = obj;
	}
	
	public Object get() {
		return this.obj;
	}
	
	@Override
	public String toString() {
		return "사과야!";
	}
	

}