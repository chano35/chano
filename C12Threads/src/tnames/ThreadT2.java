package tnames;

public class ThreadT2 extends Thread {
	public ThreadT2() {
		// super.setName("ThreadT2");
	}

	@Override
	public void run() {
		int sum = 0;
		for (int cnt = 0; cnt <= 10; cnt++) {
			String tname = super.getName();
			sum += cnt;
			System.out.printf("ThreadT2:tname(%s), cnt(%d), sum(%d)%n", tname, cnt, sum);
		}
	}

}