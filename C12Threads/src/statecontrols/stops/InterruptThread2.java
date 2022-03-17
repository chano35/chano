/*
 * Thread.interrupted()가 호출되면 InterruptedException 예외가 발생하므로
 * 예외처리에서 종료를 하면 된다.
 */
package statecontrols.stops;

public class InterruptThread2 extends Thread {
	boolean stop = false;

	@Override
	public void run() {
		while (stop != true) {
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				System.out.println("[InterruptThread] InterruptedException: " + e.getMessage());
				stop = true;
			}
		}

		System.out.println("[InterruptThread] interrupted & stoped...");
	}

}