package statics;

public class CircleAreaMain {
	public static void main(String[] args) {
		CircleArea circle = new CircleArea(3.0f);
		
		//CircleArea 이라는 클래스가 뉴를 만나서 객체가됨(circle)
		
		System.out.printf("원주율 : %f\n", CircleArea.PI);
		//CircleArea.PI = 클래스에 소속된 맴버
		System.out.printf("원주율 : %f\n", circle.PI);
		//circle.PI = 객체에 소속된 맴버 (사용은 가능하나 주로 사용하지 않음)
	//	System.out.printf("원주율 : %f\n", CircleArea.area);
		System.out.printf("원주율 : %f\n", circle.area);
		
		System.out.printf("반지름이 %f인 원의 넓이 : %f\n", 3.0f, circle.area());
	}

}
