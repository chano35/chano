package remotecontroller;

public class SmartTelevisionRun {

	public static void main(String[] args) {
		smartTelevision();
		remoteControl();
		searchable();
		remoteControlSearchable();
	}
	
	static void smartTelevision() {
		System.out.println("[smartTelvision]");
		SmartTelevision tv = new SmartTelevision();
		tv.turnOn();
		tv.setVolumn(10);
		tv.search("daum.net"); // interface Searchable
		tv.turnOff();
	}
	
	static void remoteControl() {
		System.out.println("[remoteControl]");
		RemoteControl tv = new SmartTelevision();
		tv.turnOn();
		tv.setVolumn(10);
		// The method search(String) is undefined for the type RemoteControl
		// tv.search("daum.net"); // interface Searchable
		tv.turnOff();
	}
	
	static void searchable() {
		System.out.println("[searchable]");
		Searchable tv = new SmartTelevision();
		// tv.turnOn();
		// tv.setVolumn(10);
		
		tv.search("daum.net"); // interface Searchable
		
		// tv.turnOff();
	}
	
	/*
	 * 통합된 인터페이스로 접근
	 */
	static void remoteControlSearchable() {
		System.out.println("[remoteControlSearchable]");
		RemoteControlSearchable tv = new SmartTelevision();
		tv.turnOn();
		tv.setVolumn(10);
		tv.search("daum.net");
		tv.turnOff();
	}
	

}