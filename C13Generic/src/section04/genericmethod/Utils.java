/*
 * 제네릭 메소드(Generic Method):
 * - 메소에 독립적으로 제네릭을 적용할 때 사용 
 * - <T, R> R method(T t) {}
 *
 */
package section04.genericmethod;

public class Utils {
	
	public static <T> Box <T> boxing (T t) {
		Box<T> box = new Box<>();
		box.set(t);
		return box;
	}
	
	public static <K,V> boolean compare ( Pair<K,V> p1, Pair<K,V> p2) {
		boolean k = p1.getKey().equals(p2.getKey());
		boolean v = p1.getValue().equals(p2.getKey());
		return k&&v;
		
	}

}
