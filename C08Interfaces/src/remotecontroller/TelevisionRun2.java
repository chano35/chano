package remotecontroller;

public class TelevisionRun2 {

	public static void main(String[] args) {
		Television tv = new Television("TV7090");
		tv.turnOn();
		tv.setMute(true);
		tv.turnOff();
		
		RemoteControl tvx = new Television("TVX1234");
		tvx.turnOn();
		
		// The method setMute(boolean) is undefined for the type RemoteControl
		// tvx.setMute(true);
		tvx.setMute(true);
		
		tvx.turnOff();
	}

}