package remotecontroller;

public class AudioControl implements RemoteControl {
	private int volumn = RemoteControl.MIN_VALUE;
	private boolean powerOn;
	
	// RemoteControl의 추상 메소드를 구현해야 한다.
	@Override
	public void turnOn() {
		System.out.println("Audio 켜기");
		this.powerOn = true;
	}

	@Override
	public void turnOff() {
		System.out.println("Audio 끄기");
		this.powerOn = false;
	}
	
	@Override
	public void setVolumn(int volumn) {
		if(powerOn != true) {
			System.out.println("전원이 켜저 있지 않습니다.");
			return;
		}
		
		System.out.print("Audio 볼륨조절:");
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

}