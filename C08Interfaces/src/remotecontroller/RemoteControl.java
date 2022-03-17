/*
 * 인터페이스(Interface)
 * 1. 상수 필드(Constant Field)
 *    - static final을 명시하지 않아도 상수로 처리
 *    - 인스턴스 변수를 가질 수 없다.
 * 2. 추상 메소드(Abstract Method)
 *    - 모든 메소드는 추상 메소드가 되어 구현을 가질 수 없다.
 * 3. 디폴트 메소드(Default Method)
 *    - 메소드의 앞에 default를 명시
 * 4. 정적 메소드(Static Method)
 *    - 구현 클래스가 없어도 호출 할 수 있다.
 */
package remotecontroller;

public interface RemoteControl {
	// 상수
	public static final int RC_VALUE = 5;
	public int MAX_VALUE = 10;
	public int MIN_VALUE = 0;
	
	// 추상 메소드: 구현을 가지고 있지 않는 모든 메소드
	public void turnOn();
	public void turnOff();
	public void setVolumn(int volumn);
	
	// 추가 메소드: 디폴트로 하면 구현 클래스에 영향을 주지 않고 확장
	// public void setMute(boolean mute) {
	default public void setMute(boolean mute) {
	}
	
	// 디폴트 메소드: default
	default public void setChannel(int channel) {
		System.out.println("채널변경");
	}
	
	// 정적 메소드: static
	public static void changeBattery() {
		System.out.println("배터리 교환");
	}
}