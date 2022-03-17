/*
 * 스레드 우선순위:
 *   - 1부터 10까지
 *   - 1은 가장 낮은 우선순위
 *   - 10은 가장 높은 우선순위
 * 상수값:
 *   - Thread.MIN_PRIORITY  : 1
 *   - Thread.NORM_PRIORITY : 5(기본값)
 *   - Thread.MAX_PRIORITY  : 10
 */
package priorities;

public class CalcThreadRun {
	final static int MAX_COUNT = 1000000000; // 10억

	public static void main(String[] args) {
		for(int cnt=0; cnt < 10; cnt++) {
			String tname = String.format("T1-%d", cnt);
			Thread t1 = new CalcThread(tname, MAX_COUNT);
			
			if(cnt >= 9) {
				t1.setPriority(Thread.MAX_PRIORITY);
			}
			else if(cnt < 5) {
				t1.setPriority(Thread.MIN_PRIORITY);
			}
			
			System.out.printf("[%s] priority(%d)%n", t1.getName(), t1.getPriority());
			t1.start();
		}

	}

}