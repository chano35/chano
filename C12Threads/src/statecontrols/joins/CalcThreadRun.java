/*
 * [join]
 * - 스레드가 종료할 때까지 기다림
 * - Thread.join()
 */
package statecontrols.joins;

public class CalcThreadRun {
	final static long MAX_COUNT = 100000L; // 10만
	final static long SUM_TOTAL = MAX_COUNT * (MAX_COUNT + 1) / 2;

	public static void main(String[] args) {
		CalcThread calcThread = new CalcThread("t10", MAX_COUNT);
		calcThread.start();
		
		try {
			calcThread.join();
		}
		catch(InterruptedException e) {
		}
		
		System.out.printf("CalThread: [%s], total(%.0f), sum(%d)%n", 
				calcThread.getName(), calcThread.total(), SUM_TOTAL);
	}
}