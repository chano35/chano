package family;

public class FamilyRun {

	public static void main(String[] args) {
		Child child = new Child();
		child.print("child");
		
		System.out.println("Parent.money : " + child.money);
		
		Parent parent = new Parent();
		parent.print("parent");
		
		boolean eq = (parent == child);
		boolean e1 = parent.equals(child);
		boolean e2 = parent.eqObject(child);
		boolean e3 = parent.eqMoney(child);
		boolean e4 = parent.eqAsset(child);
		System.out.println("(parent == child) ? " + eq); // false
		System.out.println("parent.equals(child) ? " + e1); // false
		System.out.println("parent.eqObject(child) ? " + e2); // false
		System.out.println("parent.eqMoney(child) ? " + e3); // true
		System.out.println("parent.eqAsset(child) ? " + e4); // true
		
		Child child2 = new Child();
		boolean eq2 = (child == child2);
		System.out.println("(child == child2) ? " + eq2); // false
	
		String str = "hello";
		boolean sq = str.equals("hello");
		System.out.println("str.equals('hello') ? " + sq); // true
		
	}

}