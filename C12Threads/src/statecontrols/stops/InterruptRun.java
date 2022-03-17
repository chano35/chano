/*
 * Thread.interrupt()
 *  - InterruptedException 예외를 발생(먼저 처리)
 *  - Thread.interrupted()에서 true 리턴
 */
package statecontrols.stops;

public class InterruptRun {

	public static void main(String[] args) {
		Thread thread = new InterruptThread();
		thread.start();

		try {
			Thread.sleep(3000);
			thread.interrupt();
			thread.join();
		} catch (InterruptedException e) {
		}

		System.out.println("THE END");

	}

}