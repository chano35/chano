package abstracts.action;

public class Bird extends Animal {

	/*
	 * 부모 클래스의 추상 메소드는 자식 클래스에서 반드시 구현을 해야 한다.
	 */
	@Override
	public void move() {
		System.out.println("새는 난다");
	}

	@Override
	public void sound() {
		System.out.println("새는 지저귄다.");
	}
}