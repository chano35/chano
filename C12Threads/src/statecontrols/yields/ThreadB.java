package statecontrols.yields;

public class ThreadB extends Thread {
	
	public boolean stop = false;
	public boolean work = true;
	@Override
	public void run() {
		while(stop != true) {
			if(work) {
				System.out.println("[ThreadB] Working...");
				
			}
			else {
				System.out.println("[ThreadB] yield...");
				Thread.yield();
				
			}
			try {
				Thread.sleep(1000);
			}
			catch(InterruptedException e) {
				
			}
			try {
				Thread.sleep(1000*5);
			}
			catch(InterruptedException e) {
				
			}
		}
		
		System.out.println("[ThreadB] stop.");
	}
	
	
	
	

}
