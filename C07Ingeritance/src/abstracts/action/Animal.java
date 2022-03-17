/*
 * 추상클래스는 일반 메소드와 추상 메소드를 혼합해서 정의할 수 있다.
 * - 추상 메소드는 자식 클래스에서 반드시 오버라이드해야 한다.
 * - 일반 메소드는 오버라이드 하지 않아도 되며 
 *   오버라이드 하지 않으면 부모의 메소드를 실행
 * - 일반 메소드는 공통적인 기능을 구현하여 제공한다.  
 */
package abstracts.action;

public abstract class Animal {
	public abstract void move();
	public abstract void sound();
	
	public void breathe() { // 일반 메소드
		System.out.println("모든 동물을 호흡한다.");
	}
}
