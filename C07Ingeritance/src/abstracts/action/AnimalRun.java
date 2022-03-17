package abstracts.action;

public class AnimalRun {

	public static void main(String[] args) {
		action(new Bird());
		action(new Fish());
		action(new Insect());
	}
	
	static void action(Animal animal) {
		animal.move();
	}

}