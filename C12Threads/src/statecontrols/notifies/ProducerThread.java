package statecontrols.notifies;

public class ProducerThread extends Thread {
	private DataBox dataBox;
	
	public ProducerThread (DataBox dataBox) {
		this.dataBox = dataBox;
	}

	@Override
	public void run() {
		for ( int cnt = 0; cnt <3; cnt++) {
			String data = String.format("data-%d", cnt);
			this.dataBox.setData(data);
	}
	
	}
}
