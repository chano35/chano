package statics;

public class CircleAreaMain4 {
	
	public static void main(String[] args) {
		System.out.printf("CircleArea의 카운트 : countCreation(%d)\n",
		CircleArea.countCreation); //값을 지정하지 않았기 때문에 0
		
		CircleArea circle = new CircleArea(3.0f);
		CircleArea.printStatic(circle, "circle");
		
		CircleArea circle1 = new CircleArea(4.0f);
		CircleArea.printStatic(circle1, "circle1");
		
		CircleArea circle2 = new CircleArea(5.0f);
		CircleArea.printStatic(circle2, "circle2");
		
	}

}
