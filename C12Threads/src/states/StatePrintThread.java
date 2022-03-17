package states;

public class StatePrintThread extends Thread {
	private Thread targetThread;
	
	public StatePrintThread(Thread targetThread) {
		this.targetThread = targetThread;
	}
	
	@Override
	public void run() {
		while(true) {
			Thread.State state = targetThread.getState();
			System.out.println("[StatePrintThread] targetThread.state=" + state);
			
			if(state == Thread.State.NEW ) {
				targetThread.start();
				System.out.println("[StatePrintThread] targetThread.state=" + targetThread.getState()); // RUNNABLE
			}
			
			if(state == Thread.State.TERMINATED) {
				break;
			}
			
			try  {
				// ((TargetThread)targetThread).loopCount();
				Thread.sleep(500);
			}
			catch(InterruptedException e) {}
		}
	}

}