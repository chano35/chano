package abstracts.action;

public class AnimalRun3 {

	public static void main(String[] args) {
		Bird bird = new Bird();
		Fish fish = new Fish();
		Insect insect = new Insect();
		
		action(bird);
		action(fish);
		action(insect);
		
		specify(bird);
		specify(fish);
		specify(insect);
	}
	
	
	static void action(Animal animal) {
		System.out.println("[동물의 행동]");
		animal.move();
		animal.sound();
	}
	
	static void specify(Animal animal) {
		System.out.println("[동물의 특징]");
		animal.breathe();
	}

}