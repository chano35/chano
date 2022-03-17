package statecontrols.notifies;

public class ConsumerThread extends Thread {
private DataBox dataBox;
	
	public ConsumerThread(DataBox dataBox) {
		this.dataBox = dataBox;
	}

	@Override
	public void run() {
		for ( int cnt = 0; cnt <3; cnt++) {
			String data = this.dataBox.getData();
	}
	}
}



