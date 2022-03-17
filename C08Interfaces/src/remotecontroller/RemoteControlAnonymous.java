/*
 * 익명(Anonymous) 구현 객체
 * - 구현 클래스의 선언과 동시에 객체화
 * - 임시로 객체를 만들어 사용
 * - 한 번 쓰고 버리는 객체
 * - 재활용이 필요없는 클래스 
 */
package remotecontroller;

public class RemoteControlAnonymous {

	public static void main(String[] args) {
		// Cannot instantiate the type RemoteControl
		// RemoteControl rc = new RemoteControl();

		RemoteControl radio = new RemoteControl() {
			@Override
			public void turnOn() {
				System.out.println("Radio On");
			}
			
			@Override
			public void turnOff() {
				System.out.println("Radio Off");
			}
			
			@Override
			public void setVolumn(int volumn) {
				System.out.println("Radio volumn");
			}
		}; // 반드시 세미콜론(;)
		
		radio.turnOn();
		radio.setVolumn(7);
		radio.turnOff();
	}

}