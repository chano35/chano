package remotecontroller;

public class TelevisionRun {

	public static void main(String[] args) {
		Television tv = new Television("TV7090");
		tv.turnOn();
		tv.setVolumn(8);
		tv.turnOff();
	}

}