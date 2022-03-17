package exercises.exercise04;

public class NestedClassExample {

	public static void main(String[] args) {
		Car myCar = new Car();
		Car.Tire tire = myCar.new Tire();		// 인스턴스 멤버 클래스
		Car.Engine engine = new Car.Engine(); 	// 내부 정적 클래스
	}

}