package abstracts.normal;

public class AnimalRun {

	public static void main(String[] args) {
		action(new Bird());
		action(new Fish());
	}
	
	static void action(Animal animal) {
		if(animal instanceof Bird) {
			animal.fly();
		}
		else if(animal instanceof Fish) {
			animal.swim();
		}
	}
	
	static void action(Bird bird) {
		bird.fly();
	}

	static void action(Fish fish) {
		fish.swim();
	}

}