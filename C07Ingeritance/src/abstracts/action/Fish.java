package abstracts.action;

public class Fish extends Animal {
	
	@Override
	public void move() {
		System.out.printf("물고기는 헤엄을 친다.\n");
	}
	
	@Override
	public void sound() {
		System.out.println("물고기는 뻐금거린다.");
	}

	@Override
	public void breathe() {
		System.out.println("물고기는 부레로 호흡을 한다.");
	}

}