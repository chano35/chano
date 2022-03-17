package section05;

import java.util.function.Predicate;

public class PredicateIsEqualExample {

	public static void main(String[] args) {
		predicateNull();
		predicateNullString();
		predicateStringNull();
		predicateStringString();
	}
	
	public static void predicateNull() {
		Predicate<String> predicate = Predicate.isEqual(null);
		System.out.println("null, null : " + predicate.test(null));
	}
	
	public static void predicateNullString() {
		Predicate<String> predicate = Predicate.isEqual("Java8");
		System.out.println("null, Java8 : " + predicate.test(null));
	}

	public static void predicateStringNull() {
		Predicate<String> predicate = Predicate.isEqual(null);
		System.out.println("Java8, null : " + predicate.test("Java8"));
	}

	public static void predicateStringString() {
		Predicate<String> predicate = Predicate.isEqual("Java8");
		System.out.println("Java8, Java8 : " + predicate.test("Java8"));
		
		Predicate<String> predicate2 = Predicate.isEqual("Java8");
		System.out.println("Java7, Java8 : " + predicate2.test("Java7"));
	}
}