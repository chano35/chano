/*
 * 데몬 스레드:
 * - 메인 스레드가 종료되면 강제로 자동 종료
 * - 자동으로 Thread.interrupted()나 InterruptedException이 발생되지 않음
 */
package statecontrols.daemon;

public class DaemonThread extends Thread {
	private boolean stop = false;

	public synchronized void setStop(boolean stop) {
		this.stop = stop;
	}

	@Override
	public void run() {
		while (stop != true) {
			/*
			 * if(Thread.interrupted()) {
			 * System.out.println("[DaemonThread] interrupted!!!"); break; }
			 */

			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				System.out.println("[InterruptThread] InterruptedException: " + e.getMessage());
				break;
			}

		}

		System.out.println("[DaemonThread] stoped...");
	}

}