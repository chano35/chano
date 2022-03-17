package statecontrols.yields;

public class ThreadA extends Thread {
	
	public boolean stop = false;
	public boolean work = true;
	@Override
	public void run() {
		while(stop != true) {
			if(work) {
				System.out.println("[ThreadA] Working...");
				
			}
			else {
				System.out.println("[ThreadA] yield...");
				Thread.yield();
				
			}
			try {
				Thread.sleep(1000);
			}
			catch(InterruptedException e) {
				
			}
			try {
				Thread.sleep(1000);
			}
			catch(InterruptedException e) {
				
			}
		}
		
		System.out.println("[ThreadA] stop.");
	}
	
	
	
	

}
