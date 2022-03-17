package people;

public class Man extends People {
	
	public Man() {}
	
	public Man(String name) {
		super(name);
	}

	void hunt() {
		System.out.printf("Man: hunt(%s)\n", this.name);
	}

}