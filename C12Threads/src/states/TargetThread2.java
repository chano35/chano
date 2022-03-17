package states;

public class TargetThread2 extends Thread {
	private int loop;
	
	@Override
	public void run() {
		for(int cnt = 0; cnt < 10; cnt++) {
			loopCount();
			
			try {
				Thread.sleep(1500); // 1.5초 일시정지(TIMED_WAITING)
			}
			catch(InterruptedException e) {}
		}
	}
	
	// 동기화 메소드
	public synchronized void loopCount() {
		for(long cnt=0; cnt < 1000000000; cnt++) { // 10억
		}
		
		this.loop += 1;
		System.out.println("[TargetThread] loop=" + this.loop);
	}

}