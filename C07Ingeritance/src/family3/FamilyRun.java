package family3;

public class FamilyRun {

	public static void main(String[] args) {
		Child c1 = new Child();
		c1.print("c1");
		
		Child c2 = new Child(400);
		c2.print("c2"); // 부모로부터 물려 받은 money(100) 출력
		c2.print();
		c2.printTotal();
	}

}