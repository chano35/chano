package statecontrols.notifies;

public class DataBox {
	private String data;
	
	public synchronized String getData() {
		// data 필드가 null이면 고비자 스레드를 일시 정지 상태로 만듦
		if(this.data == null) {
			try {
				wait();
			}
			catch(InterruptedException e) {
				
			}
		}
		// data 필드를 null 만들고 생산자 스레드를 실행 대기 상태로 만듦
		String returnVal = data;
		System.out.println("Consumer : read data = " + returnVal);
		data = null;
		notify();
		return returnVal;
	}
	
	public synchronized void setData(String data) {
		if(this.data != null) {
			try {
				wait();
			}
			catch(InterruptedException e) {
				
			}
		}
		
		this.data = data;
		System.out.println("Producer : data=" + data);
		notify();
		
	}

}
