package statics;

public class CircleAreaMain2 {
	
	public static void main(String[] args) {
		System.out.printf("CircleArea의 카운트 : countCreation(%d)\n",
		CircleArea.countCreation); //값을 지정하지 않았기 때문에 0
		
		CircleArea circle = new CircleArea(3.0f);
		System.out.printf("circle의 카운트 : count(%d), countCreation(%d)(%d)\n",
				circle.count, circle.countCreation, CircleArea.countCreation);
		
		CircleArea circle1 = new CircleArea(4.0f);
		System.out.printf("circle1의 카운트 : count(%d), countCreation(%d)(%d)\n",
				circle1.count, circle1.countCreation, CircleArea.countCreation);
		
		CircleArea circle2 = new CircleArea(4.0f);
		System.out.printf("circle2의 카운트 : count(%d), countCreation(%d)(%d)\n",
				circle2.count, circle2.countCreation, CircleArea.countCreation);
		
		CircleArea circle3 = new CircleArea(4.0f);
		System.out.printf("circle3의 카운트 : count(%d), countCreation(%d)\n",
				circle3.count,  CircleArea.countCreation);
	}

}
