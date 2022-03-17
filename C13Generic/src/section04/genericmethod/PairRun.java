package section04.genericmethod;

public class PairRun {

	public static void main(String[] args) {
		Pair<String, Integer> p1 = new Pair<>("사과", 100);
		Pair<String, Integer> p2 = new Pair<>("애플", 100);
		Pair<String, Integer> p3 = new Pair<>("애플", 100);
		
		boolean b1 = Utils.<String, Integer>compare(p1, p2);
		boolean b2 = Utils.compare(p1, p3);
		boolean b3 = Utils.compare(p2, p3);
		
		System.out.println("b1= " + b1); // false
		System.out.println("b2= " + b2); // false
		System.out.println("b3= " + b3); // true
		
		

	}
}
