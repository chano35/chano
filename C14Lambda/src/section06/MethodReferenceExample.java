/*
 * [메소드 참조]
 * - 람다식에서 메소드 참조
 * - 클래스::정적메소드
 * - 참조객체::인스턴스메소드
 */
package section06;

import java.util.function.IntBinaryOperator;

public class MethodReferenceExample {

	public static void main(String[] args) {
		referenceStaticMethod();
		referenceInstanceMethod();
	}
	
	/*
	 * 클래스의 이름으로 정적 메소드 참조
	 */
	public static void referenceStaticMethod() {
		IntBinaryOperator oper =  (x,y) -> Calc.staticMethod(x, y);
		System.out.println("정적메소드: " + oper.applyAsInt(10,20));
		
		IntBinaryOperator oper2 = Calc::staticMethod;
		System.out.println("정적메소드: " + oper2.applyAsInt(30,40));
		
		System.out.println("정적멤버변수: " + Calc.staticVal );
	}

	/*
	 * 클래스의 인스턴스 객체 참조변수로 메소드 참조
	 */
	public static void referenceInstanceMethod() {
		Calc calc = new Calc();
		
		IntBinaryOperator oper =  (x,y) -> calc.instanceMethod(x, y);
		System.out.println("인스턴스메소드: " + oper.applyAsInt(10,20));
		
		IntBinaryOperator oper2 = calc::instanceMethod;
		System.out.println("인스턴스메소드: " + oper2.applyAsInt(30,40));
	}

}