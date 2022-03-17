/*
 * 1. 추상클래스 SmartTV의 자식 클래스를 정의
 * 2. 객체를 만들어 실행
 */
package remotecontroller;

public class SmartLG extends SmartTV {
	
	@Override
	public void setVolumn(int volumn) {
		System.out.println("SmartLG: volumn");
	}

	public static void main(String[] args) {
		System.out.println("[lg]");
		SmartLG lg = new SmartLG();
		lg.turnOn();
		lg.setVolumn(5);
		lg.turnOff();
		
		System.out.println("[tv]");
		SmartTV tv = new SmartLG();
		tv.turnOn();
		tv.setVolumn(5);
		tv.turnOff();
		
		System.out.println("[rc] best way");
		RemoteControl rc = new SmartLG();
		rc.turnOn();
		rc.setVolumn(5);
		rc.turnOff();

	}

}