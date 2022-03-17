package statics;

public class CircleArea2 { //클래스
	static float PI;
	static int countCreation = -1;		// 객체생성 갯수
	int count;
	float radius; 			//반지름 //속성
	float area;				//원의 넓이 //속성
	
	CircleArea2(float radius) {
		this.radius = radius;
		this.count++;
		// CircleArea.count++;
		
		// this.countCreation++; //권장하지 않음.
		CircleArea2.countCreation++;
		
		area();
	}
	
	float area() { //메소드
		this.area = radius * radius * PI;
		return this.area;
	}
	
	void print(String title) {
		System.out.printf("CircleArea(%s)\n", title);
		System.out.printf("\t반지름 		:%f\n", this.radius);
		System.out.printf("\t원의넓이 		:%f\n", this.area);
		System.out.printf("\tcount 		:%d\n", this.count);
		System.out.printf("\tcountCreation 	: %d\n", CircleArea2.countCreation);
	}
	
	/*
	 * static method는 this를 가지고 있지 않다.
	 */
	static void printStatic(String title) {
		System.out.printf("CircleArea(%s)\n", title);
		// System.out.printf("\t반지름 		: %f\n", this.radius);
		// System.out.printf("\t원의넓이 		: %f\n", this.area);
		// System.out.printf("\tcount  		: %d\n", this.count);
		System.out.printf("\tcountCreation 	: %d\n", CircleArea2.countCreation);
	}
	static void printStatic(CircleArea2 circle, String title) {
		System.out.printf("CircleArea(%s)\n", title);
		System.out.printf("\t반지름 		: %f\n", circle.radius);
		System.out.printf("\t원의넓이 		: %f\n", circle.area);
		System.out.printf("\tcount  		: %d\n", circle.count);
		System.out.printf("\tcountCreation 	: %d\n", CircleArea2.countCreation);
	}
}
