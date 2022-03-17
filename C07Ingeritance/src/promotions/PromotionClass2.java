package promotions;

class A1 {}

class B1 extends A1 {}
class B11 extends B1 {}
class B12 extends B1 {}

class C1 extends A1 {}
class C11 extends C1 {}
class C12 extends C1 {}

public class PromotionClass2 {

	public static void main(String[] args) {
		System.out.println("Promotion Class2");
		
		B1 b1 = new B1();
		C1 c1 = new C1();
		
		B11 b11 = new B11();
		B12 b12 = new B12();
		
		C11 c11 = new C11();
		C12 c12 = new C12();
		
		// A1은 모든 클래스의 조상으로서 자동 타입 변환 가능
		A1 a1 = b1;
		A1 a2 = c1;
		A1 a3 = b11;
		A1 a4 = b12;
		A1 a5 = c11;
		A1 a6 = c12;
		
		// B1은 B11, B12의 부모로서 자동 타입 변환 가능
		B1 b1a = b11;
		B1 b1b = b12;
		
		// C1은 C11, C12의 부모로서 자동 타입 변환 가능
		C1 c1a = c11;
		C1 c1b = c12;
		
		// B1, C1은 같은 부모이지만 형제관계는 타입 변환을 할 수 없다.
		// B1 b1x = c1;
		// C1 c1x = b1;
		
		// B11, B12 형제관계이므로 타입 변환을 할 수 없다.
		// B11 b11x = b12;
		// B12 b12x = b11;
		
		// C11, C12
	}

}