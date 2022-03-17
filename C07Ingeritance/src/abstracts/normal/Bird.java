package abstracts.normal;

public class Bird extends Animal {
	String name = "앵무새";
	
	@Override
	public void fly() {
		super.fly();
		System.out.printf("%s는 흉내를 낸다.\n", name);
	}

}