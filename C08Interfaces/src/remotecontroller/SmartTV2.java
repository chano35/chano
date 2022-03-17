/*
 * 다중의 인터페이스의 구현 클래스
 * - 구현하고자 하는 인터페이스를 콤마(,)로 구분하여 명시
 * - 해당 인터페이스의 모든 추상 메소드의 구현을 정의
 */
package remotecontroller;

public class SmartTV2 implements RemoteControl, Searchable {
	
	// RemoteControl abstract method
	@Override
	public void turnOn() {
		System.out.println("SmartTV2: On");
	}
	
	@Override
	public void turnOff() {
		System.out.println("SmartTV2: Off");
	}
	
	@Override
	public void setVolumn(int volumn) {
		System.out.println("SmartTV2: volumn");
	}
	
	// Searchable abstract method
	@Override
	public void search(String url) {
		System.out.println("SmartTV2: search");
	}
}