package statecontrols.queues;

public class ProducerThread extends Thread {
	private MessageBox msgBox;
	private boolean stop = false;
	private int count = 1;

	public ProducerThread(MessageBox msgBox) {
		this.msgBox = msgBox;
	}

	@Override
	public void run() {
		while (stop != true && count <= 100) {
			String msg = String.format("msg-%d", count++);
			this.msgBox.setMessage(new Message("실행", msg));

			// System.out.printf(">>>> count=%d\n", count);
		}

		// System.out.println("[Producer] end...");
		this.msgBox.setMessage(new Message("종료", "작업완료"));
		System.out.println("[END PRODUCER]");
	}

}