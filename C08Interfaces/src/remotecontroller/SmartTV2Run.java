package remotecontroller;

public class SmartTV2Run {

	public static void main(String[] args) {
		smartTV2();
		remoteControl();
		searchable();
	}
	
	static void smartTV2() {
		System.out.println("[smartTV2]");
		SmartTV2 tv = new SmartTV2();
		tv.turnOn();
		tv.setVolumn(10);
		tv.search("daum.net"); // interface Searchable
		tv.turnOff();
	}
	
	static void remoteControl() {
		System.out.println("[remoteControl]");
		RemoteControl tv = new SmartTV2();
		tv.turnOn();
		tv.setVolumn(10);
		// The method search(String) is undefined for the type RemoteControl
		// tv.search("daum.net"); // interface Searchable
		tv.turnOff();
	}
	
	static void searchable() {
		System.out.println("[searchable]");
		Searchable tv = new SmartTV2();
		// tv.turnOn();
		// tv.setVolumn(10);
		
		tv.search("daum.net"); // interface Searchable
		
		// tv.turnOff();
	}

}