package family3;

public class Parent {
	int money = 100;
	int asset = 0;
	
	Parent() {
		System.out.println("Parent()");
	}
	
	Parent(int money) {
		this.money = money;
		System.out.printf("Parent(int:%d)\n", money);
	}
	
	Parent(String money) {
		this.money = Integer.parseInt(money);
		System.out.printf("Parent(String:%d)\n", money);
	}
	
	void print(String title) {
		if(this.money == 0) {
			return;
		}
		System.out.printf("Parent(%s) : money(%d)\n", title, this.money);
	}
	
	int print() {
		System.out.printf("Parent(notitle) : money(%d)\n", this.money);
		System.out.printf("Parent(notitle) : asset(%d)\n", this.asset);
		return this.money;
	}
	
	boolean eqObject(Parent parent) {
		return (this == parent);
	}
	
	boolean eqMoney(Parent parent) {
		return (this.money == parent.money);
	}
	
	boolean eqAsset(Parent parent) {
		return (this.asset == parent.asset);
	}

}