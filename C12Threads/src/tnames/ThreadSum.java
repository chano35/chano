/*
 * 쓰레드 이름으로 관리
 * (인자)
 * 1. 쓰레드 이름
 * 2. 카운트
 */
package tnames;

public class ThreadSum extends Thread {
	private int count;
	private int sum;

	public ThreadSum(String tname, int count) {
		super.setName(tname);
		this.count = count;
	}

	@Override
	public void run() {
		for (int cnt = 0; cnt <= this.count; cnt++) {
			this.sum += cnt;
		}

		System.out.printf("ThreadSum(END): tname(%s), sum(%d)%n", getName(), this.sum);
	}

	public int sum() {
		return this.sum;
	}

}