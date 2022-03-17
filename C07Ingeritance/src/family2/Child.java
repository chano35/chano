/*
 * 1. super()는 명시적으로 부모의 생성자를 명시적으로 호출
 *    그러나 명시하지 않으면 부모의 디폴트 생성자가 호출된다.
 * 2. super()는 생성자에서 다른 명령문 보다 가장 먼저 기술되어야 한다.
 * 
 */
package family2;

public class Child extends Parent {
	Child() {
		// super(); // 부모의 생성자를 명시적으로 호출
		System.out.println("Child()");
	}
	
	Child(int money) {
		super(money);
		System.out.printf("Child(%d)\n", money);
		// this.money = money;
	}
}