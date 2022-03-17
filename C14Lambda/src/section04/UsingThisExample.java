package section04;

public class UsingThisExample {

	public static void main(String[] args) {
		UsingThis usingThis = new UsingThis();
		usingThis.add(50);
		
		UsingThis.Inner innerUsing = usingThis.new Inner();
		innerUsing.method();
		
		usingThis.add(40);
		innerUsing.method();
	}
}