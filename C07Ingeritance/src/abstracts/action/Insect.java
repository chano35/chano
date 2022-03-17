package abstracts.action;

public class Insect extends Animal {

	@Override
	public void move() {
		System.out.println("곤충은 기어 다닌다.");
	}
	
	@Override
	public void sound() {
		System.out.println("곤충은 날개를 비벼서 소리를 낸다.");
	}	

}