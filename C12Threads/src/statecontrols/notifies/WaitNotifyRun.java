package statecontrols.notifies;

public class WaitNotifyRun {

	public static void main(String[] args) {
		WorkObject sharedWorkobj = new WorkObject();
		
		ThreadA ta = new ThreadA(sharedWorkobj);
		ThreadB tb = new ThreadB(sharedWorkobj);
		ta.start();
		tb.start();
		
	}

}
