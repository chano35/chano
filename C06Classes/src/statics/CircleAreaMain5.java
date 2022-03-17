package statics;

public class CircleAreaMain5 {
	public static void main(String[] args) {
		System.out.printf("CircleArea의 카운트 : countCreation(%d)\n",CircleArea.countCreation);
		
		CircleArea circle = new CircleArea(3.0f);
		CircleAreaMain5.printStatic(circle, "circle");

		CircleArea circle1 = new CircleArea(4.0f);
		CircleAreaMain5.printStatic(circle1, "circle1");

		CircleArea circle2 = new CircleArea(5.0f);
		CircleAreaMain5.printStatic(circle2, "circle2");
	}
	
	static void printStatic(CircleArea circle, String title) {
		System.out.printf("CircleAreaMain(%s)\n", title);
		System.out.printf("\t반지름        : %f\n", circle.radius);
		System.out.printf("\t원의넓이      : %f\n", circle.area);
		System.out.printf("\tcount         : %d\n", circle.count);
		System.out.printf("\tcountCreation : %d\n", CircleArea.countCreation);
	}
}