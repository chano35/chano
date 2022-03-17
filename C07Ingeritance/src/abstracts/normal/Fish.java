package abstracts.normal;

public class Fish extends Animal {
	String name = "연어";
	
	@Override
	public void swim() {
		super.swim();
		System.out.printf("%s는 민물과 바다에서 수영을 한다.\n", name);
	}

}