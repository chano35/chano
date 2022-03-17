package family;

public class ParentRun {

	public static void main(String[] args) {
		Parent p0 = new Parent(0);
		Parent p1 = new Parent(); 
		Parent p2 = new Parent(900);
		Parent p3 = new Parent("2000");

		p0.print("p0");
		p1.print("p1");
		p2.print("p2");
		
		int p3_money = p3.print();
		System.out.println("p3_money:" + p3_money);
	}

}