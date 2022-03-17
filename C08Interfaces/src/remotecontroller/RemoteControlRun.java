package remotecontroller;

public class RemoteControlRun {

	public static void main(String[] args) {
		System.out.println("[RemoteControl");
		System.out.println(" > RemoteControl.RC_VALUE:" + RemoteControl.RC_VALUE);
		System.out.println(" > RemoteControl.MAX_VALUE:" + RemoteControl.MAX_VALUE);
		System.out.println(" > RemoteControl.MIN_VALUE:" + RemoteControl.MIN_VALUE);
		
		RemoteControl.changeBattery();
		
		// 인터페이스는 직접 객체화 할 수 없다.
		// Cannot instantiate the type RemoteControl
		// RemoteControl rc = new RemoteControl();
	}

}