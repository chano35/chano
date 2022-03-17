/*
 * 인터페이스를 이용하여 추상 클래스를 정의
 * - 클래스 앞에 abstract 명시
 * - 인터페이스에 정의된 메소드를 abstract로 명시하거나
 *   메소드의 시그니처를 생략
 * 
 */
package remotecontroller;

public abstract class SmartTV implements RemoteControl {

	@Override
	public void turnOn() {
		System.out.println("SmartTV: On");
	}
	
	@Override
	public void turnOff() {
		System.out.println("SmartTV: Off");
	}

	/*
	@Override
	public void setVolumn(int volumn) {}
	*/

	@Override
	public abstract void setVolumn(int volumn);

}