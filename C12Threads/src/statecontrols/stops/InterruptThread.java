/*
 * Thread.interrupted()을 처리가 하기 위해서는 
 * catch(InterruptedException e) {} 가 있으면 안됨
 */
package statecontrols.stops;

public class InterruptThread extends Thread {

	@Override
	public void run() {
		while (true) {
			if (Thread.interrupted()) {
				System.out.println("[InterruptThread] interrupted!!!");
				break;
			}

			/*
			 * try { Thread.sleep(500); } catch(InterruptedException e) { // 예외 처리가 있으면
			 * Thread.interrupted()가 처리 되지 않음
			 * System.out.println("[InterruptThread] InterruptedException: " +
			 * e.getMessage()); }
			 */

		}

		System.out.println("[InterruptThread] interrupted & stoped...");
	}

}