/*
 * 쓰레드 이름:
 * 1. 기본 : Thread-n
 *    - n : 임의의 번호 부여
 * 2. Thread.setName(String name)
 *    - 쓰레드 이름을 부여할 수 있다.   
 */
package tnames;

public class ThreadT1 extends Thread {
	public ThreadT1() {
		super.setName("ThreadT1");
	}

	@Override
	public void run() {
		for (int cnt = 0; cnt < 5; cnt++) {
			String tname = super.getName();
			System.out.printf("ThreadT1:(%s)(%d)%n", tname, cnt);
		}
	}

}