package section04.genericmethod;

public class PairRun2 {

	public static void main(String[] args) {
		Pair<String, Box<Integer>> p1 = new Pair<>("사과", new Box<Integer>(100));
		Pair<String, Box<Integer>> p2 = new Pair<>("애플", new Box<>(100));
		Pair<String, Box<Integer>> p3 = new Pair<>("애플", new Box<>(100));
		
		boolean b1 = Utils.<String, Box<Integer>>compare(p1, p2);
		boolean b2 = Utils.compare(p1, p3);
		boolean b3 = Utils.compare(p2, p3);
		
		System.out.println("b1= " + b1); // false
		System.out.println("b2= " + b2); // false
		System.out.println("b3= " + b3); // false
		
		Box<Integer> box = new Box<>(100);
		Pair<String, Box<Integer>> p4 = new Pair<>("과자", box);
		Pair<String, Box<Integer>> p5 = new Pair<>("과자", box);
		boolean b4 = Utils.compare(p4, p5);
		System.out.println("b4= " + b4);	// true
		

	}

}