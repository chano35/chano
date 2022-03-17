/*
 * [람다식 인터페이스]
 * 1. 인터페이스(interface)로 정의
 * 2. 추상메소드는 한 개만 정의
 * 3. @FunctionalInterface는 옵션
 *    - 이 옵션을 지정하면 컴파일러가 메소드의 갯수를 체크
 *    - 메소드가 2개 이상이면 오류
 * 4. 메소드를 하나만 가지고 있는 모든 인터페이스는 람다식으로 사용할 수 있다. 
 */
package section03;

@FunctionalInterface
public interface MyFunctionalInterfaceExample {
	public void method();
}