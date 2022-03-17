package remotecontroller;

public class AudioControlRun2 {

	public static void main(String[] args) {
		RemoteControl ac = new AudioControl();
		ac.turnOn();
		ac.setVolumn(5);
		ac.setVolumn(-1);
		ac.setVolumn(11);
		ac.turnOff();
	}

}