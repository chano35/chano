package remotecontroller;

public class TVAudioRun {

	public static void main(String[] args) {
		RemoteControl tv = new Television("TV7090");
		tv.turnOn();
		tv.setVolumn(8);
		tv.turnOff();
		
		RemoteControl ac = new AudioControl();
		ac.turnOn();
		ac.setVolumn(5);
		ac.setVolumn(-1);
		ac.setVolumn(11);
		ac.turnOff();
	}

}