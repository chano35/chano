package classcast;

public class CatDogRun3 {

	public static void main(String[] args) {
		Dog dog = new Dog();
		changeAnimal(dog);
		
		Cat cat = new Cat();
		changeAnimal(cat); 
		
		System.out.println("THE END");

	}
	
	public static void changeAnimal(Animal animal) {
		if(animal instanceof Dog) {
			Dog dog = (Dog)animal;
			System.out.println("강아지입니다." + dog);
		}
		else if(animal instanceof Cat) {
			Cat cat = (Cat)animal;
			System.out.println("고양이입니다." + cat);
		}
		else {
			System.out.println("animal은 고양이도 아니고 강아지도 아닙니다.");
		}
	}

}