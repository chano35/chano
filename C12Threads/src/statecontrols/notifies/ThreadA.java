package statecontrols.notifies;

public class ThreadA extends Thread {

	WorkObject workobj;

	public ThreadA(WorkObject workobj) {
		this.workobj = workobj;
	}

	@Override
	public void run() {
		for (int cnt = 0; cnt < 10; cnt++) {
			this.workobj.methodA();
			try {
				Thread.sleep(1000);
			}
			catch(InterruptedException e) {
				
			}

		}
	}

}
