/*
 * 1. 인터페이스 RemoteControl의 구현 클래스를 만든다.
 * 2. 모델명 추가 
 */
package remotecontroller;

public class Television implements RemoteControl {
	private int volumn = RemoteControl.MIN_VALUE;
	private boolean powerOn;
	private String model;
	private boolean mute;
	
	Television() {}
	Television(String model) {
		this.model = model;
	}
	
	@Override
	public void turnOn() {
		System.out.printf("[%s] TV 켜기\n", this.model);
		this.powerOn = true;
	}

	@Override
	public void turnOff() {
		System.out.printf("[%s] TV 끄기\n", this.model);
		this.powerOn = false;
	}
	
	@Override
	public void setVolumn(int volumn) {
		if(powerOn != true) {
			System.out.printf("[%s] TV 전원이 켜저 있지 않습니다.\n", this.model);
			return;
		}
		
		System.out.printf("[%s] TV 볼륨조절:", this.model);
		if(volumn > RemoteControl.MAX_VALUE) {
			this.volumn = RemoteControl.MAX_VALUE;
		}
		else if(volumn < RemoteControl.MIN_VALUE) {
			this.volumn = RemoteControl.MIN_VALUE;
		}
		else {
			this.volumn = volumn; 
		}
		
		System.out.println(" volumn=" + this.volumn);
	}
	
	/*
	 * 인터페이스에서 추가된 디폴트 메소드 
	 */
	@Override
	public void setMute(boolean mute) {
		this.mute = mute;
		if(this.mute) {
			System.out.printf("[%s] 무음모드\n", this.model);
		}
		else {
			System.out.printf("[%s] 무음해제\n", this.model);
		}
	}

}