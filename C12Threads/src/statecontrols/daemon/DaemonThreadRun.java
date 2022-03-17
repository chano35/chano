/*
 * Thread.interrupt()
 *  - InterruptedException 예외를 발생(먼저 처리)
 *  - Thread.interrupted()에서 true 리턴
 *  - Thread.setDaemon(true)를 Thread.start()를 하기전에 호출해야 한다. 
 *  - 종료는 되지만 메인 스레드 보다는 나중에 종료
 */
package statecontrols.daemon;

public class DaemonThreadRun {

	public static void main(String[] args) {
		DaemonThread thread = new DaemonThread();
		thread.setDaemon(true); // 데몬 스레드 지정
		thread.start();

		try {
			System.out.println("Main Thread Start...");
			Thread.sleep(500);

			// thread.setStop(true);
			// thread.interrupt();
			// thread.join();
		} catch (InterruptedException e) {
		}

		System.out.println("The end main thread");

	}

}