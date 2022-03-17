/*
 * 다중의 인터페이스를 상속한 하나의 인터페이스의 구현 클래스
 * - RemoteControl 인터페이스
 * - Searchable 인터페이스
 * - RemoteControlSearchable extends RemoteControl, Searchable
 */
package remotecontroller;

public class SmartTelevision implements RemoteControlSearchable {
	
	// RemoteControl abstract method
	@Override
	public void turnOn() {
		System.out.println("SmartTelevision: On");
	}
	
	@Override
	public void turnOff() {
		System.out.println("SmartTelevision: Off");
	}
	
	@Override
	public void setVolumn(int volumn) {
		System.out.println("SmartTelevision: volumn");
	}
	
	// Searchable abstract method
	@Override
	public void search(String url) {
		System.out.println("SmartTelevision: search");
	}
}