/*
 * @Override
 * 1. 상속을 받는 클래스에서 상위 클래스의 메소드를
 *    명시적으로 재정의 한다는 것을 알린다.
 * 2. 상위 클래스 메소드 형식과 일치하지 않으면 컴파일 오류를 발생시켜서
 *    오류를 예방하는 효과가 있다.    
 */
package family3;

public class Child2 extends Parent {

	@Override
	void print(String title) {
		super.print(title);
		System.out.printf("Child2(%s) : money(%d)\n", title, this.money);
	}

	/*
	@Override
	void print(int title) {
	}
	*/
	
	

}